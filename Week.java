package com.unit1.test;

import java.util.Scanner;

/*�Ӽ��̽��������������������Ϊ1��7����ӡ���Ӧ������ֵ�������ӡ���Ƿ�������
 * 
 */
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("�������ѯ�ı��:");
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
