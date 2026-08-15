import java.awt.Checkbox;
import java.util.*;

/*  
    A Traffic police app records whether a rider violated rules . Each violation has a fixed fine 
    If multiple violations happen , fine should be added

    Rules : 
        -> No helmet -> 500
        -> No license  -> 1000
        -> OVer Speeding -> 1500

    Input :
        -> Helmet warn ( yes / no )
        -> License available ( yes / no )
        -> Overspeeding ( yes/ no )

    validations :
        -> Input must be yes/ no only

    Expected :
        -> Total fine amount : <Amount>
*/


class Traffic
{
    private String helmet;
    private String license;
    private String overspeeding;
    private int fine;
    
    public Traffic()
    {
        this.fine = 0;
        helmet = null;
        license = null;
        overspeeding = null;
    }
    
    public void setDetails()
    {   
        Scanner sobj = new Scanner(System.in);
        System.out.println("Is you wear Helmet  ?? ( Yes / NO ) ->");
        helmet  = sobj.nextLine();
        helmet.trim();
        helmet.replaceAll("\\s+", " ");
        helmet.toLowerCase();

        System.out.println("Did you have License ?? ( Yes / NO ) ->");
        license = sobj.nextLine();
        license.trim();
        license.replaceAll("\\s+", " ");
        license.toLowerCase();

        System.out.println("Did you break Overspeeding Rules ?  ( Yes / NO ) -> ");;
        overspeeding = sobj.nextLine();
        overspeeding.trim();
        overspeeding.replaceAll("\\s+", " ");
        overspeeding.toLowerCase();
    }

    public int getFine()
    {
        if(helmet.equals("no") == true)
        {
            fine += 500;
        }

        if(license.equals("no") == true)
        {

            fine +=1000;
        }

        if(overspeeding.equals("yes") == true)
        {
            fine += 1500;
        }


        return fine;
    }

}

class Assignment265
{
    public static void main(String Arg[])
    {
        String str = null;
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        Traffic case1 = new Traffic();

        case1.setDetails();
        iValue = case1.getFine();
        System.out.println("Total  Fine amount : <" + iValue +">");

    }
}