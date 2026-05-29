#include<stdio.h>

//Write a programme which Accepet number from user and display all Even numbers in between that range
void RangeDisplayEven(int iStar,int iEnd){
    int iCnt =0 ;
    for(iCnt= iStar ; iCnt<= iEnd ; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            printf("%d\t",iCnt);
        }
        
    }

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
