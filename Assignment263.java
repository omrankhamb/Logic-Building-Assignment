import java.util.*;

/*
    A bank wnats to quickly decide  whether a customer is eligible for a persolana loan
    the system  checks the applicant's details and either approve the loan or rejects with the exact reason

    Eligibilty : Condition
    -> Age 21 to 6o Inclusive
    -> Mpnthly income >= 25000
    -> Credit Score >= 700
    -> Must not have an existing unpaid loan

    Input :
        Age :
        Monthly Income :
        Credit Score
        Existing unpaid loan (yes ?/no)

    validations :
        Age / incomde / score must be non negative
        yes / no must be valid

*/
class Bank
{
    public int age;
    public int income;
    public int score;
    public String unpaidLoan;

    public Bank()
    {
        this.age = 0;
        this.income = 0;
        this.score = 0;
        this.unpaidLoan = null;
    }

    public void setDetails()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Age : ");
        this.age = sobj.nextInt();

        System.out.println("Enter income : ");
        this.income = sobj.nextInt();

        System.out.println("Enter Scoare : ");
        this.score = sobj.nextInt();

        System.out.println("Enter loan status paid / unpiad: ");
        this.unpaidLoan = sobj.nextLine();

    }

    public int CheckCondition()
    {
        int flag = 0;

        if(age < 21 && age > 60)
        {
            flag = -1;
        }

        if(income < 25000)
        {
            flag = -2;
        }

        if(score < 700 )
        {
            flag = -3;
        }

        if(unpaidLoan.equals("no"))
        {
            flag = -4;
        }

        return flag;
    }
    
}

class Assignment263
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Bank obj = new Bank();
        obj.setDetails();

        if(obj.CheckCondition() == 0)
        {
            System.out.println("Loan is approved");
        }
        else 
        {
            System.out.println("Loan is not approved");
        }
    }
}