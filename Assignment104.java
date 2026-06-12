// Write a program to Count Total Number of factors of a given number

class Logic
{
    public int  CountFactors(int n)
    {
        int iCnt = 0;
        int iCountFactors = 0; 
        for(iCnt = 1 ; iCnt < n ; iCnt++)
        {
            if(n % iCnt == 0)
            {
                iCountFactors++;
            }
        }

        return iCountFactors;
       
    }
}
class Assignment104
{
    public static void main(String A[])
    {

        int iRet = 0;
        Logic obj =  new Logic();
        iRet = obj.CountFactors(12);

        System.out.println("Numer of Count Factors is : "+iRet);


    }
}