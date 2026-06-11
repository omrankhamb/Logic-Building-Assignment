// Write A programme to print to print all Even numers betwen interval

class Logic
{
    public void printEvenNumbers(int n)
    {
        int iCnt = 0 ;
        for(iCnt = 0 ; iCnt < n ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Assignment86
{
    public static void main(String A[])
    {
        Logic obj =  new Logic();
        obj.printEvenNumbers(11);
    }
}