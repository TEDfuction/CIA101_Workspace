package hw11;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Quethree {
	public void showDateByType() {
		System.out.println("請輸入日期(年月日，例如:20110131): ");
		Scanner sc = new Scanner(System.in);
		String date = sc.next();

		SimpleDateFormat temp = new SimpleDateFormat("yyyymmdd");
		Date dat = null;
		while (dat == null) {
			while (!date.matches("(19|20)[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])")) {
				System.out.println("數字格式不正確");
				date = sc.next();
			}
			try {
				dat = temp.parse(date);
			} catch (ParseException e) {
			}
		}
		Format fm1 = new SimpleDateFormat("yyyy/MM/dd");
		Format fm2 = new SimpleDateFormat("MM/dd/yyyy");
		Format fm3 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("想要的輸出格式化成 (1)年/月/日(2)月/日/年(3)日/月/年 三選一");
		int choice = sc.nextInt();
		while(!(choice == 1 || choice == 2 || choice ==3)) {
			System.out.println("選項錯誤, 請重新選擇其中之一(1)年/月/日(2)月/日/年(3)日/月/年");
			choice = sc.nextInt();
		}
		switch(choice) {
		case 1:
			System.out.println("年/月/日: " + fm1.format(dat));
			break;
		case 2:
			System.out.println("月/日/年: " + fm2.format(dat));
			break;
		case 3:
			System.out.println("日/月/年: " + fm3.format(dat));
			break;
			
		}
		sc.close();

	}
}
