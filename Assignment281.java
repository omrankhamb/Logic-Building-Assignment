import java.util.*;
import java.lang.Exception;
/*
    Design a java application to manage cinema hall seeting using a 2d array
    the cinema hall has :

    Rows representing  seat rows 
    column representing sit in each row

    Each seat is represented as 
    0 -> empty 
    1 -> booked
    
    Requirmens :
        your program must
        Count total booked seats 
        Find row with maximum bookings 
        Ceheck if any rows completley full
        Display seat matrix

    Input :
        first Line integer R (rows)
        second line : integer C (columns)
        Next R lines : C Integers 0 to 1

    Validations : 
        R > 0
        C > 0
        matrix value must be either 0 or 1 only 
    Expected output : 
        Total booked seats : <count>
        Row with maximum bookings : Row <Number>
        Full Row exists : <Yes / No >

    if invalid input is found print inavlis input

 */

class CinemaHall
{
    private int Row;
    private int Col;
    private int Arr[][];
    private int TotalbookSeats;
    private int MaximumBookings;
    private int MaxRow;
    private int CompleteRow[];
    private int CountOfRowComplete;
    private String exist;

    CinemaHall()
    {
        Row = 0;
        Col = 0;
        Arr = null;
        TotalbookSeats = 0;
        CompleteRow = null;
        MaximumBookings = 0;
        exist = "No";
    }

    public void Book(int r , int c)
    {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Book the tickets : ");
        Row = r;
        Col = c;

        Arr = new int[Row][Col];
        CompleteRow = new int[Row];


        for(int i = 0 ; i < Row ; i++)
        {
            int Count = 0 ;
            for(int j = 0 ; j < Col ; j++)
            {
                Arr[i][j] = sobj.nextInt();
                if(Arr[i][j] == 1)
                {
                    Count++;
                    TotalbookSeats++;

                }
            }

            if(MaximumBookings < Count)
            {
                MaximumBookings = Count;
                MaxRow = i + 1;
            }

            if(Count == (Row))
            {
                exist = "yes";
            }
        }

    }

    public void getDetails()
    {
        System.out.println("Total booked seats : " + TotalbookSeats);
        System.out.println("Row with maximum bookings : " + MaxRow);
        System.out.println("Full row is exists : " + exist );
        System.out.println("Booked and unbboked seats : ");

        for(int i = 0 ; i < Row ; i++)
        {
            for(int j = 0 ; j  < Col ; j++)
            {
                System.out.print(Arr[i][j] + "    ");
            }
            System.out.println();
        }

    }
}

class Assignment281
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter Number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of column : ");
        iCol = sobj.nextInt();

        CinemaHall obj = new CinemaHall();
        obj.Book(iRow, iCol);
        obj.getDetails();
    }
}