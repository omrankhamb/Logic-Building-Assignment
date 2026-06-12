// Write A programme to display grade of student based marks
class Logic
{
    public void displayGrade(int iMarks)
    {
        if(iMarks > 100)
        {
            System.out.println("ENter valid marks");
        }


        if(iMarks >= 90)
        {
            System.out.println("grade you gaot is : "+"A+");
        }else if(iMarks >= 80 && iMarks <90)
        {
            System.out.println("Grade you got is : A");
        }else if(iMarks >= 70 && iMarks < 80)
        {
            System.out.println("GGrade you got : B+");
        }else if(iMarks >= 60 && iMarks < 70)
        {
            System.out.println(" Grade you got is :  C");
        }
        else{
            System.out.println("You got a grade is  : D");
        }
        
        
    }
}
class Assignment92
{
    public static void main(String A[])
    {

        Logic obj =  new Logic();
        obj.displayGrade(81);

        
    }
}