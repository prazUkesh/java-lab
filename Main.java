class Customer{
    double  balance = 5000;
    synchronized  void withdraw (double amount){
        if(amount> balance){
            try {
                wait();
            } catch(Exception e) {
            System.out.println("Exception caught: "+e);
            }
        }
        balance-=amount;
        System.out.println("withdrawn: "+amount);
        System.out.println("balance "+balance);
        
    }
}


synchronized void deposit(double amount){
    System.out.println("Depositing: "+amount);
    balance += amount;
    System.out.println("deposited "+amount);
    System.out.println("balance "+balance);
}

public class Main
{
	public static void main(String[] args) {
		Customer c  = new Customer();
		Thread t1= new Thread(new Runnable(){
		    public void run(){
		         c.withdraw(1000);
		    }
		});
		
		Thread t2 = new Thread(new Runnable(){
		    public void run(){
		        c.deposit(15000);
		    }
		});
	}
}
