#include<stdio.h>
// Write a Programme to find a factorial of Number
int Factorail(int iNo){
    if(iNo < 0){
        iNo = -iNo;
    }
    int iFact = 1;
    while(iNo>0){
        iFact = iFact * iNo;
        iNo--;
    }

    return iFact;
}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = Factorail(iValue);

    printf("Factorial of Number is : %d ",iRet);
    
    return 0;
}
