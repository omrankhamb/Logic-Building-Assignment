import java.util.*;

/*
    A hospital bill includes consultation + medicine + room + charges per day. if insurance covers up to 50000 or 70 of bill ( whichever is lower )
    ICU wards cost extra

    Input :=> days , wardType(Normal / ICU ), medicine bill , consultation fees , insured ( yes / no )

    Output : = > totalBill , insuranceCover , finalPay

    validatiaons : all non negative , ward type valid

*/

class HospitalBill
{
    private int days;
    private String wardType;
    private int medicineBill;
    private int consultationfee;
    private String insurance;


    private int  daycharge;
    private int bill;
    public int insurancecover;

    public HospitalBill()
    {
        days = 0;
        wardType = null;
        medicineBill = 0;
        consultationfee = 0;
        insurance = null;
        bill = 0;
        daycharge = 2000;
        insurancecover = 0;

    }

    public void setDetails(int day , String tp , int bill , int fee , String insurance)
    {
        this.days = day;
        this.wardType = tp;
        this.medicineBill = bill;
        this.consultationfee = fee;
        this.insurance = insurance;
    }


    public void createBill()
    {
        // day charges
        bill  = bill + (daycharge * days);

        // Medicine bill
        bill += medicineBill;

        // consultaton bill
        bill += consultationfee;

        if(wardType.equals("icu"))
        {
            bill += (days * 2000);
            // adding more money due to icu wardtype
        }

        if(insurance.equals("yes"))
        {
            insurancecover = (bill * 70)/100;
        }


    }

    public void getbill()
    {
        System.out.println("Your Total Bill : " + bill);
        System.out.println("Insurance Cover : " + insurance);
        System.out.println("Actual amout pay : " + (bill - insurancecover));
    }


}

class Assignment272
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int day = 0;
        String type = null;
        int bill = 0;
        int fee = 0;
        String insurance = null;

        System.out.println("Insurance ( Yes / NO ) ");
        insurance = sobj.nextLine();
        insurance.trim();
        insurance.replaceAll("\\s+"," ");
        insurance.toLowerCase();

        System.out.println("Enter the Ward type ( Normal / ICU ) : ");
        type = sobj.nextLine(); 
        type.trim();
        type.replaceAll("\\s+"," ");
        type.toLowerCase();

        System.out.println("Enter the number of Day : ");
        day = sobj.nextInt();

        

        System.out.println("Enter the bill Amount : ");
        bill = sobj.nextInt();

        System.out.println("fees : ");
        fee = sobj.nextInt();

        

        HospitalBill obj = new HospitalBill();

        obj.setDetails(day,type,bill,fee,insurance);;

        obj.createBill();
        obj.getbill();
    }
}