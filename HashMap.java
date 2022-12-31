import java.util.HashMap;

class HelloWorld {
      
      public static void main(String[] args) {
        // normal statements. 
        int a = 33;
        int b = 22;
        int c = 89;
        
        //hashmap.
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 33);
        happy.put("b", 22);
        happy.put("c", 89);
        
        System.out.println(happy);
        //there is no any special order as array list.
      
      }
}    
// hashmap.put(key, value);
// System.out.println(happy.get(key);

// (2)

import java.util.HashMap;

class HelloWorld {
      
      public static void main(String[] args) {
        
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("lakshithaSrimal", "12345678");
        fun.put("hemalJayeweera", "aaaaaaaaa");
        fun.put("champikaHerath", "ababababa");
        
        fun.remove("hemalJayeweera");
        // to remove a key.
      
        System.out.println(fun);
        
        System.out.println(fun.containsValue("12345678");
                           //this shows the "true".this can be checked the value is correct or not.
        System.out.println(fun.containsKey("lakshithaSrimal");
                           //this can be checked the key  is correct or not.
                           
        System.out.println(fun.size());
                           //this shows the size of the hashmap.
        System.out.println(fun.replace("champikaHerath", "p@ssword"));
                           //this method use, if we want replace a value of a current key. 
                           //(fun.replace(key, value);
        system.out.println(fun.values());
                           // this can be got all values.
        system.out.println(fun.keySet());
                           // this can be got all keys.                   
                           
                           
                           
                           
      }
} 
