class VariableExample{
    static int num=55;//static
    long num1=54564646;//instance
    public void dispaly(){
        char a='M';//local
        double num2=45.55;
        System.out.println("Local variable value :" +a);//print local variable
        System.out.println("Local Variable value :" +num2);
    }
    public static void calc(){
        double b=99.34;
        double c=45.23;
        double res= b*c;
        System.out.println("Result is:" +res);
    }
   public static void main(String args[]){
       VariableExample obj=new VariableExample();//object creation
       obj.dispaly();//invoke nonstatic method with obj
       calc();//invoke static method
       System.out.println("Instance Variable value:" +obj.num1);//calling instance variable
       System.out.println("Static variable value:" +num);//calling static variable 
   }
            
}