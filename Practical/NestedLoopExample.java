import java.util.Scanner;
class NestedLoopExample{
    public void calc(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;++j){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public void star(){
        for (int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * " + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int row=sc.nextInt();
        NestedLoopExample obj=new NestedLoopExample();
	obj.calc(row);
        obj.star();
    }
}
