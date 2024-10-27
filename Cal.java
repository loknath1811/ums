package ums;

import java.util.Scanner;

class Cal{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Select Option");
		System.out.println("1 for ADD");
        System.out.println("2 for Substract");
        System.out.println("3 for Exit");
        int choice=sc.nextInt();
        System.out.println("Enter first number:");
     		int one=sc.nextInt();
     		System.out.println("Enter Second Number:");
     		int two=sc.nextInt();
        switch(choice){
            case 1:{
                int result=one+two;
                System.out.println(result);
            }break;
            case 2:{
                int result=one-two;
                System.out.println(result);
            }break;
            case 3:{
            	System.exit(0);
            }
        }
        }
	}
}