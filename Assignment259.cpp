/*
    A university wants to genrate students results automatically.
    Each student has marks in five subjets  , each of 100 .
    The result should clearley show whether the student failed in any subject and , if passed , the final classification based 
    on average marks


    Rules :
        if Marks in any subject < 35 -> students is fail
        if student passes all subjects average and classify : 
        Average >= 75 -> Discussions
        Average >= 60 -> First Class
        Average >= 50 -> Second Class
        Average < 50  -> Pass

    Input :
        Five Integers ( marks in 5 subjects )

    validations : 
        Each  Mark must be between 0 and 100

    if fail : Result : Fail
    else :
        Average Marks : < avg >
        Final Result  : < Classification >
*/

# define Fail -1
# define Invalid_marks -2
# define MarksoutOfOrder -2
# define Distinction 1
# define First_class 2
# define Second_class 3
# define Pass 4

#include<iostream>
using namespace std;

class University
{
    int *marks;
    int percentage;

    public : 
        University()
        {
            marks = new int[5];
            percentage = 0;
        }
    public :
        int Student()
        {
            cout<<"Enter Marks of Subjects : "<<endl;

            for ( int i = 0 ; i < 5 ; i++ )
            {
                cin>>marks[i];

                if(marks[i] <0 && marks[i] > 100 )
                {
                    return Invalid_marks;
                }

                if(marks[i] < 35)
                {
                    return Fail;
                }
                percentage += marks[i];
            }

            percentage = (percentage / 500 ) * 100;

            if (percentage >= 75)
            {
                return Distinction;
            }
            else if (percentage >= 60 )
            {
                return First_class;
            }
            else if( percentage >= 50 )
            {
                return Second_class;
            }
            else 
            {
                return Pass;
            }
            
        }
};

int main()
{
    University obj;
    int iRet = 0;

    iRet = obj.Student();

    if(iRet == Fail)
    {
        cout<<"Better Luck next Time";
    }
    else if(iRet == Invalid_marks)
    {
        cout<<"Marks are Invalid";
    }
    else if (iRet == Distinction)
    {
        cout<<"Distinction"<<endl;
    }
    else if(iRet == First_class)
    {
        cout<<"First Class";
    }
    else if(iRet == Second_class)
    {
        cout<<"Second class";
    }
    else if( iRet == Pass)
    {
        cout<<"Pass";
    }
    return 0;
}