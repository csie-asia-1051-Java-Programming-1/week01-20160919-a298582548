package hw;
/*
 * Topic:  請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021010 邱信喆
 */

import java.util.Scanner;
import java.util.Random;
public class hw02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		Random rnd=new Random();
		int v1 =rnd.nextInt(10)+1;
		int v2 =rnd.nextInt(10)+1;
		int v3 =rnd.nextInt(10)+1;
		int v4 =rnd.nextInt(10)+1;
		int v5 =rnd.nextInt(10)+1;
		int v6 =rnd.nextInt(10)+1;
		System.out.println(v1+(" ")+v2+(" ")+v3+(" ")+v4+(" ")+v5+(" ")+v6);
		

	}

}
