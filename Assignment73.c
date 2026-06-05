#include<stdio.h>
#include<stdlib.h>


//Acepet Number from user and Accepet one another number as NO , and return last Occure of that NO

int  LastOcc(int Arr[],int iLength,int NO)
{
    int iCnt = 0;
    int iIndex = -1;
    for(iCnt = iLength-1 ; iCnt>= 0  ; iCnt--)
    {
        if(Arr[iCnt] == NO)
        {
            iIndex = iCnt;
            break;

        }
    }

    return iIndex;
    
}

int main()
{
    int iSize = 0,iRet = 0,iNo = 0,iValue = 0,iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    printf("Enter the Number : ");
    scanf("%d",&iValue);

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

    iRet = LastOcc(p,iSize,iValue);

    if(iRet == -1)
    {
        printf("there is no such number ");
    }
    else
    {
        printf("First occurence of Number is %d",iRet);
    }

    free(p);

    return 0;
}