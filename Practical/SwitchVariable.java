import java.util.Scanner;
public class SwitchVariable {//class DEclaration
    public void calc(String vowel){
        
        switch(vowel){//switch Initialization
        case"A":
                System.out.println("A is the vowel");
                break;
                
        case"E" :
                System.out.println("e is the vowel ");
                break;
                
        case"I":
                System.out.println("i is the vowel ");
                break;
        case"O":
                System.out.println("O is the vowel ");
                break;
        case"U":
                System.out.println("u is the vowel");
                break;
        default:
                System.out.println("You Have entered the constant");
                
    }
        
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Charcater");
            String vowel=sc.next();
	    vowel=vowel.toUpperCase();
            SwitchVariable obj=new SwitchVariable();
            obj.calc(vowel);
        }
}
