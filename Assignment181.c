#include<stdio.h>
// Write a progam which accepet one number from user and position from user and check whether bit at that position is on or off  if bit is one return true otherwise return false
typedef unsigned int UINT;
typedef int BOOL;
#define TRUE 1
#define FALSE 0
BOOL ChkBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;
    iMask = iMask << (iPos -1);

    iResult = iNo & iMask;
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
    UINT iPos = 0;
    BOOL bRet = FALSE;

    printf("Enter Number and Position: ");
    scanf("%d %d",&iNo,&iPos);

    

    bRet = ChkBit(iNo,iPos);

    if(bRet)
    {
        printf("TRUE\n");

    }else
    {
        printf("FALSE");
    }

    return 0;
}