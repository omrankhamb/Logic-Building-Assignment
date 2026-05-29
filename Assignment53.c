#include<stdio.h>

//Write a programme which Accepet number from user and return addition of all numbers in between that range
int RangeSum(int iStar,int iEnd){
    int iCnt =0 ;
    int iSum = 0;
    for(iCnt= iStar ; iCnt<= iEnd ; iCnt++)
    {
        iSum = iSum + iCnt;        
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


    iRet = RangeSum(iValue,iValue2);
    printf("Addition of range is : %d ",iRet);
   
    
    return 0;
}
