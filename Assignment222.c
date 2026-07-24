#include<stdio.h>



int Addition(int iNo)
{
    static int Sum = 0;
    if(iNo == 0)
    {
        return;
    }

    Sum = Sum + (iNo % 10);
    Addition(iNo/10);

    return Sum;
}

int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter A number : ");
    scanf("%d",&iValue);

    iRet = Addition(iValue);
    printf("Summation of number is : %d",iRet);


    return 0;
}