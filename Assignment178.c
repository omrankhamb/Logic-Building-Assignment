#include<stdio.h>
// Write a program which accept one number from user and off 7th and 10th bit of that number if it is in. Return modified number

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x1;
    UINT iResult = 0;
    UINT iPos1 = 7;
    iMask = iMask << (iPos1 -1);

    iResult = iNo ^ iMask;

    return iResult;
   
}
int main()
{
    UINT iNo = 0;
    UINT uRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iNo);

    uRet = ToggleBit(iNo);
    printf("Updated number is : %d",uRet);

    

    return 0;
}