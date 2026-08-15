import java.awt.Checkbox;
import java.util.*;

/*  
    A warehouse has a product in stock . Every time a cutomer places an order , the system stock exists

    if possible fullfill and update remaning stock . if Stock becomes very low , show alert

    Rules : 
        -> If requested Quantity > available Stock => oreder fails
        -> Else deduct quantity
        -> If remaining stock < 5 -> print ;ow stock alert

    Input :
        -> Curretn stock Integer
        -> Requested quantity (Integer )

    validations :
        -> Stock cannot be negative 
        -> Requested quantity must be > 0

    Expected :
        -> 
        If successfull 
        Order procedded Successfully
        remaning Stock :  < Value >
        If Remaning Stock < 5 also print Los Stok Alert >
        If failed : order Failed : Insufficent Stock
*/


class Warehouse
{
    private static int Stock;
    public int Request;

    public Warehouse()
    {
        Request = 0;
    }

    static
    {
        Stock = 250;
    }

    public String RequestQuantity(int Amount)
    {
        if(Amount < 0)
        {
            return "Stock can not be negative";
        }

        if(this.Stock - Amount >= 0)
        {
            this.Stock = this.Stock - Amount;
            this.CheckStock();
            return "Order Processed successfully";
            
        }
        else
        {
            return  "Order Filed : Insufficient Stock";
        }

        
   }

   public  void CheckStock()
   {
    if(this.Stock < 5)
    {
        System.out.println("Low Stock Alert : " + this.Stock);
    }
    else
    {
        System.out.println("Stock remained : " + this.Stock);
    }

   }

}

class Assignment264
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        Warehouse Customer = new Warehouse();

        System.out.println("Eneter Quantity Amount : ");
        iValue = sobj.nextInt();
        str = Customer.RequestQuantity(iValue);
        System.out.println(str);

    }
}