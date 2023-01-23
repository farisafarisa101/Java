class TypecastingExample{
    public static void main(String args[]){
        //widnning 
        int x=480;
        long z=x;//automatically convert into long
        System.out.println(x);
        System.out.println(z);
        double y=x;//automatically convert into double
        System.out.println(y);
        
        //Narrowing
        double a=87977.546;
        int b=(int)a;//converting double into int
        System.out.println(a);
        System.out.println(b);
    }
}