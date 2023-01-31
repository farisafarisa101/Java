import java.util.Scanner;
class DoWhileExample{
    public void calcTable(int number){
        int i=1;
        do {
            System.out.println("Value is :" + (number * i));
            i++;
             
        }while(i<=10);
  

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        DoWhileExample obj=new DoWhileExample();
        obj.calcTable(number);
    }


}