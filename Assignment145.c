#include<stdio.h>
// Accepet division from user and depends on the division display exam timing  There are 4 divisions in school as A,B,C,D . Exam of Divisions A at 7AM, B at 8.30 AM , aat C at 9.20AM and D at 10.30 AM 
// (Application should be case sensitive)
#define TRUE 1
#define FALSE 0

typedef int BOOL;

void DisplaySchedule(const char ch)
{
    if(ch == 'A')
    {
        printf("Exam at 7AM\n");
    }else if (ch == 'B'){
        printf("Exam is at 8.30AM\n");
    }else if(ch == 'C')
    {
        printf("Exam is at 9.20AM\n");
    }
    else if(ch == 'D')
    {
        printf("Exam is at 10.30AM");
    }else
    {
        printf("DIVISION IS NOT ALLOTED");
    }

}

int main()
{
    char cValue = '\0'; // default value
    
    printf("Enter chracter :");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}