import java.util.*;
import java.lang.Exception;
/*
    A Fitness app records stpes for 7 days . it wants show how many days user acheived the goal and what the highest step count was

    Input :
        7 Integers 

    Validations : 
        Step must be > 0
    Expected output : 
        Goals achieved days : <count>
        Maximum Steps in Week : <value>
*/

class fitness
{
    private int goal;
    private int days[];
    private int Maxsteps; 
    private int GoalCount;  

    public fitness()
    {   
        this.goal = 6000;
        days = new int[7];
        this.Maxsteps = 0;
    }
    public void setInforamtion()
    {
        System.out.println("Enter the Number of steps in days : ");

        Scanner sobj = new Scanner(System.in);

        for(int i = 0 ; i < 7 ; i++)
        {
            System.out.println("Enter steps of Days : " +(i + 1)+" >> ");
            days[i] = sobj.nextInt();
            if(days[i] >= goal)
            {
                GoalCount++;
            }

            if(Maxsteps < days[i])
            {
                Maxsteps = days[i];
            }

        }

    }

    public void start()
    {
        System.out.println("Goal achieved days : " + this.GoalCount);
        System.out.println("Maxumim steps in Week : " + this.Maxsteps);
    }
}




class Assignment279
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        fitness obj = new fitness();
        obj.setInforamtion();
        obj.start();
    }
}