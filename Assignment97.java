// Write a program to find Summ of all number up to n 

class Logic
{
    public void Reverse(int iNum)
    {
        while (iNum != 0) 
        {
            System.out.print(iNum%10);
            iNum = iNum / 10;
        }
    }
}
class Assignment97
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.Reverse(10);

        
    }
}