package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		float v1 =scn.nextFloat();
		float v2 =scn.nextFloat();
		float v3 =scn.nextFloat();
		float v4 =scn.nextFloat();
		float v5 =scn.nextFloat();
		float v6 =scn.nextFloat();
		float a =Math.round(Math.min(v1, v2));
		float b =Math.round(Math.min(v3, v4));
		float c =Math.round(Math.min(v5,v6));
		float d =(Math.min(a,b));
		System.out.print(Math.min(c, d));
		
		
				
				

	}

}
