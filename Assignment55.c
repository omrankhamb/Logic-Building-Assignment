#include<stdio.h>

//Write a programme which Accepet number from user and display all numbers in between that range in reverse order
int RangeDisplayEven(int iStar,int iEnd){
    int iCnt =0 ;
    int iSum = 0;
    for(iCnt= iEnd ; iCnt >= iStar ; iCnt--)
    {
        printf("%d\t",iCnt);
                
    }
    return iSum;
}

int main(){
    int iValue  = 0,iValue2 = 0;
    


    printf("Enter First Value  : ");
    scanf("%d",&iValue);

    printf("Enter Second Value: ");
    scanf("%d",&iValue2);


    RangeDisplayEven(iValue,iValue2);
   
    
    return 0;
}
