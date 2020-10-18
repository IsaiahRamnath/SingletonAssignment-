
package bank;


public class Singleton {
    
     //Private instance
    private static Singleton instance = null;
    
    private Singleton (){
        
    }
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        //System.out.println("instance is created");
    return instance;
    }
    
    
    
   //Deposit, Withdraw and Exit
    
   private double balance = 10000.00;


   
   //DEPOSIT
   public void deposit(double amount){
       if (amount <= 1){
           System.err.println("Restricted to deposit $1.00 or more.");
       }
       else{
           balance += amount;
           System.err.println("Successful, Your balance is $" + balance);
       }
   }
   
   //WITHDRAW
   public void withdraw(double num){
       if (num <= 0){
           System.err.println("Unsuccessful withdrawal. Please enter valid amount.");
       }
       else{
           balance -= num;
           System.err.println("Successful withdrawal. Your balance is $" + balance);
       }
   }
   
   //BALANCE
   public double getBalance(){
       System.out.print("$" + balance);
       return balance;
   }
   
   //EXIT
   public void exit(){
       System.out.println("\t Thank you for your service");
   
}
}
        

    

