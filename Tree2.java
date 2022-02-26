package programs;

abstract class Book {  
    protected static String material = "papyrus";  
    public Book() {
        
    }  
    public Book(String material) {
        this.material = material;
        
    }
}
public class Tree2 extends Book {   
    public static String material = "cellulose";   
    public Tree2() {
        super();
        
    }   
    public String getMaterial() {
        return super.material;
        
    }  
    public static void main(String[] pages) {     
        System.out.print(new Tree2().getMaterial());  
    }
}
