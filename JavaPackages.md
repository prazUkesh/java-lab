# core java packages

### java.lang (all wrapper class except math)
  - math
  - byte
  - short
  - integer
  - double
  - float
  - character
  - boolean
> wrapper class: encapsulate a primitive type into an object

> Primitive types are passed to a function by value whereas wrapper class are passed by reference, 
Wrapper class can be used as type parameter in generic programming but primitive type cannot be used. 

```
public class MyApp {
 public static void main(String[] args) {
    System.out.println("absolute val: "+Math.abs(-5));
    System.out.println("squre root val: "+Math.sqrt(16));
    System.out.println("cube root val: "+Math.cbrt(-5));
    System.out.println("power val: "+Math.pow(16,3));
    System.out.println("floor val: "+Math.floor(4.6));
    System.out.println("celing val: "+Math.ceil(13.3));
    System.out.println("max val: "+Math.max(-5,9));
    System.out.println("min root val: "+Math.min(16,4));
 }   
}


```

### java.util
  - scanner
  - vector
  - hashtable
  - dictionary
  - enumeration
  - random
  - stack

```
import java.util.*;

public class MyApp {
 public static void main(String[] args) {

    Stack s = new Stack();
    s.push(10);
    s.push(30);
    s.push(20);

    System.out.println("stack: "+s);
    s.pop();
    s.peek();
    System.out.println("stack: "+s);
 }
}

```

### Java.util.Vector
vector implements a dynamic array
```
import java.util.*;

public class MyApp {
 public static void main(String[] args) {

    Vector v = new Vector();
    v.add(1);
    v.add(6);
    v.add(9);
    v.add("sigma");
    v.add("bombaclattt");
    System.out.println(v);
    System.out.println("item at index 0: "+v.get(0));

    v.clear();
}
}
```

### hashtable & dictionary
```

public class MyApp {
 public static void main(String[] args) {

   Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
   ht.put(1,"A");
   ht.put(2,"B");
   ht.put(3,"C");
   ht.put(4,"D");
   ht.put(5,"E");
   System.out.println(ht);

   Dictionary<Integer, String> dc = new Hashtable<Integer, String>();
   dc.put(1,"A");
   dc.put(2,"B");
   dc.put(3,"C");
   dc.put(4,"D");
   dc.put(5,"E");
   System.out.println(dc);
}
}
```

### enumeration

```
 
import java.util.*;


public class App {
    public static void main(String[] args)  {
       Vector v = new Vector();
       v.add(1);
       v.add(2);
       v.add(3);
       v.add(4);
       v.add(5);
      Enumeration v1 = v.elements();
       while(v1.hasMoreElements()){
           System.out.println(v1.nextElement());
       }
    }
}
```

