#include<stdio.h>
// Write a program which accepet number two numbers from user and TOggle All bits from range

#include<stdio.h>
typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask = 0, iResult = 0;

    // Build mask for the range
    for(int i = iStart; i <= iEnd; i++)
    {
        iMask = iMask | (1 << (i - 1));
    }

    // Toggle bits in that range
    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iNo = 0;
    int iStart = 0, iEnd = 0;
    UINT uRet = 0;

    printf("Enter number and start/end positions: ");
    scanf("%d %d %d", &iNo, &iStart, &iEnd);

    uRet = ToggleBitRange(iNo, iStart, iEnd);

    printf("Updated number is : %d\n", uRet);

    return 0;
}
