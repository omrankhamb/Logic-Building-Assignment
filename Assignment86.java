// Write A programme to print mltiplcation of table

class Logic
{
    public void checkprime(int num)
    {
        int iCnt = 0; 
        for(iCnt = 2; iCnt < (num / 2) ; iCnt++)
        {
            if(num % iCnt == 0)
            {
                break;
            }

        }
        System.out.println(iCnt+" "+ num/2);
        if(iCnt == (num /2))
        {
            System.out.println("Number is prime");
        }else
        {
            System.out.println("Number is not prime");
        }
        
    }
}
class Assignment86
{
    public static void main(String A[])
    {
        Logic obj =  new Logic();
        obj.checkprime(11);
    }
}