// Write a program to Print all numbers from 1 TO N Divisible by both 2 and 3

class Logic
{
    public void PrintDivisibleBy2And3(int n)
    {
        int iCnt = 0;
        for(iCnt = 1 ; iCnt <=n ; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println("Divisible by both 2 and 3 : "+iCnt);
            }
        }

    }
}
class Assignment105
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.PrintDivisibleBy2And3(30);



    }
}