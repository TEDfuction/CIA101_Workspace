package hw11;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

class Quetwo {
     public void showNumByType() {
    	
    	 System.out.println("請輸入數字");
    	 Scanner sc = new Scanner(System.in);
    	 String str = sc.next();
    	 while(!str.matches("-?\\d+(\\.\\d+)?")) {
    		 System.out.println("數字格式不正確, 請再輸入一次");
    		 str = sc.next();
    	 }
    	 double num = Double.parseDouble(str);
    	 Format fm1 = new DecimalFormat("#,###.00");
    	 Format fm2 = new DecimalFormat("##0.00%");
    	 Format fm3 = new DecimalFormat("0.##E0");
    	 System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
    	 int choice = sc.nextInt();
    	 while(!(choice ==1 || choice ==2 || choice==3)) {
    		 System.out.println("選項錯誤, 請重新選擇");
    		 choice = sc.nextInt();
    	 }
    	 switch(choice) {
    	 case 1:
    		 System.out.println(fm1.format(num));
    		 break;
    	 case 2:
    		 System.out.println(fm2.format(num));
    		 break;
    	 case 3:
    		 System.out.println(fm3.format(num));
    		 break;
    	 }
    	 sc.close();
     }
}
