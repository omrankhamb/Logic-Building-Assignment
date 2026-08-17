import java.util.*;

/*
    Base fare depends on distance slabs charge for class (sleeper / 3A / 2AC ) if booking within 24hours , add
    tatkal 30% . seniot citizen gets 40 % discount

    Input :=> distance class type , bookingHoursBefore , age

    Output : = > finalFare + reason/breakDown

    validatiaons : finalFare  + reason breakdown

*/

class TicketPrice
{
    private int distance;
    private String classtype;
    private int bookingHoursBefore;
    private int age;
    private int priceperkm;

    private int TotalPrice;

    public TicketPrice()
    {
        distance = 0;
        classtype = null;
        bookingHoursBefore = 0;
        age = 0;
        TotalPrice = 0;
        priceperkm = 10;
    }

    public void setDetails(int dis , String type , int bBefore , int age)
    {   

        if(distance < 0)
        {
            System.out.println("Distance never negative");
            return;
        }


        distance = dis;
        classtype = type;
        bookingHoursBefore = bBefore;
        this.age = age;
    }


    public void createBill()
    {
        // creating price per km
        TotalPrice = priceperkm * distance;

        // if type addording to these

        if(classtype.equals("sleeper") == true)
        {
            TotalPrice += 1000;
        }
        else if(classtype.equals("3ac"))
        {
            TotalPrice += 700;
        }
        else if(classtype.equals("2ac"))
        {
            TotalPrice += 500;
        }

        // tatakal 30 %
        if(bookingHoursBefore < 24)
        {
            TotalPrice = TotalPrice + ((TotalPrice * 30) /100);
        }

        if(age > 40)
        {
            TotalPrice = TotalPrice - ((TotalPrice * 40) /100);
        }

    }

    public void getbill()
    {
        if(age > 40)
        {
            System.out.println("=> Discount of Cinear Citizen");
        }

        if(bookingHoursBefore < 24)
        {
            System.out.println("=> Tatkal 30% money cost increases");
        }

        if(classtype.equals("sleeper"))
        {
            System.out.println("=> Class type Sleeper");
        }
        else if(classtype.equals("3ac"))
        {
            System.out.println("=> Class type 3AC");
        }
        else if (classtype.contains("2ac")) {
            System.out.println("=> Class type 3Ac");
        }

        System.out.println("Finall TicketPrice : " + TotalPrice);
    }





}

class Assignment273
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int distance = 0;
        String type = null;
        int bookBefore = 0;
        int age = 0;
        String insurance = null;

        System.out.println("Classtype ( sleeper / 3AC / 2AC ) ");
        type = sobj.nextLine();
        type.trim();
        type.replaceAll("\\s+"," ");
        type.toLowerCase();

        System.out.println("Distance > ");
        distance = sobj.nextInt();

        System.out.println("Booking Before > ");
        bookBefore = sobj.nextInt();

        System.out.println("Age > ");
        age = sobj.nextInt();

        TicketPrice obj = new TicketPrice();

        obj.setDetails(distance,type,bookBefore,age);;

        obj.createBill();
        obj.getbill();
    }
}