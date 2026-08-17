import java.util.*;
// Write a program to check whether the given number is palindrome or not

class Assignment285
{

    public static boolean ArmStrongNumber(int iNo)
    {
        int itemp = 0;
        int iSum = 0;
        int idigit = 0;
        itemp = iNo;
        int irev = 0;

        while(iNo != 0)
        {
            idigit = iNo % 10;
            irev = irev * 10 + idigit;
            iNo = iNo / 10;
        }

        if(itemp == irev)
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

        if(ArmStrongNumber(iNo))
        {
            System.out.println("Numebr is Palindrome ");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }


    }
}