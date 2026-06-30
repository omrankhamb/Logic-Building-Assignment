#include<stdio.h>
// Write a progam which accepet one number from user and position from user and Toggle that bit . Return modified number

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x1 << (iPos - 1);
    return iNo ^ iMask;
    

}

int main()
{

    UINT iNo = 0;
    UINT iPos = 0;
    UINT uRet = 0;

    printf("Enter Number and Position: ");
    scanf("%d %d",&iNo,&iPos);

    

    uRet = ToggleBit(iNo,iPos);

    printf("Updated number is : %d\n",uRet);

    return 0;
}