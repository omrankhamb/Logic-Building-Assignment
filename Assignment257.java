import java.util.*;

// In your college library , students borrow books  for exam and assignments .
// The librarian want an automtaic fine calculator so that staff do not to calculate fines manually for every 
// Student 
// As per policy , a student can keep a borrowed  book for upto 7 days withiut penalty if the book is returned late 
// The fine depends late , the fine depends on how many days the student kept the book on total


class library
{
    public int totalDays;
    public int penalty;

    public library()
    {
        System.out.println("Welcome to Libraray");
        
    }

    public void setBook(int day)
    {
        if(day < 0)
        {
            System.out.println("Book Is not Issued");
            return;
        }

       this.totalDays = day;
       this.penalty = 0;

       System.out.println("Book Is Issued");
    }

    public int TotalPenalty()
    {
        if(this.totalDays <= 7)
        {
            this.penalty = 0;
        }
        else
        {
            if(this.totalDays >= 8 && this.totalDays <= 12)
            {
                this.penalty = (this.totalDays - 7) * 5;
            }
            else if (this.totalDays > 12)
            {
                this.penalty = (this.totalDays  - 12) * 10;
            }
        }

        return this.penalty;
    }
}

class Assignment257
{
    
    public static void main(String [] args)
    {
        Scanner sobj = new Scanner(System.in);
        int day = 0;
        int iRet = 0;

        System.out.println("Enter Number of Days : ");
        day = sobj.nextInt();


        library obj = new library();
        obj.setBook(day);

        iRet = obj.TotalPenalty();
        System.out.println("Toatal penalty is : " + iRet);




    }
}