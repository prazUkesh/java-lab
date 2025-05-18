# core java packages

- java.lang (all wrapper class except math)
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

- java.util
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

### hashtable

```

```
