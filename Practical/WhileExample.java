import java.util.Scanner;
class WhileExample{
    public void calcTable(int number){
        int i=1;
        while(i<=10){
            System.out.println("Value is :" + (number * i));
            i++;
             
        }
  

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        WhileExample obj=new WhileExample();
        obj.calcTable(number);
    }


}