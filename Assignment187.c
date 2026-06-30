#include<stdio.h>
// Write a program which accepet number two numbers from user and display position of commom ON bits from  that two numbers
typedef unsigned int UINT;
void CommonBits(UINT iNo1,UINT iNo2)
{
    int iCnt = 0;
    iCnt = 1;

    while (iNo1 != 0 || iNo2 != 0)
    {
        if((iNo1 & 1) && (iNo2 & 1)) 
        {
            printf("%d\t",iCnt);
        }

        iNo1 = iNo1 >> 1;
        iNo2 = iNo2 >> 1;
        iCnt++;
    }
}

int main()
{
    UINT iNo = 0;
    UINT iNo1 = 0;
    UINT iRet = 0;
    printf("Enter number : ");
    scanf("%d %d",&iNo,&iNo1);

    CommonBits(iNo,iNo1);
    return 0;
}