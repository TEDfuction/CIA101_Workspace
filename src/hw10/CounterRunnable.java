package hw10;

public class CounterRunnable implements Runnable {
    int counter = 0; // 記錄吃了多少碗飯
    String name; // 參賽者名稱

    // 無參數建構函數
    public CounterRunnable() {
    }

    // 帶參數的建構函數，初始化參賽者名稱
    public CounterRunnable(String name) {
        this.name = name;
    }
    
    // 執行緒的邏輯
    public void run() {
        while (counter < 10) { // 當吃的碗數小於10時執行循環
            counter++; // 增加吃飯的碗數
            System.out.println(name + "吃第" + counter + "碗飯"); // 輸出參賽者吃飯的訊息

            try {
                // 隨機等待一段時間，模擬吃飯的時間
                long time = (long)(Math.random()*2501)+500;
                Thread.sleep(time);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String arg[]) {
        System.out.println("-----大胃王快食比賽開始!------");
        // 建立兩個執行緒，代表兩位參賽者
        Thread t1 = new Thread(new CounterRunnable("饅頭人"));
        Thread t2 = new Thread(new CounterRunnable("詹姆士"));
        t1.start(); // 啟動第一個執行緒
        t2.start(); // 啟動第二個執行緒

        try {
            // 等待兩個執行緒執行完畢
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        // 輸出比賽結束的訊息
        System.out.println("-----大胃王快食比賽結束!------");
    }
}