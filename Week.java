package com.unit1.test;

import java.util.Scanner;

/*从键盘接受整数参数，如果该数为1—7，打印相对应的星期值，否则打印“非法参数”
 * 
 */
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入查询的编号:");
		 int week = input.nextInt();
		 String weekstring;
		 switch(week) {
		 case 1: weekstring = "Monday";
		         break;
		 case 2: weekstring = "Tuesday";
				 break;
		 case 3: weekstring = "Wednesday";
		         break;
		 case 4: weekstring = "Thursday";
		         break;
		 case 5: weekstring = "Friday";
		         break;
		 case 6: weekstring = "Saturday";
		         break;
		 case 7: weekstring = "Sunday";
		         break;
		 default: weekstring = "Invalid Week";
		         break;
		 
		 }
		 
		 System.out.println(weekstring);
		 
         
	}

}
