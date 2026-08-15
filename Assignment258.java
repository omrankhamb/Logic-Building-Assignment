/* 
A bank ATM must follow strict safety rules to avoid fraud and ensure customers maintain balance  A customer inserts the cared , checks  their balance  , and request  a withdrawl .

    The ATM must either approve the request  and update the balance or reject it and show the correct reason . 

Rules : 
     Withdrawl amount must be  a multiple  of  $100
     Maximum withdrawl per transactio is $25,000
     After withdrawl , balance must remain at least $1000

Line 1 :  Current balance ( Integer )
Line 2 :  requested  withdrawl amount (integer)

validations : 
    If balance < 0 or withdraw  amount  <= 0  -> invalid input

If succesfull :
    Transaction  Successfull
    Remainng Balance  : $ < New Balance >

if Failed 
    Transaction failed : < Reason >
*/

class  BankATM
{

    public int balance;

    public BankATM()
    {
        this.balance = 0;
    }

    public boolean setBalance(int Amount)
    {
        boolean flag = true;
        if (Amount < 0)
        {
            this.balance = 0;
            flag = false;
        }


        if (flag)
        {
            this.balance = Amount;
        }

        return flag;
    }

    public boolean Transaction(int Amount)
    {
        boolean flag = true;

        if(Amount % 100 != 0)
        {
            flag = false;
        }

        if(Amount >= 25000)
        {
            flag  = false;
        }

        if((this.balance - Amount) < 1000)
        {
            flag = false;
        }

        if(flag)
        {
            this.balance = this.balance - Amount;
        }

        return flag;
    }
}

class Assignment258
{
    public static void main(String Arg[])
    {

        BankATM obj = new BankATM();
        boolean bRet = false;

        bRet = obj.setBalance(20000);

        if(bRet)
        {
            System.out.println("Amout will be Deposited");
        }
        else
        {
            System.out.println("Cash is unable to withdraw");
        }


        bRet = obj.Transaction(500);

        if(bRet)
        {
            System.out.println("Transaction done");
            System.out.println(obj.balance);
        }
        else
        {
            System.out.println("Transaction not done");
        }

    }
}