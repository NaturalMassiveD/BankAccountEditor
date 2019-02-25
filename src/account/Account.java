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
public class Account {
    double balance;
    int accountNum;
    String name;
    /**
     * @param amount
     * @return 
     */
    
    public Account(String customer, double money, int acct){
        name = customer;
        balance = money;
        accountNum = acct;
    }
    
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }
    
    public double deposit(double deposit) {
        balance = deposit + balance;
        return balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String toString(){
        String info = new String(name + "'s account number " + accountNum + " has a balance of " + balance);
        return info;
    }
    
    public double chargeFee(){
        double chargeFee = 10.00;
        balance = balance - chargeFee;
        return balance;
    }
    
    public String changeName(String NewName){
        name = NewName;
        return name;
    }
    
}
