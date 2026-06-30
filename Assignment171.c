#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;
#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x1;
    UINT iResult = 0;
    UINT iPos = 15;
    iMask = iMask << (iPos -1);

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