// Write a program to Count how many even and odd numbers are present between between 1 To N
class Logic
{
    public void CountEvenOddRange(int n)
    {
        int iCoutEven =  0;
        int iCountOdd = 0;

        while(n != 0)
        {
            int itemp = n %10;
            if(itemp % 2 == 0)
            {
                iCoutEven++;
            }else
            {
                iCountOdd++;
            }
            n = n/ 10;
        }

        System.out.println("Count of Even Digit is : "+iCoutEven);
        System.out.println("Count of Odd Dogit is : "+iCountOdd);
       
    }
}
class Assignment102
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.CountEvenOddRange(83429);


    }
}