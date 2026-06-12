// Write a program to check whether number is perfect or not 

class Logic
{
    public boolean CheckPerfect(int iNum2)
    {
        int iNum = iNum2;
        int iAns = 0;
        while (iNum2 != 0) 
        {
            int itemp = iNum2 % 10;
            iAns = iAns + (itemp * itemp * itemp);
            iNum2 = iNum2 / 10;
        }

        if(iNum == iAns)
        {
            return true;   
        }
        return false;
    }
}
class Assignment98
{
    public static void main(String A[])
    {

        boolean bRet = false;
        Logic obj =  new Logic();
        bRet =  obj.CheckPerfect(153);

        if(bRet == true)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("NUmber is npt perfect");
        }

        
    }
}