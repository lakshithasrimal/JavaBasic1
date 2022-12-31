import java.util.HashSet;
public class HashSet {
  public static void main(String[] args) {
    
    int[] a = {2, 22, 54};
    System.out.println(a[2]);
              //arraylist
    
    HashSet<String> h = new HashSet<String>();
    h.add("monkey");
    h.add("orangotang");
    h.add("spider Monkey");
    
    h.remove("orangotang");
            // this can be remove the values.
    h.clear();
            //remove the all value inside it.
    h.size();
            //size of the hashset.
    System.out.println(h.contains("monkey"));
            //after this run. we can get 'true'. this can be checked there is or not.
    System.out.println(h.isEmpty());
            //this shows hashset is empty(true) or not(false).
  }
}

// (2)
import java.util.HashSet;
import java.util.iterator;
public class HashSet {
  public static void main(String[] args) {
    
    HashSet<Integer> hashBrowns = new HashSet<Integer>();
    hashBrowns.add(32);
    hashBrowns.add(43);
    hashBrowns.add(95);
    
    object[] h = hashBrowns.toArray();
    System.out.println(h[0]);
                      // here, we have been converted the hashset to a array.
                      // arrays have a order and hash sets haven't a order.
                      // there for we can be obtained a unexpected value which are in the hash set.
    
    Iterator it = hashBrowns.iterator();
        
    while(it.hasNext()) {
      System.out.println(it.next();
    } 
  }
}   
