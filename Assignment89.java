// Write A programme to print to find the sum of even and odd digit separatelty in a number
class Logic
{
    public void SumEvenOddDigits(int n)
    {
        int iCNt = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while (n > 0) {
            int itemp = n % 10;
            if(itemp % 2 == 0 )
            {
                iEvenSum += itemp;
            }else
            {
                iOddSum += itemp;
            }

       }
       System.out.println("Sum of Even digti is : "+ iEvenSum);
       System.out.println("Sum of ODD digit is : "+ iOddSum);
    }
}
class Assignment86
{
    public static void main(String A[])
    {
        Logic obj =  new Logic();
        obj.SumEvenOddDigits(34567);
    }
}