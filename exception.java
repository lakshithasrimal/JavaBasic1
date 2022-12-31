public class Exception {
   public static void main(string[] args) {
      
      String[] pets = { "pig", "cat", "dog"};
      System.out.println(pets[3]);
   }
}
// there is an 'Array Index out bounds exception'.
// there is no fourth index (3).

//(2)

public class Exception {
   public static void main(string[] args) {
      int i = "alex";
   }
}   
// there is a type mismatch exception.

// (3)
public class Exception {
   public static void main(string[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.get(0);
   }
}
// there is an index out of bounds exception.

// (4)
public class Exception {
   public static void main(string[] args) {
      ArrayList<String> list = null;
      list.get(0);
   }
}
//this is a null pointer exception.

// (4) correction

public class Exception {
   public static void main(string[] args) {
      ArrayList<String> list = null;
      list.add("book");
      list.get(0);
   }
}  

