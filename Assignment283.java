import java.util.*;
// Write a program to check whether the given number is strong or not

class Assignment283
{

    public static boolean ArmStrongNumber(int iNo)
    {

        int iTemp = iNo;
        int idigit = 0;
        int iCount = 0;
        int ifact = 1;
        int iSum = 0;

        iTemp = iNo;
        String str = String.valueOf(iNo);
        System.out.println(str);
        iCount = str.length();

        while(iNo != 0)       
        {
            idigit = iNo % 10;
            int x = (int)Math.pow(idigit, iCount);
            iSum = iSum + x;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        return false;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if(ArmStrongNumber(iNo))
        {
            System.out.println("Numebr is ArmStrong");
        }
        else
        {
            System.out.println("Number is not ArmStrong");
        }


    }
}