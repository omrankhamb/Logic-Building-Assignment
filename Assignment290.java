import java.util.*;
// Write a program to check whether the given number is disarium or not

class Assignment290
{

    public static boolean disarium(int iNo)
    {
        int itemp = iNo;
        int iSum = 0;
        int isquare = iNo * iNo;
        boolean flag = true;
        int idigit = 0;

        String str = String.valueOf(iNo);

        int Count = str.length();

        while(iNo != 0)
        {
            idigit = iNo % 10;
            iSum = iSum + (int)Math.pow(idigit, Count);
            Count--;
            iNo = iNo / 10;
        }

        if(iSum == itemp)
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

        if(disarium(iNo))
        {
            System.out.println("Numebr is disarium ");
        }
        else
        {
            System.out.println("Number is not disarium");
        }


    }
}