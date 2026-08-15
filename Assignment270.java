import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;

/*  
    A Customer Enter a store with a fixed budget . they pickup items one by one in a given order The cashier wants to know how many items can be purchased before money beomes insufficient 
      
    Input : 
        -> Budget amount
        -> Number of item N
        -> N item prices
        
    validations :
        -> Budeget > 0
        -> n >= 0
        -> Each price  > 0
    Expected :
        -> Item purchased : <count> 
        -> Courier Balance  : <amount>
*/


class Courier
{
    public int Cash;
    public int noOfItems;
    public int Prices;
    
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