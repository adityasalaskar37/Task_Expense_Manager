package com.main;

import com.user.User;
import com.customer.Customer;
import com.account.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bank Management System...🙏");
        System.out.println("Register a new user:");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        boolean isRegistered = User.registerUser(username, password);
        System.out.println("User registration successful: " + isRegistered);
        
        System.out.println("\nLogin with the registered user:");
        System.out.print("Enter username: ");
        String loginUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = sc.nextLine();
        User loggedInUser = User.loginUser(loginUsername, loginPassword);
        if (loggedInUser != null) {
            System.out.println("User logged in successfully: " + loggedInUser.getUsername());
        } else {
            System.out.println("Login failed.");
        }
        Customer customer = null;
        Account account = null;
        while(true) {
        	System.out.println("Choose Operation:\n1. Create new Account\n2. View Profile\n3. View Account\n4. Perform Transactions\n5. Log Out");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1:
            	System.out.println("\nCreate a new customer profile:");
                System.out.print("Enter customer ID: ");
                String customerId = sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Enter email: ");
                String email = sc.nextLine();
                customer = Customer.createCustomerProfile(customerId, name, address, phoneNumber, email);
                System.out.println("Customer profile created:");
                
                System.out.println("\nCreate a new account for the customer:");
                System.out.print("Enter account ID: ");
                String accountId = sc.nextLine();
                System.out.print("Enter account type: ");
                String accountType = sc.nextLine();
                System.out.print("Enter initial balance: ");
                double initialBalance = sc.nextDouble();
                account = Account.createAccount(accountId, accountType, initialBalance);
                System.out.println("Account created:");
                break;
                
            case 2:
            	if(customer == null) {
            		System.out.println("No accounts");
            	}else {
            		System.out.println(customer.viewCustomerProfile());            		
            	}
            	break;
            	
            case 3:
            	if(account == null) {
            		System.out.println("No accounts");
            	}else {
            		System.out.println(account.viewAccountDetails());
            	}
            	break;

            case 4:
            	if(account == null) {
            		System.out.println("No accounts");
            	}else {
            		System.out.println("1. Deposit Money\n2. Withdraw Money");
                	int choice2 = sc.nextInt();
                	sc.nextLine();
                	switch(choice2) {
                	case 1:
                		System.out.println("\nDeposit money into the account:");
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.depositMoney(depositAmount);
                        System.out.println("After depositing money:");
                        System.out.println(account.viewAccountDetails());
                        break;
                        
                	case 2:
                		System.out.println("\nWithdraw money from the account:");
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdrawMoney(withdrawAmount);
                        System.out.println("After withdrawing money:");
                        System.out.println(account.viewAccountDetails());
                        break;
                        
                	default:
                		System.out.println("Wrong choice");
                	}
            	}
            	break;
            	
            case 5:
            	System.exit(0);
            	
            default:
            	System.out.println("Wrong Choice");
            }
        }
    }
}
