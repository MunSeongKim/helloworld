package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int money = s.nextInt();
		int result[] = new int[10];
		boolean sw = true;
		int flag = 50000;
		for(int i = 0; i < 10; i++){
			result[i] = money / flag;
			money = money - (result[i] * flag);
			if(sw == true){
				System.out.println(flag + "원: " + result[i] + "개");
				flag = flag / 5;
				sw = false;
			} else {
				System.out.println(flag + "원: " + result[i] + "개");
				flag = flag / 2;
				sw = true;
			}
		}
		

	}

}
