#include<stdio.h>

//Write a programme which Accepet number from user and return addition of all numbers in between that range
int RangeDisplayEven(int iStar,int iEnd){
    int iCnt =0 ;
    int iSum = 0;
    for(iCnt= iStar ; iCnt<= iEnd ; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum = iSum + iCnt;    
        }
                
    }
    return iSum;
}

int main(){
    int iValue  = 0,iValue2 = 0;
    int iRet =0;
    


    printf("Enter First Value  : ");
    scanf("%d",&iValue);

    printf("Enter Second Value: ");
    scanf("%d",&iValue2);


    iRet = RangeDisplayEven(iValue,iValue2);
    printf("Addition of range is : %d ",iRet);
   
    
    return 0;
}
