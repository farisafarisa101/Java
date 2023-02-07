interface Fruite{//definning an interface
    String name="Apple";
    void sell(); 
    default void buy(){//default method 
	System.out.println("I am buying Apple");
        
    }
    static void eat(){//static method 
     System.out.println("I am Eating Apple.");
    }
}
class Seller implements Fruite{
    public void sell(){
        System.out.println("I am Selling apple");
        
    }
}
class InterfaceExample{
    public static void main(String args[]){
        Fruite f=new Seller();
        f.sell();
        f.buy();
        Fruite.eat();
        
    }
}