import java.util.*;
/*
    A hotel charges 3000 per day , for long stays , hotel provides dicount or retain customers .

    Rules :
        3000 per day
        It stays > 7 days 5 % dicount on total bill

    Input :
        number of days stayed 

    Validations : 
        Days must be  >= 0

    Expected output : 
        total stay duration : <days> days 
        final bill amount : <amount>
*/

class hotel
{
    private int days;
    private int cost;
    private int costOfOneDay;

    public hotel()
    {   
        this.days = 0;
        this.costOfOneDay = 3000;
        this.cost = 0;
    }

    public void setDetails(int day)
    {
        this.days = day;
    }

    public int getBill()
    {
        if(this.days <= 7)
        {
            this.cost = this.days * this.costOfOneDay;
        }
        else
        {
            this.cost = this.days * this.costOfOneDay;
            this.cost = this.cost - ((this.cost * 5)/100);
        }
        return this.cost;
    }
}




class Assignment277
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of days : ");
        iValue = sobj.nextInt();

        hotel hobj = new hotel();
        hobj.setDetails(iValue);;
        System.out.println(hobj.getBill());

    }
}