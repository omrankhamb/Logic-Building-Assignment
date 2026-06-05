#include<stdio.h>
#include<stdlib.h>

//Accepet A numbeers from user and return the Smallest number

int Minimum(int *Arr,int iSize)
{
    int iCnt = 0;
    int iMin = 0;
    iMin = Arr[0];

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        if(iMin > Arr[iCnt])
        {
            iMin = Arr[iCnt];
        }
    }

    return iMin;
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


    iRet = Minimum(p,iSize);

    printf("Smallest Number is : %d",iRet);

    free(p);

    return 0;
}