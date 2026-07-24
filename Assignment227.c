#include<stdio.h>

int Largest(int iNo)
{
    static int i  = 0;
    if(iNo == 0)
    {
        return;
    }
    
    if(i < (iNo % 10))
    {
        i = iNo % 10;
    }
    iNo = iNo / 10;
    Largest(iNo);
    return i;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("enter a number : ");
    scanf("%d",&iNo);

    iRet = Largest(iNo);
    printf("Largest Digit is:  %d",iRet);
    return 0;
}