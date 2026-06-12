// Write a program to Count how many even and odd numbers are present between between 1 To N
class Logic
{
    public void displayFactors(int n)
    {
        int iCnt = 0;
        
        for(iCnt = 1 ; iCnt < n ; iCnt++)
        {
            if(n % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
       
    }
}
class Assignment103
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.displayFactors(12);


    }
}