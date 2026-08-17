import java.util.*;

/*
    User enters usage : call(min) , data (age) , sms(count) , App suggests the cheapest plan among 4 plans 

    Input :=> mins , gb ,sms

    Output : = > recommeded paln , totalCost

    Twiest : if usage exceeds plan limits add per unit extra



*/

class Pack
{
    private int mins;
    private int gb;
    private int sms;

    public String Package;

    public Pack()
    {
        mins = 0;
        gb = 0;
        sms = 0;
        Package = null;
    }

    public void setDetails(int min , int gb , int sms)
    {   
        mins = min;
        this.gb = gb;
        this.sms = sms;
    }


    public void createBill()
    {
        if((mins > 50 && mins < 100 ) && (gb > 10 && gb < 20) && (sms > 50 && sms < 100))
        {
            Package  = "Pack1";
        }
        else if((mins > 100 && mins < 300 ) && (gb > 20 && gb < 40) && (sms > 100 && sms < 200))
        {
            Package  = "Pack2";
        }
        else 
        {
            Package = "Pack3";
        }
    }

    public void getbill()
    {
        System.out.println("minuste > " + mins);
        System.out.println("Data (GB) > " + gb);
        System.out.println("Message > " + sms);
        System.out.println("Most suitable plan : " + Package);
    }





}

class Assignment274
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int mind = 0;
        int gb = 0;
        int sms = 0;

        System.out.println("Minute  > ");
        mind = sobj.nextInt();

        System.out.println("Data > ");
        gb = sobj.nextInt();

        System.out.println("Meassage > ");
        sms = sobj.nextInt();

        Pack obj = new Pack();

        obj.setDetails(mind,gb,sms);;
        obj.createBill();
        obj.getbill();
    }
}