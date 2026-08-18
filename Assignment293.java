import java.util.*;

// Write a program to check given number is sunny or not



class Assignment293
{
    public static boolean SpyNumber(int n)
    {
        int iSum = 0;
        int iMult = 1;
        int digit = 0;

        while(n != 0)
        {
            digit = n % 10;
            iSum = iSum + digit;
            iMult = iMult * digit;
            n = n/  10; 
        }

        if(iSum == iMult)
        {
            return true;
        }

        return false;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = 0;
        boolean flag = false;

        System.out.println("Enter a number : ");
        n = sobj.nextInt();

        flag = SpyNumber(n);
        if(flag)
        {
            System.out.println("Number is spy number : ");
        }
        else
        {
            System.out.println("Number is not spy number");
        }
    }
}