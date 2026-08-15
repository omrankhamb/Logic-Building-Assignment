import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;

/*  
    A Tax portal calculates income tax based on annual income using progressive slabs . Only the amount in a slab is taxed at the slab's rate

    Rules : 
        -> Up to 250000 0%
        -> 2,50,001 to 5,00,000 5%
        -> 5,00,001 to 10,00,000 20%
        -> Above the 10,00,000 30%

    Input :
        -> Annual income integer

    validations :
        -> Income can not be negative

    Expected :
        -> Annual Income : < Income >
        -> Total Tax Payable : < Tax >
*/


class Tax
{
    public int annualIncome;
    public int tax;
    
    public Tax()
    {
        this.annualIncome = 0;
        this.tax = 0;
    }
    
    public String setAnnualIncome( int income)
    {   
        if(income < 0)
        {
            return "Income never be negative";
        }
        this.annualIncome = income;

        return "Your income stored successfully";
    }

    public int getTax()
    {
        int income = 0;
        if(this.annualIncome <= 250000)    
        {
            this.tax = 0;
        }  
        
        if(this.annualIncome >= 250001&& this.annualIncome <= 500000)
        {
            income = (this.annualIncome - 250000);
            this.tax = (income * 5) / 100;
            return this.tax;
        }

        if(this.annualIncome >= 5000001 && this.annualIncome <= 1000000)
        {
            income = (this.annualIncome - 500000);
            this.tax = (income * 20) / 100;
            return this.tax;

        }

        if(this.annualIncome >= 1000001)
        {
            income = (this.annualIncome - 500000);
            this.tax = (income * 30) / 100;
            return this.tax;

        }

        return 0;
    }
    
}

class Assignment266
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        Tax obj = new Tax();
        System.out.println("Enter your Income : ");
        iValue = sobj.nextInt();

        System.out.println(obj.setAnnualIncome(iValue));
        iValue = obj.getTax();
        System.out.println("Total Tax Payable : " + iValue);

    }
}