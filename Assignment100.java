// Write a program to to find Smalleast digit of number

class Logic
{
    public int SmallestDigit(int iNum2)
    {
        int iSmallest = 0;
        iSmallest = iNum2 % 10;

        while (iNum2 != 0) 
        {
            int itemp = iNum2 % 10;
            if(iSmallest > itemp )
            {
                iSmallest = itemp;
            }
            iNum2 = iNum2 / 10 ;
        }

        return iSmallest;
    }
}
class Assignment100
{
    public static void main(String A[])
    {

        int iRet = 0;
        Logic obj =  new Logic();
        iRet =obj.SmallestDigit(83429);

        System.out.println("Largest digit Is : "+iRet);

    }
}