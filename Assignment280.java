import java.util.*;
import java.lang.Exception;
/*
    Design a java program that anlyzes student performacse using a 2d matrix A college students in multiple subjects using a mtrix
        Rows represent students
        columns represent subjects
    your program must analyze performance based on matrix
    
    Requirmens :
        calculate total marks of each student
        Identity the toppper (studetn with highest)
        calculate average marks for each subject
        print the studnts who failed in any subject (marks < 35)

    Input :
        first Line integer N (number of students)
        second line : integer M (number of subjects)

    Validations : 
        n > 0
        M > 0
        each marks must be betweeen 0 and 100
    Expected output : 
        if inavlid must be between 0 and 100

    if invalid input is found print inavlis input

 */

class Academic
{
    private int student[][];
    private int noOfStudent;
    private int topper;
    private float average[];
    private int failed[];
    private int Subject;
    private int FailedCount;

    public Academic()
    {   
        student = null;
        noOfStudent = 0;
        topper = 0;
        average = null;
        failed = null;
        Subject = 5;
        FailedCount = 0;
    }

    public void setInformation(int iNo)
    {

        if(iNo <= 0)
        {
            System.out.println("Invalid student");
        }
        Scanner sobj = new Scanner(System.in);
        int MaxMarks = 0;
        this.noOfStudent = iNo;
        student = new int[iNo][this.Subject];
        average = new float[this.Subject];
        failed = new int[iNo];
        
        System.out.println("Enter the student marks One by one subject wise : ");

        System.out.println("Subject ->  " + " Math " + " English " + " Science " + " HIndi " + " Knowledge ");

        for(int i = 0 ; i < noOfStudent  ; i++)
        {
            System.out.print("Student -> "  + (i +1) );
            int x = 0;
            boolean flag = true;
            for(int j = 0 ; j < Subject ; j++)
            {
                student[i][j]  = sobj.nextInt();
                x += student[i][j];
                if(student[i][j] < 35)
                {
                    flag = false;
                }
            }

            if(MaxMarks < x)
            {
                MaxMarks = x;
                this.topper = x;
            }

            if ( flag == false)
            {
                failed[i] = (i + 1);
                FailedCount++;
            }
            
        }

    }

    public void CreateResult()
    {
        for(int i = 0 ; i < this.Subject ; i++)
        {
            float x = 0.0f;
            for(int j = 0 ; j < this.noOfStudent ; j++)
            {
                x += student[j][i];
            }

            x = x   / this.noOfStudent;
            average[i] = x;
        }
    }

    public void getResult()
    {
        System.out.println("Average subjecwise : ");
        System.out.println("Subject -> " + " Math " + " English " + " Science " + " HIndi " + " Knowledge ");
        System.out.print("Average -> ");
        for(int i  = 0 ; i < Subject ; i++)
        {
            System.out.print(average[i] + "   ");
        }

        System.out.println("\nTopper Total is : " + this.topper);
        System.out.println("Faild Student Roll NO : ");

        if(FailedCount == 0)
        {
            System.out.println("No student faild");
        }
        else
        {
            for(int i = 0 ; i < FailedCount ; i++)
            {
                System.out.print(failed[i] + "  " );
            }
        }
        
    }
}




class Assignment280
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter Number of student : ");
        iValue = sobj.nextInt();

        Academic obj = new Academic();

        obj.setInformation(iValue);
        obj.CreateResult();
        obj.getResult();
    }
}