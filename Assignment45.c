#include<stdio.h>

//Write a programme which Accepet Number from user and return Difference Between summation of meven Digits and Summation of odd digits

int  Countdiff(int iNo){
   
    if(iNo  < 0 )
    {
        iNo = -iNo;
    }
    int iSummationofEven = 0;
    int iSummationofOdd = 0;

    while(iNo > 0)
    {
        int iTemp = iNo % 10;
        if(iTemp % 2 == 0)
        {
            iSummationofEven += iTemp;
        }
        else
        {
            iSummationofOdd += iTemp;
        }
        
        iNo = iNo / 10;
    }
    return iSummationofEven - iSummationofOdd;

}

int main(){
    int iValue  = 0.0;
    int iRet = 0.0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = Countdiff(iValue);
    printf("%d",iRet);
    
    return 0;
}
