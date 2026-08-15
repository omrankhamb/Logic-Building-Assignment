import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;
import javax.lang.model.util.ElementScanner14;

/*  
    A Phone OS shows different battery warnings . The user wants a program that prints the corectley battery status rules 
    Input : 
        -> Battery percentage

    Rules :
        -> Battery <= 5Critical
        -> Battery <= 15 Low
        -> other wise normal
        
    validations :
        -> 0 to 100 only
    Expected :
        -> Battery Percntege : <value >%
        -> Status : <Critical / Low / Normal>
*/


class Percentage
{
    public int battery;
    
    public Percentage()
    {
        this.battery = 0;
    }

    public String getDetails(int per)
    {
        if(per < 0 && per > 100)
        {
            return "valid percentage";
        }

        this.battery = per;
        return "status";
    }

    public String Status()
    {
        String stat = null;

        if(battery <= 5)
        {
            stat = "Critical";
        }
        else if(battery <= 15)
        {
            stat = "Low";
        }
        else
        {
            stat = "Normal";
        }

        return stat;
    }
    

}

class Assignment271
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        Percentage obj = new Percentage();

        System.out.println("Enter Following Details => ");

        System.out.println("Battery percentage :=>");
        iValue = sobj.nextInt();

        obj.getDetails(iValue);

        str = obj.Status();
        System.out.println("Status : " + str);

    }
}