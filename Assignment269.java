import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;

/*  
    A Courier Counter calculates delivery charge by weight . CCharges increases when parcel is heavier
    Rules : 
        -> up to 1kg 
        -> 1-5kg 50 + 20 above 1kg
        -> Above 5kg : 150  + 30 above 5kg 

    Input :
        -> please weight in kg <Integer >

    validations :
        -> weight must be > 0
    Expected :
        -> parcel weight : <weight> kg
        -> Courier Charge : <amount>
*/


class Courier
{
    public int weight;
    public int price;
    
    public Courier()
    {
        this.weight = 0;
        this.price = 0;
    }

    public String getDetails(int weight)
    {
        if(weight < 0)
        {
            return "Weight never be zero";
        }

        this.weight = weight;
        return "Your data is stored";
    }

    public String checkApproval()
    {
        if(weight <= 1)
        {
            price = 50;
        }
        
        if(weight > 1 && weight <= 5)
        {
            price = 50;
            price = price + (weight - 1) * 20;

        }

        if(weight > 5)
        {
            price = 150;
            price = price + (weight - 5) * 30;
        }

        return "you have to pay "+ price;
    }
    

}

class Assignment269
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Courier obj = new Courier();

        System.out.println("Enter Following Details => ");

        System.out.println("Enter the weight :=>");
        iValue = sobj.nextInt();

        obj.getDetails(iValue);

        str = obj.checkApproval();
        System.out.println(str);

    }
}