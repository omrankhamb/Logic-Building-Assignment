import java.util.*;

/*
    Water bill with progressive slabs + latefee
    Slabs + fixed meter charge . if paid due date add 2% Penlty per week late max( 10 %     )

    Input :=> unit weekslate

    Output : = > billAmount
*/

class BILL
{
    private int unit;
    private int weeksLate;
    private int initialCharge;
    private int bill;
    private int chargeOnUnit;

    public BILL()
    {
        unit = 0;
        weeksLate = 0;
        bill = 0;
        chargeOnUnit = 10;
        initialCharge = 2;

    }

    public void setDetails(int uni , int gb)
    {   
        if(unit < 0)
        {
            System.out.println("Enter valid unit");
        }
        unit = uni;
        this.weeksLate = gb;
    }


    public void createBill()
    {
        // exact actual bill
        bill = chargeOnUnit * unit;
        for(int i = 1 ; i < weeksLate ; i++)
        {
            bill = bill + ((bill * initialCharge) /100) ;
            if(initialCharge <= 10)
            {
                initialCharge +=2;
            }
            else 
            {
                initialCharge = 10;
            }
        }


    }

    public void getbill()
    {
        System.out.println("Cost of one unit : " + chargeOnUnit);
        System.out.println("You are weeks late : "+ weeksLate);
        System.out.println("Total : " + bill);
    }
}

class Assignment275
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int unit = 0;
        int wl = 0;

        System.out.println("Number if UNIT  > ");
        unit = sobj.nextInt();

        System.out.println("Total weekslate >");
        wl = sobj.nextInt();

        BILL obj = new BILL();
        obj.setDetails(unit,wl);
        obj.createBill();
        obj.getbill();
    }
}