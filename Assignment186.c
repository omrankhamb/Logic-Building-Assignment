#include<stdio.h>
// Write a program which accepet number from user and count number of ON(1) bit in it without using % ans / operator
typedef unsigned int UINT;
int CountOne(UINT iNo)
{
    int iCnt = 0;

    while (iNo != 0)
    {
        if(iNo & 1)
        {
            iCnt++;
        }

        iNo = iNo >> 1;
        
    }

    return iCnt;
    

}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;
    printf("Enter number : ");
    scanf("%d",&iNo);

    iRet = CountOne(iNo);
    printf("Number of one is : %d\n",iRet);
    return 0;
}