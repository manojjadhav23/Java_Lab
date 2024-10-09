package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Account;

public class AccountServiceImpl implements AccountService {
	Scanner sc=new Scanner(System.in);
	static Account[] acarr=new Account[5];
	static int cnt;
	
	static {
		acarr[0]=new Account(101,"manoj",10000,4535);
		acarr[1]=new Account(102,"harsh",11000,4536);
		cnt=2;
	}
	
	@Override
	public void AddNewAccount() {
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
	    System.out.println("enter balance");
		double balance=sc.nextDouble();
		System.out.println("enter pin");
		int pin=sc.nextInt();
	    
		acarr[cnt]=new Account(id,name,balance,pin);
		cnt++;
	}

	@Override
	public void DisplayAll() {
		for(Account a:acarr)
		{
			if(a!=null)
			System.out.println(a);
			else
			break;
			
			
		}
		
	}

	@Override
	public void DeleteById() {
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter pin:");
		int pin=sc.nextInt();
		for(int i=0;i<cnt;i++)
		{
			if((id==acarr[i].getAcid())&&(pin==acarr[i].getPin()))
			{
				for(int j=i;j<cnt;j++)
				{
					acarr[j]=acarr[j+1];
				}
		      System.out.println("account delete sucessful:");
		      cnt--;
			}
			}
		}

	@Override
	public double CheckBalance() {
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter pin:");
		int pin=sc.nextInt();
		for(int i=0;i<cnt;i++)
		{
			if((id==acarr[i].getAcid())&&(pin==acarr[i].getPin()))
			{
				
					double bal=acarr[i].getBalance();
					System.out.println("balance is"+bal);
					return 1;
				
			}
			}System.out.println("Account not found");
			return 0;
			
			
	}
		
	}


