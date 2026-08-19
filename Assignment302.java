import java.util.*;
// Write a program which accepet matrix and return largest number from both of the diagonals

class Arrayx
{
    public int Arr[][];

    public Arrayx(int Row, int Col) {
        Arr = new int[Row][Col];
    }


    public void getArray()
    {
        Scanner sobj =  new Scanner(System.in);
        System.out.println("Enter the array :");

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public int  DiagonalAddition()
    {
        int iSum = 0;

        for(int i = 0 ; i <  Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public int  FrequencyOfNumber(int iNo)
    {
        int freq = 0;

        for(int i = 0 ; i <  Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {

                if(Arr[i][j] == iNo)
                {
                    freq++;
                }
            }
        }

        return freq;
    }

    public int  LargestFromDiagonals()
    {
        int max =  Arr[0][0];

        for(int i = 0 ; i <  Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {

                if((i == j ) || (i + j)  == (Arr.length - 1))
                {
                    if(max  < Arr[i][j])
                    {
                        max = Arr[i][j];
                    }
                }
            }
        }

        return max;
    }

    public void  SumOfColumn()
    {
        int Sum = 0;

        for(int i = 0 ; i <  Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {

                Sum += Arr[j][i];
            }
            System.out.println(Sum + " ");
            Sum = 0;
        }

        
    }

}

class Assignment302
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Hello");
        int Row = 0;
        int Col = 0;
        int iRet = 0;
        int i = 0;
        int Arr[][] = null;

        System.out.println("Enter Number of Rows : ");
        Row = sobj.nextInt();

        System.out.println("Enter Number of Column : ");
        Col = sobj.nextInt();

        Arrayx obj = new Arrayx(Row, Col);
    
        obj.getArray();

    
        obj.SumOfColumn();


    }
}