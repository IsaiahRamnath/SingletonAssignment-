
package bank;

import java.util.*;

public class Bank {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double b;
        
        //Deposit
        System.out.print("Deposit amount: $");
        
        b = input.nextDouble();
        
        Singleton.getInstance().deposit(b);
        
        //Withdraw
        System.out.print("Withdraw amount: $");
        
        b = input.nextDouble();
        
        Singleton.getInstance().withdraw(b);
        
        //Balance and Exit
        Singleton.getInstance().getBalance();
        Singleton.getInstance().exit();
    }
}
