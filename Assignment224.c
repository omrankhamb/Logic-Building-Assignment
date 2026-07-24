#include<stdio.h>

int Factorial(int iNo)
{
    if(iNo == 1)
    {
        return 1;
    }
    return iNo * Factorial(iNo - 1);
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iNo);

    iRet = Factorial(iNo);
    printf("factorail of NUmber is : %d",iRet);

    return 0;
}