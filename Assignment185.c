#include<stdio.h>
// Write a progam which accepet one number from user and position from user and Toggle Contents of first and last nibble of the number . return modified number(Nibble group of four bits)

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0xF000000F;   // mask for first and last nibble
    return iNo ^ iMask;        // toggle those bits

}

int main()
{

    UINT iNo = 0;
    UINT uRet = 0;

    printf("Enter Number and Position: ");
    scanf("%d",&iNo);

    

    uRet = ToggleBit(iNo);

    printf("Updated number is : %d\n",uRet);

    return 0;
}