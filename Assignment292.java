import java.util.*;
// Write a program to check whether the given number is Spy or not

class Assignment292
{

    public static boolean Spy(int iNo)
    {
        int itemp = 0;
        int iSum1 = 0;
        int iSum2 = 1;
        int isquare = iNo * iNo * iNo;
        boolean flag = true;
        int idigit = 0;

        while(iNo != 0)
        {
            idigit = iNo % 10;
            iSum1 = iSum1 + idigit;
            iSum2 = iSum2 * idigit;

            iNo = iNo / 10;
        }

        if(iSum1 == iSum2)
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

        if(Spy(iNo))
        {
            System.out.println("Numebr is Spy ");
        }
        else
        {
            System.out.println("Number is not Spy");
        }


    }
}