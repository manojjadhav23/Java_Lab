package com.demo.test;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class TestAccount {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		AccountService acService=new AccountServiceImpl();
		LoginService lsService=new LoginServiceImpl();
		System.out.println("Enter USername:");
		String uname = sc.next();
		System.out.println("Enter Password:");
		String pass = sc.next();
		String role= lsService.autheticate(uname,pass);
		int choice=0;
		if(role.equals("user")) {
			do {
				   System.out.println("1.Open new account\n2. withdraw amt\n3. deposit amount\n4. transfer funds\n");
				   System.out.println("5.change pin\n6. check balance\n7. close account\n8. display all\n9 exit\nchoice");
				   choice=sc.nextInt();
				   switch(choice) {
				   case 1:
					   System.out.println("1.Saving \n2.Current \nChoice:");
					   int ch=sc.nextInt();
					   boolean status=acService.OpenNewAccount(ch);
					   if(status) {
						   System.out.println("Account opening done");
					   }else{
						   System.out.println("error occured");
					   }
					   break;
					   
				   case 2:
					   System.out.println("Enter Name:");
					   String name=sc.next();
					   System.out.println("Enter pin");
					   int pin=sc.nextInt();
					   System.out.println("Enter Amount to Withdraw");
					   Double amt=sc.nextDouble();
					   int ans=acService.WithdrawAmount(name,pin,amt);
					   if(ans==1) {
						   System.out.println("withdrawal done");
					   }else if(ans==2) {
						   System.out.println("insuffitient balance");   
					   }else {
						   System.out.println("wrong credentials");
					   }
					   break;
					   
				   case 3:
					   System.out.println("Enter Name:");
					    name=sc.next();
					   System.out.println("Enter pin");
					    pin=sc.nextInt();
					   System.out.println("Enter Amount to deposit");
					    amt=sc.nextDouble();
					    double ans1=acService.DepositAmount(name,pin,amt);
					   if(ans1==1) {
						   System.out.println("deposit done");   
					   }else {
						   System.out.println("wrong credentials");
					   }
					   break;
					   
				   case 4:
					   System.out.println("enter uname of source account");
					   uname=sc.next();
					   System.out.println("enter uname of destination account");
					   String duname=sc.next();
					   System.out.println("enter user pin of source account");
					   pin=sc.nextInt();
					   System.out.println("enter amt to transfer");
					   amt=sc.nextDouble();
					   boolean status1=acService.transferfund(uname,duname,pin,amt);
					   if(status1){
						   System.out.println("transfer done");
					   }
					   else {

						   System.out.println("transfer false");
					   }
					   break;
					   
				   case 8:
					   Set<Account> sac=acService.DisplayAll();
					   sac.stream().forEach(System.out::println);
					   break;
				   }
		}while(choice!=10);
		
		
	}

	}
}
