class Customer{
  double balance = 5000;
  synchronized void withdraw(double amount){
    if(amount>balance){
      try {
        System.out.println("Insufficient balance, waiting for deposit...");
        wait();
      } catch (Exception e) {
        System.out.println("Exception caught: "+e);

      }
    }
    balance -= amount;
    System.out.println("Withdrawn: "+amount);
    System.out.println("Balance: "+balance);
    
  }

  synchronized void deposit(double amount){
    System.out.println("Depositing: "+amount);
    balance += amount;
    System.out.println("Deposited: "+amount);
    System.out.println("Balance: "+balance);
    notify();
  }
}






public class main{
  public static void main(String[] args) {
    
    Customer c = new Customer();
    Thread t1 = new Thread(new Runnable() {
      public void run() {
        c.withdraw(10000);
      }
      
    } );
    Thread t2 = new Thread(new Runnable() {
      public void run() {
        c.deposit(6000);
      }
      
    } );
    t1.start();
    t2.start();
    
    
    
  }
}
