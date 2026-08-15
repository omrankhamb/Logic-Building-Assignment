import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;

/*  
    A ride hailing app calculates trip fare based ondistance whether the trip happened during peak hours peak hours increase demand ,so surchare applies.

    Rules : 
        -> Base Price  50
        -> First 10km 12 perkm
        -> Beyond 10km 15 perkm
        -> peak hours 20 % extra on total fare

    Input :
        -> Distance in Km Integer
        -> Peak hr ( yes / No )

    validations :
        -> Distance can not be negative 

    Expected :
        -> Distance : < Km >
        -> peak hour : < yes // no >
        -?> total fare : <amount>
*/


class Ride
{
    public int distance;
    public String pHrs;
    public int fees;
    public Ride()
    {
        this.distance = 0;
        this.fees = 50;
        pHrs = null;
    }

    public void setDistance(int dis,String hr)
    {

        if(dis < 0)
        {
            System.out.println("Distance <not be negative>");
        }
        this.distance = dis;
        this.pHrs = hr;
    }

    public int getFare()
    {
        if(distance <= 10)
        {
            fees += (distance) * 12;
        }

        if(distance > 10)
        {
            fees += (distance - 10) *15;  
        }

        if(pHrs.equals("yes"))
        {
            fees = fees  + ((fees /100) * 20);
        }

        return fees;
    }


}

class Assignment266
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance <Km> : ");
        iValue = sobj.nextInt();

        System.out.println("Is the hour is peak hour <Yes / no >: ");
        str = sobj.nextLine();
        str.trim();
        str.replaceAll("\\s+", " ");
        str.toLowerCase();
        Ride obj = new Ride();
        obj.setDistance(iValue, str);

        iValue = obj.getFare();
        System.out.println("Total Fares : " + iValue);

    }
}