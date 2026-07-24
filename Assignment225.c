#include<stdio.h>
// Write a recursive program which accpepet number from user and return its product


int Mult(int iNo)
{
    if(iNo == 0)
    {
        return 1;
    }

    return (iNo %10) * Mult(iNo / 10);
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iNo);

    iRet = Mult(iNo);
    printf("factorail of NUmber is : %d",iRet);

    return 0;
}