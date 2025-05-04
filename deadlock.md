```
class DA{
    synchronized void foo(DB b){
        System.out.println("inside DA foo ");
        System.out.println("waiting for DB last...");
        b.last();
    }
    synchronized void last(){
        System.out.println("inside DA last");
    }
}
class DB{
     synchronized void bar(DA a){
        System.out.println("inside DB foo ");
         System.out.println("waiting for DA last...");
        a.last();
    }
    synchronized void last(){
        System.out.println("inside DB last");
    }
}
public class Main{
    public static void main(String[] args){
        DA new = new DA();
        DB new = new DB();
        Thread t1 = new Thread(new Runnable(){
          public void run(){
              a.foo(b);
          }  
        });
        
        Thread t2 = new Thread(new Runnable(){
          public void run(){
              b.foo(a);
          }  
        });
        
        t1.start();
        t2.start();
    }
}
```
