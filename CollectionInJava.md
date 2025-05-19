# collection in java 
in java, a collection is a framework that provides a way to store and manipulate a group of objects

### collection frame work hierarchy
-   list[interface]
-     ArrayList
-     LinkedList
-     Stack
-     Vector
  > allows duplicate values
-   set[interface]
-     HashSet
-     LinkedHashSet
-     TreeEet
  > doesnot allow duplicate values
-   map[interface]
-     HashMap
-     LinkedHashMap
-     TreeMap
> allows duplicate values but does not allow duplicate key
> shows data in the form of key value pair

#### Arraylist
```
import java.util.*;

public class MyApp{
  public static void main(String[] args) {
    List <String> myList = new ArrayList<String>();
    myList.add("mada");
    myList.add("ball");
    myList.add("sugma");
myList.add("mada");
    myList.add("ball");
    myList.add("sugma");

    Iterator<String> itr = myList.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

  }
}
```

#### set
```
import java.util.*;

public class MyApp{
  public static void main(String[] args) {
    Set <String> myList = new HashSet<String>();
    myList.add("mada");
    myList.add("ball");
    myList.add("sugma");
    myList.add("mada");
    myList.add("ball");
    myList.add("sugma");

    Iterator<String> itr = myList.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

  }
}
```


