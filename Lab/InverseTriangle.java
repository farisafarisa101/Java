
import java.util.Scanner;
class InverseTriangle {
    public void leftDown(int rows){//defining method
        int alphabet=65;
            for (int i = rows - 1; i >= 0; i--)//outer loop
    {
        for (int j = 0; j <= i; j++)//inner loop
        {
            System.out.print( (char) (alphabet + j) +" ");
        }
        System.out.println();
    }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows=sc.nextInt();
        InverseTriangle obj=new InverseTriangle();
        obj.leftDown(rows);
    }
    
}
