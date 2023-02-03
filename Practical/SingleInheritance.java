//Single level Inheritance
class Owner{
    int area=1000;
    String name="Farisa";
    String dateofPurchase="07-03-2002";
    boolean noc=true;
    public void renew(){
        String color="blue";
        String flat="3BHK";
        int ceilHeight=8;
        System.out.println(color +"  "+ flat +"  "+ ceilHeight);
    }
}
class New_Owner extends Owner{
    String name="Anum";
    String dateofRegister="3-2-2023";
    double flatValue=2.300000;
    public void display(){
        System.out.println("Area is:" +area);
        System.out.println("New Owner Name :" +name);
        System.out.println("Current Flat price is :" +flatValue);
        System.out.println("Owner Name :" +super.name);
        
    }
    
 

    public void renew(){
        String color="Pink";
        String flat="4BHK";
        int ceilHeight=10;
        System.out.println(color +"  "+ flat +"  "+ ceilHeight);
        super.renew();
        
    }
    
}
class SingleInheritance{
    public static void main(String args[]){
        New_Owner c=new New_Owner();
        c.display();
        c.renew();
    }
}