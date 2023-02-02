
 class OddEvenSum{
     public void odd_Even_Sum(){
         System.out.println("*************Even numbers are************************************");

      for (int i=0; i<=200; i++){
         if(i%2 == 0){//will check Even Values
            System.out.println(i);
         }
      }
      System.out.println("******************Odd numbers are****************************** ");

      for (int i=0; i<=200; i++){
         if(i%2 != 0){//check odd values
            System.out.println(i);
         }
      }
	System.out.println("-------------------------------------------------------------");
      int sum=0;//value of sum is initilized as 0
      for(int i = 1; i <= 200; ++i){//loop for repeating the procedure
      
          //adding the value of i into sum variable 
          sum = sum + i;  //adding the value of sum and i and string it into sum 
      }
      //prints the sum 
      System.out.println("Sum of First 200 Natural Numbers is = " +sum);   
      
     }
   public static void main(String args[]){
      OddEvenSum obj=new OddEvenSum();
      obj.odd_Even_Sum();
      
   }
}
