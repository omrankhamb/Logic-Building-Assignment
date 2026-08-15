/*
    An e - Commerse platform wnats to compute final payable amount  at checkout .

    Discount are about based on purchse amount , and premium members recieve  an extra discount after the main discount.


    Discount Rules L 
    - Amount  > 5000 -> 20% discount
    - Amount > 2000 ->  10% discount
    - Otherwise -> No Discount

    - Premium members -> extra 5 % discount in the discounted amount

    Input :
    - Purchase amount (integer)
    - Membership type : Premium / Regular

    validations : 
        Amount be > 0
        Membership must be valid : 

 */


class E_Commerce
{
    public int Amount;
    public String memberType;
    public int iDiscount;

    public void Shopping(int Amount,String type)
    {
        this.Amount = Amount;
        memberType = type;
        this.iDiscount = 0;
    }

    public int Discount()
    {
        if(this.Amount > 5000)
        {
            this.iDiscount += 20;
        }
        else if(this.Amount > 2000)
        {
            this.iDiscount +=10;
        }

        if(memberType.equals("premium"))
        {
            this.iDiscount += 5;
        }

        return this.iDiscount;

    }

    public int payableBalance()
    {
        return  (this.Amount - (this.Amount * this.iDiscount) / 100);
    }

}

class Assignment261
{
    public static void main(String Arg[])
    {
        E_Commerce obj = new E_Commerce();
        int iRet = 0;
        obj.Shopping(4000, "premium");
        obj.Discount();
        System.out.println("Discount is  : " + obj.iDiscount);

        iRet = obj.payableBalance();
        System.out.println("Payable balance is : "+iRet);
        

    }
}