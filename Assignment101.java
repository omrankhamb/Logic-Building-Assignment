// Write a program to to calculate the product of digits of anumber
class Logic
{
    public int ProductsOfDigit(int iNum2)
    {
        int iProduct = 1 ;

        while (iNum2 != 0) 
        {
            int itemp = iNum2 % 10;
            iProduct = iProduct * itemp;
            iNum2 = iNum2 / 10 ;
        }

        return iProduct;
    }
}
class Assignment101
{
    public static void main(String A[])
    {

        int iRet = 0;
        Logic obj =  new Logic();
        iRet =obj.ProductsOfDigit(83429);

        System.out.println("Product digit Is : "+iRet);

    }
}