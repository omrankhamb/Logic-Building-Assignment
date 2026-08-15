import java.awt.Checkbox;
import java.lang.reflect.RecordComponent;
import java.util.*;

/*  
    A Scolarship commitee uses a strict checklist . Only student who meet all academic and financil condition qualify

    Rules : 
        -> Marks > 80 %
        -> Attendance > 75 %
        -> Family Income <= 3,00,000    

    Input :
        -> Marks percent Integer 
        -> attendance percent (integer)
        -> family income Integer (integer)

    validations :
        -> marks and attendance must be 0 and 100
        -> income can not be negative

    Expected :
        -> Scolarship approved 
        -> Scolarship Rejected : <Reason>
*/


class Scolarship
{
    public int Marks;
    public int Attendance;
    public int income;
    
    public Scolarship()
    {
        this.Marks = 0;
        this.Attendance = 0;
        this.income = 0;
    }

    public String getDetails(int marks,int attendance, int income)
    {

        if(marks < 0 && marks > 100)
        {
            return "Enter Valid marks";
        }

        if(attendance < 0 && attendance > 100)
        {
            return "Valid Attendance";
        }

        if(income < 0)
        {
            return "Income never be negative";
        }
        Marks = marks;
        Attendance = attendance;
        this.income = income;

        return "Information stored successfully";
    }

    public String checkApproval()
    {
        if(Marks < 80)
        {
            return  "You score did not match to requirment";
        }

        if(Attendance < 75)
        {
            return "Your Attendance is to low";

        }

        if( income > 300000)
        {
            return "Your income is to high";
        }

        return "APPROVED";
    }
    

}

class Assignment268
{
    public static void main(String Arg[])
    {
        String str = null;
        int Marks = 0;
        int Attendance = 0;
        int income = 0;
        Scanner sobj = new Scanner(System.in);
        Scolarship obj = new Scolarship();

        System.out.println("Enter Following Details => ");

        System.out.println("Enter Marks >");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance > ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Income : ");
        income = sobj.nextInt();

        str = obj.getDetails(Marks, Attendance, income);
        str = obj.checkApproval();
        System.out.println("Scolarship status : " + str);
        
    
    }
}