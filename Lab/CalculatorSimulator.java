package lab7;

public class CalculatorSimulator {//main class CalculatorSimulator 

	@SuppressWarnings("static-access")
	public static void main(String[] args) {//main method 
		TaxCalculator obj=new TaxCalculator();//object creation for the TaxCalculator class
		System.out.println("After Test Case 1 : ");
        try {//for test case 1
            double taxAmount= obj.calculateTax("Ron",false, 34000);//if the all condition satsified then tax amount will get print 
            System.out.println("Tax amount is " + taxAmount);//displaying the tax amount
        } catch (Exception e) {//otherwise Exception throw
            System.out.println(e.getMessage());//will diaplay The employee should be an Indian citizen for calculating tax.
        }
        System.out.println("After Test Case 2 :");
        try {//for test case 1
            double taxAmount = obj.calculateTax("Tim",true, 1000);//if the all condition satsified then tax amount will get print
            System.out.println("Tax amount is " + taxAmount);//displaying the tax amount
        } catch (Exception e) {
            System.out.println(e.getMessage());//The employee does not need to pay tax
        }
        System.out.println("After Test Case 3 :");
        try {
            double taxAmount = obj.calculateTax("Jack",true, 55000);//if the all condition satsified then tax amount will get print
            System.out.println("Tax amount is " + taxAmount);//displaying the tax amount
        } catch (Exception e) {
            System.out.println(e.getMessage());//Tax amount is 3300.0

        }

        System.out.println("After Test case 4");
        try {
            double taxAmount = obj.calculateTax("",true, 30000);//if the all condition satsified then tax amount will get print
            System.out.println("Tax amount is " + taxAmount);//displaying the tax amount
        } catch (Exception e) {
            System.out.println(e.getMessage());//The employee name cannot be empty

        }

    }
}

/*
 * Output:
 * After Test Case 1 : 
The employee should be an Indian citizen for calculating tax.
After Test Case 2 :
The employee does not need to pay tax
After Test Case 3 :
Tax amount is 3300.0
After Test case 4
The employee name cannot be empty

 */