#include<stdio.h>

// Write a recursive program to print a following pattern

Display(int iNo)
{
    if(iNo == 0)
    {
        return;
    }

    printf("%d  *   ",iNo);
    Display(iNo - 1);
}

int main()
{
    int iNo = 0;
    printf("Enter Number : ");
    scanf("%d",&iNo);

    Display(iNo);
    return 0;
}