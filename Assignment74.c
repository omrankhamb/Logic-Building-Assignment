#include<stdio.h>
#include<stdlib.h>


//Accepet N numbers from user and accepet Range,Display all elements from range

void Range(int Arr[],int iLength,int iStart,int iEnd)
{
    int iCnt = 0;
    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if(Arr[iCnt] <= iEnd && Arr[iCnt] >= iStart)
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
    
}

int main()
{
    int iSize = 0,iRet = 0,iNo = 0,iValue1 = 0,iValue2 = 0,iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    printf("Enter the Number : ");
    scanf("%d",&iValue1);

    printf("Enter the Number : ");
    scanf("%d",&iValue2);

    p = (int*)malloc(iSize*sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate Memory");
        return -1;
    }

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        printf("Enter element : %d ",iCnt + 1);
        scanf("%d",(p + iCnt));
    }

    Range(p,iSize,iValue1,iValue2);

    free(p);

    return 0;
}