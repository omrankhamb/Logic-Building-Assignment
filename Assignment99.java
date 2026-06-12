// Write a program to to find largest digit of number

class Logic
{
    public int LargestDigit(int iNum2)
    {
        int iLargest = 0;
        iLargest = iNum2 % 10;

        while (iNum2 != 0) 
        {
            int itemp = iNum2 % 10;
            if(iLargest < itemp )
            {
                iLargest = itemp;
            }
            iNum2 = iNum2 / 10 ;
        }

        return iLargest;
    }
}
class Assignment99
{
    public static void main(String A[])
    {

        int iRet = 0;
        Logic obj =  new Logic();
        iRet =obj.LargestDigit(83429);

        System.out.println("Largest digit Is : "+iRet);

    }
}