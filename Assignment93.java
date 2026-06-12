// Check Whethter a number is divisible by 5 and 11 or not
class Logic
{
    public void Chececkdivisible(int num)
    {
        if((num % 5 == 0)  && (num % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11 both");
        }
        else 
        {
            System.out.println("Number is not divisible by both 5 and 11");
        }
        
        
    }
}
class Assignment93
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.Chececkdivisible(55);

        
    }
}