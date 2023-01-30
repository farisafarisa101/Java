class OperatorsExamples{
    int a=10,b=14;
    public void calcIncDec(){ //Method for the Increment and Decrement 
	System.out.println("................Increment and Decrement Oprators............. "); 
       	System.out.println("Decrement Results ");
        int x=10;
	System.out.println(x--);//Post Decrement 
	System.out.println(x--);
	System.out.println(--x);//pre Decrement 
	System.out.println(--x);
	System.out.println(x--);
	System.out.println(x);
       	System.out.println("Increment Results");
        int y=10;
	System.out.println(y++);//Post Increment 
	System.out.println(y++);
	System.out.println(++y);//Pre Increment
	System.out.println(y++);
	System.out.println(y);
    }
    public void calcArith(){
	System.out.println("................Arithmatic Oprators............. ");
        System.out.println("Addition :"+(a+b));
	System.out.println("Subtraction:"+(a-b));
	System.out.println("Multiplication:"+(a*b));
	System.out.println("Division :"+(a/b));
	System.out.println("Modulu :"+(a%b));

    }
   public void compExample(){//Example of Relational or Comparison Operator
	System.out.println("................Comparison Operators............. ");
        System.out.println("a>b : " +(a>b));//false
        System.out.println("a<b :" +(a<b));//true
        System.out.println("a>=b:" +(a>=b));//false
        System.out.println("a<=b:" +(a<=b));//true
        System.out.println("a==b:" +(a==b));//false
        System.out.println("a!=b:" +(a!=b));//true
    }
    public void logicalEx(){
	System.out.println("................logical Operators................ ");
        System.out.println((a>b)&&(a<b));//Logocal AND false
        System.out.println((a>b)||(a<b));//Logical OR true
        System.out.println(!(a==b));//true Logical NOT
    }
    public void bitwiseEx(){
	System.out.println("................Bitwise Operators................ ");
        System.out.println((a<b)&(a++>b));//Bitwise AND 
        System.out.println((a>b)|(a<b++));//Bitwise OR
        System.out.println("a&b :" +(a&b));
        System.out.println("a|b :" +(a|b));
        System.out.println("a^b :" +(a^b));//Bitwise XOR
        System.out.println("~a  :" +(~a));//Complement 
        
    }
    public void ternaryEx(){//Ternary operators 
	int m=10,n=14,c;
	System.out.println("................Ternary Operators................ ");
       	c=(m<n) ? m:n;
        System.out.println(c);
    }

    public static void main(String args[]){
        OperatorsExamples obj=new OperatorsExamples();
        obj.calcIncDec();
	obj.calcArith();
	obj.compExample();
	obj.logicalEx();
	obj.bitwiseEx();
	obj.ternaryEx();
    }
}