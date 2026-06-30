#include<stdio.h>
// Write a program which accepet number two numbers from user and checkk whether 9th or 12th bit is ON or OFF

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0
BOOL ChkBit(UINT iNo1,UINT ipos1,UINT ipos2)
{
    UINT iMask1 = 1 << (ipos1 - 1);   // 9th bi
    UINT iMask2 = 1 << (ipos2 - 1);  // 12th bit

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

    UINT ipos1 = 0;
    UINT ipos2 = 0;
    printf("Enter number and position: ");
    scanf("%d %d %d",&iNo,&ipos1,&ipos2);

    uRet =  ChkBit(iNo,ipos1,ipos2);
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