package com.learn.automation.selenium;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String args[]){
		
		System.out.println("Denmark vs Australia");
	for(int i=0;i<=1;i++){
		
	Random rand = new Random(); 
	int value = rand.nextInt(6); 
	System.out.println("Score "+value);

	}
	System.out.println("------------- ");
	System.out.println("France vs Peru");
	
	for(int i=0;i<=1;i++){
		Random rand = new Random(); 
		int value = rand.nextInt(6); 
		System.out.println("Score "+value);

		}
	System.out.println("------------- ");
	System.out.println("Argentina vs Crotia");
	for(int i=0;i<=1;i++){
		Random rand = new Random(); 
		int value = rand.nextInt(6); 
		System.out.println("Score "+value);

		}
}

}
