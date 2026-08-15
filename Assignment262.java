import java.util.*;

/*
    A shopping mall parking gate recorde entry and exit duration hours

    the parking system calculattes charges based on the total hours a vehicle stayed .
    Long duration perking attracts additional penalty.

    Rules :
        -> First 2 hours : 20 rupe flat'
        -> after 2 hr : 10 extra per hour
        -> if total hours > 10 add 50 penlty

    Input : 
        Total parking hours (integer)
    
    Conditions :
        Hours can not be negative

*/

class Parking
{
    public int Hours;
    public int Amount;

    public void  getHours(int hr)
    {
        if(hr < 0)
        {
            System.out.println("Hours never negative");
            return;
        }
        else{
            this.Hours = hr;
            this.Amount = 0;
        }
    }

    public int Payable()
    {
        if(this.Hours <= 2)
        {
            this.Amount +=20;
        }

        if(this.Hours > 2)
        {
            this.Amount +=20;
            this.Amount = this.Amount + ((this.Hours - 2) * 10);

        }

        if(this.Hours > 10)
        {
            this.Amount += 50;
        }


        return this.Amount;
    }
}


class Assignment262
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Hour : ");
        int Hr = sobj.nextInt();

        Parking obj = new Parking();

        obj.getHours(Hr);

        System.out.println("Pay Balance : " + obj.Payable());
    }
}