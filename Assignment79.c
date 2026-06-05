#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

//Accepet A numbeers from user and display all such numbers which contains 3 digit in it

bool CheckThreeDigit(int iNo)
{
    int iCountdigit = 0;

    while (iNo != 0)
    {
        iCountdigit++;
        iNo = iNo / 10;
    }

    if(iCountdigit == 3)
    {
        return true;
    }

    return false;
    
}

void Display(int *Arr,int iSize)
{
    int iCnt = 0;
    bool bRet = false;
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        bRet = CheckThreeDigit(Arr[iCnt]);
        if(bRet)
        {
            printf("%d\t",Arr[iCnt]);
        }
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

    Display(p,iSize);

    free(p);

    return 0;
}