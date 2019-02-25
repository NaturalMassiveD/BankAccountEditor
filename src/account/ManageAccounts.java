/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author teel6
 */
public class ManageAccounts {

    public static void main(String[] args) {
        Account account1 = new Account("Sally", 1000, 1111);
        Account account2 = new Account("Joe", 500, 1234);
        
        System.out.println("Initial:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        
        account2.deposit(100);
        System.out.println("After a deposit of $100 Joe has " + account2.getBalance());
        
        account1.withdraw(50);
        System.out.println("After a withdrawal of $50 Sally has " + account1.getBalance());
        
        System.out.println("After fees:");
        System.out.println("Sally's balance is " + account1.chargeFee());
        System.out.println("Joe's balance is " + account2.chargeFee());
        
        System.out.println("Joe is now known as " + account2.changeName("Joseph"));
        
        System.out.println("Summary:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }

}
