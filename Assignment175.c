#include<stdio.h>
// Write a program which checks whether first number and last bit is On or OFF .First bit means bit means bit number 1 and last means bit number 32
typedef int BOOL;
typedef unsigned int UINT;
#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x1;
    UINT iResult = 0;
    UINT iPos1 = 1;
    UINT iPos2 = 32;


    UINT iMask1 = iMask << (iPos1 - 1);
    UINT iMask2 = iMask << (iPos2 - 1);


    iMask = iMask1 | iMask2;
    iResult = iMask & iNo;

    if(iResult == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    UINT iNo = 0;
    BOOL bRet = FALSE;

    printf("Enter Number : ");
    scanf("%d",&iNo);

    bRet = ChkBit(iNo);
    if(bRet)
    {
        printf("BIT IS \"HIGH\"\n");
    }
    else
    {
        printf("BIT IS \"LOW\"\n");
    }

    return 0;
}