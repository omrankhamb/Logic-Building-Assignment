import java.util.*;
import java.lang.Exception;
/*
    An online election system stores votes by voterID .Every voter can vpte only once . if the same id appears again , the voste must be rejected and counted as a duplicate .
    Rules :
        3000 per day
        It stays > 7 days 5 % dicount on total bill

    Input :
        Number of Votes N
        N voter IDs

    Validations : 
        N >= 0
        Ids must be non - negative integers 

    Expected output : 
        Valid votes : <coutn>
        Rejected duplicate Votes : <count>
*/

class Election
{
    private int noOfVotes;
    private int VoterId[];
    private Hashtable<Integer,Integer> obj;
    private int validVotes;
    private int DuplicateVotes;

    public Election()
    {   
        noOfVotes = 0;
        obj = new Hashtable<Integer,Integer>();
    }

    public void setDetails(int No)
    {
        this.noOfVotes = No;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Voter Id's One by One : ");

        for(int i = 1 ; i <= noOfVotes ; i++)
        {
            int x = sobj.nextInt();

            if(obj.containsKey(x))
            {
                int y = obj.get(x);
                obj.put(x, y+1);
            }
            else
            {
                obj.put(x,1);
            }
        }

        System.out.println(obj);
    }

    public void start()
    {
        for(Integer Key : obj.keySet())
        {
            if(obj.get(Key) == 1)
            {
                this.validVotes +=1;
            }
            else if(obj.get(Key) == 2)
            {
                this.DuplicateVotes +=1;
            }
        }

        System.out.println("Valis votes Are : " + this.validVotes);
        System.out.println("Duplcates votes are : " + this.DuplicateVotes);
    }
}




class Assignment278
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number Voters  : ");
        iValue = sobj.nextInt();

        Election obj = new Election();
        obj.setDetails(iValue);
        obj.start();

    }
}