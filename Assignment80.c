#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

//Accepet A numbeers from user and display all such numbers which contains 3 digit in it

int Sum(int iNo)
{
    int iSum = 0;
    while (iNo > 0)
    {
        iSum = iSum + (iNo % 10);
        iNo = iNo /10;

    }

    return iSum;
    
}

void DigitSum(int *Arr,int iSize)
{
    int iCnt = 0;
    int iRet = 0;
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        iRet = Sum(Arr[iCnt]);
        printf("%d\t",iRet);
    }
    
}

int main()
{
    int iSize = 0, iCnt = 0 , iValue = 0 ,iRet = 0;
    int *p = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    p = (int*)malloc(sizeof(int) * iSize);  //(int*) is usedto make pieces of memory location

    if(p == NULL)
    {
        printf("memory not allocated\n");
        exit ;
    }

    printf("Enter Elements : \n");

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",(p+iCnt));
    }

    DigitSum(p,iSize);

    free(p);

    return 0;
}