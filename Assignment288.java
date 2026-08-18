import java.util.*;
// Write a program to check whether the given number is Automorphic or not

class Assignment288
{

    public static boolean Automorphic(int iNo)
    {
        int itemp = 0;
        int iSum = 0;
        int isquare = iNo * iNo;
        boolean flag = true;
        int idigit = 0;

        while(iNo != 0)
        {
            int x= iNo % 10;
            int y = isquare % 10;

            if(x!=y)
            {
                flag = false;
            }

            iNo = iNo   / 10;
            isquare = isquare / 10;
        }

        return flag;

        
    }


    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if(Automorphic(iNo))
        {
            System.out.println("Numebr is Automorphic ");
        }
        else
        {
            System.out.println("Number is not Automorphic");
        }


    }
}