abstract class Car{
    abstract void run();
}

public class Honda extends Car {
    public void run(){
        System.out.println("Car of Honda ");
    }
    public static void main(String args[]){
        Honda h=new Honda();
        h.run();
    }
    
    
}
