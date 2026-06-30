#include<stdio.h>
// Write a program which accepet number two numbers from user and checkk whether 9th or 12th bit is ON or OFF

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0
BOOL ChkBit(UINT iNo1)
{
    UINT iMask1 = 1 << (9 - 1);   // 9th bit
    UINT iMask2 = 1 << (12 - 1);  // 12th bit

    if((iNo1 & iMask1) || (iNo1 & iMask2))
    {
        return TRUE;   // at least one bit ON
    }
    else
    {
        return FALSE;  // both OFF
    }

}

int main()
{
    UINT iNo = 0;
    BOOL uRet = FALSE;
    printf("Enter number : ");
    scanf("%d",&iNo);

    uRet =  ChkBit(iNo);
    if(uRet)
    {
        printf("TRUE");

    }
    else
    {
        printf("FALSE");
    }
    return 0;
}