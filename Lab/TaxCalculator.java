package lab7;

public class TaxCalculator {//define the class TaxCalculator
	//static method calculateTax that return the double value with three parameter empName,isIndian,empSal that throws the Exception

	@SuppressWarnings("unused")
	public static double calculateTax (String empName,boolean isIndian,double empSal) throws Exception{

		if (!isIndian) throw new CountryNotValidException();//checking id the employee is Indian or not otherwise exception is throw CountryNotValidException()

        if (empName == null || empName.isEmpty()) throw new EmployeeNameInvalidException();//Checking If the employee name is null or empty

        double taxAmount;
		if (empSal>100000 && isIndian==true)//cheking If  empSal is greater than one lakh and isIndian true
            return taxAmount=empSal*8/100;//retuning the value of taxAmount
        else if(empSal>=50000 && empSal<=100000 && isIndian==true)//Otherwise  If  empSal  is between 50K and 1lakh and isIndian true

            return taxAmount=empSal*6/100;
        else if(empSal>=30000 && empSal<=100000 && isIndian==true)//checking If  empSal  is between 30 and 50 Thousand  and isIndian true

            return taxAmount=empSal*5/100;
        else if(empSal>10000 && empSal<=30000 && isIndian==true)//Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
        	
            return taxAmount=empSal*4/100;
        else
            throw new TaxNotEligibleException();//otherwise throw TaxNotEligibleException
        
        	
	}
	
}

//user defined exception classes
@SuppressWarnings("serial")
class CountryNotValidException extends Exception {//class for the CountryNotValidException
    @Override
    public String getMessage() {//Returns the detail message string of this throwable.
        return "The employee should be an Indian citizen for calculating tax.";
    }
}
@SuppressWarnings("serial")
class EmployeeNameInvalidException extends Exception {//Exception class for EmployeeNameInvalidException
    @Override
    public String getMessage() {
    	//Returns the detail message string of this throwable.
        return "The employee name cannot be empty";
    }
}
@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception {//Exception class for TaxNotEligibleException
    @Override
    public String getMessage() {
    	//Returns the detail message string of this throwable.
        return "The employee does not need to pay tax";
    }
}
