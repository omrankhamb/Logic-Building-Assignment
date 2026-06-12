// Write a program to calculate the power of a number using loop
class Logic
{
    public void calculatePower(int iBase, int iExp)
    {
        int iCnt = 0;
        int iAns = 1;
        for(iCnt = 1 ; iCnt <= iExp ; iCnt++)
        {
            iAns = iAns * iBase;
        }
              
        System.out.println("Answer is : "+iAns);
        
    }
}
class Assignment95
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.calculatePower(2,5);

        
    }
}