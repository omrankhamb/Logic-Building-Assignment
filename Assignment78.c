#include<stdio.h>
#include<stdlib.h>

//Accepet A numbeers from user and return the Difference Between Largest and Smallest number

int Difference(int *Arr,int iSize)
{
    int iCnt = 0;
    int iMax = 0,iMin = 0;

    iMax = Arr[0];
    iMin = Arr[0];


    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        if(iMax < Arr[iCnt])
        {
            iMax = Arr[iCnt];
        }

        if(iMin > Arr[iCnt])
        {
            iMin = Arr[iCnt];
        }
    }

    return iMax - iMin;
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

    iRet = Difference(p,iSize);

    printf("Difference between Largest and Smallest Number is : %d",iRet);

    free(p);

    return 0;
}