#include<stdio.h>

int Reverse(int iNo)
{
    static int i= 0;
    if(iNo == 0)
    {
        return;
    }

    i = (i * 10) + (iNo % 10);
    iNo = iNo / 10;

    Reverse(iNo);
    return i;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("enter a number : ");
    scanf("%d",&iNo);

    iRet = Reverse(iNo);
    printf("Reverse Digit is:  %d",iRet);
    return 0;
}