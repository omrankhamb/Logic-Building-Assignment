import java.util.*;
// Write a program to check whether the given number is Armstrong or not

class Assignment284
{

    public static boolean ArmStrongNumber(int iNo)
    {

        int iTemp = iNo;
        int idigit = 0;
        int iCount = 0;
        int ifact = 1;
        int iSum = 0;

        iTemp = iNo;
        for(int i = 1 ; i <= iNo/2 ; i++)       
        {
            if(iNo % i ==0)
            {
                iSum = iSum + i;
            }
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
            System.out.println("Numebr is Perfect");
        }
        else
        {
            System.out.println("Number is not Perfect");
        }


    }
}