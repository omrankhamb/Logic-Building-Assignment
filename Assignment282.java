import java.util.*;
// Write a program to check whether the given number is string or not

class Assignment282
{

    public static boolean StrongNumber(int iNo)
    {

        int iTemp = iNo;
        int idigit = 0;
        int ifact = 1;
        int iSum = 0;

        while(iNo != 0)
        {
            idigit = iNo % 10;
            ifact = 1;
            while(idigit != 0)
            {
                ifact  = ifact * idigit;
                idigit--;
            }

            iSum = iSum + ifact;

            if(iSum  > iTemp)
            {
                break;
            }

            iNo = iNo / 10;
        }
        
        if(iTemp == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if(StrongNumber(iNo))
        {
            System.out.println("Numebr is Strong");
        }
        else
        {
            System.out.println("Number is not Strong");
        }


    }
}