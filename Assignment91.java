// Write A programme to check whether number is leap year or not
class Logic
{
    public boolean checkLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            return true;
        }

        return false;
        
    }
}
class Assignment91
{
    public static void main(String A[])
    {

        boolean bRet = false;
        Logic obj =  new Logic();
        bRet = obj.checkLeapYear(2025);

        if(bRet == true)
        {
            System.out.println("Year is a leap year");
        }
        else{
            System.out.println("year is not leap year");
        }
    }
}