import java.util.Scanner;
class DividedBy {
    public void calc(){
        System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {//For loop represnt the value from 1-100
			if (i%5==0 && i>40){ // value of i fully divided by 5
				System.out.print(i +", ");//Value of i will get print
			}			
		}
    }
    public static void main(String args[]){
        //Scanner Sc=new Scanner(System.in);//object of Scanner class is created 
        //System.out.println("Enter Number of : ");
        //int num=Sc.nextInt();
        DividedBy obj=new DividedBy();//object of DividedBy class is  created
        obj.calc();//calling calc method 
    }
}    	
