// Write a program print each digit of number separatley
class Logic
{
    public void printDigits(int num)
    {
        while (num != 0) 
        {
            System.out.println(num  % 10);
            num = num / 10;
            
        }       
        
    }
}
class Assignment94      
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.printDigits(9876);

        
    }
}