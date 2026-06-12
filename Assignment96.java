// Write a program to find Summ of all number up to n 

class Logic
{
    public void sumEvenNumbers(int iNum)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0 ; iCnt <= iNum ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of even number is : "+ iSum);
    }
}
class Assignment96
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.sumEvenNumbers(10);

        
    }
}