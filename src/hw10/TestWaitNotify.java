package hw10;

class Account {
	private int balance = 0; // 帳戶餘額

	// 存款方法
	synchronized public void produce(int money) {
		// 如果餘額超過 3000 元，暫停存款，等待消費者提款
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait(); // 等待
				System.out.println("媽媽被熊大要求匯款!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money; // 增加餘額
		System.out.println("媽媽存了：" + money + "；帳戶共有：" + balance);
		notify(); // 喚醒執行緒競爭鎖
	}

	// 提款方法，每次提款 
	synchronized public void consume(int money) {
		// 如果餘額不足，暫停提款，等待存款
		while (balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait(); // 等待
				System.out.println("熊大被老媽告知帳戶有錢了");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money; // 減少餘額
		System.out.println("熊大領了：" + money + "；帳戶共有" + balance);
		// 如果餘額低於 2000 元，通知存款者匯款
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify(); // 喚醒執行緒競爭鎖
		}
	}
}

// 媽媽執行緒，執行存款操作
class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.produce(2000); // 每次存款兩千元
		}
		System.out.println("老媽告知熊大領10次囉");
	}
}

// 熊大執行緒，執行提款操作
class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.consume(1000); // 每次提款一千元
	}
}

public class TestWaitNotify {
	public static void main(String[] args) {
		Account account = new Account(); // 建立帳戶物件
		Mom mom = new Mom(account); // 建立媽媽執行緒
		Son son = new Son(account); // 建立熊大執行緒
		mom.start(); // 啟動媽媽執行緒
		son.start(); // 啟動熊大執行緒
	}
}