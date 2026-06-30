#include<stdio.h>
// set first 4 bit of number to high
typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0xF;        // mask for first 4 bits
    return iNo | iMask;      // turn ON first 4 bits

}

int main()
{

    UINT iNo = 0;
    UINT uRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iNo);

    uRet = OnBit(iNo);

    printf("Updated number : %d",uRet);


    return 0;
}