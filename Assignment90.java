// Write A programme to print to find the sum of even and odd digit separatelty in a number
class Logic
{
    public void CheckSign(int n)
    {
        if(n < 0)
        {
            System.out.println("NUmmber is ngative ");
        }else if(n == 0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Number is neagative");
        }
    }
}
class Assignment86
{
    public static void main(String A[])
    {
        Logic obj =  new Logic();
        obj.CheckSign(34567);
    }
}