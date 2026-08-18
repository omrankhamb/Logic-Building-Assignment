import java.util.*;
// Write a program to check whether the given number is neon or not

class Assignment287
{

    public static boolean Neon(int iNo)
    {
        int itemp = 0;
        int iSum = 0;
        int isquare = iNo * iNo;
        int idigit = 0;
        itemp = iNo;
        int irev = 0;

        while(isquare != 0)
        {
            idigit = isquare % 10;
            iSum = iSum + idigit;
            isquare = isquare / 10;
        }

        if(iSum == iNo)
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

        if(Neon(iNo))
        {
            System.out.println("Numebr is Neon ");
        }
        else
        {
            System.out.println("Number is not Neon");
        }


    }
}