#include<stdio.h>

int Smallest(int iNo)
{
    static int i;
    if(iNo == 0)
    {
        return;
    }
    i = iNo % 10;
    if(i  > (iNo % 10))
    {
        i = iNo % 10;
    }
    iNo = iNo / 10;
    Smallest(iNo);
    return i;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("enter a number : ");
    scanf("%d",&iNo);

    iRet = Smallest(iNo);
    printf("Smallest Digit is:  %d",iRet);
    return 0;
}