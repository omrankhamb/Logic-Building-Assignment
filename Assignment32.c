#include<stdio.h>
// Accepet amount in us dollar and return its corresponding value in indian currecncy conisder 1$ as 70 rupees
int DollarToINR(int iNo){
   return iNo * 70;

}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);
    printf("value in INR is : %d",iRet);
    
    return 0;
}
