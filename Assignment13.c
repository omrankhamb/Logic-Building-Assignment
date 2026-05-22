#include<stdio.h>
//Write a programme accepet one number from user and print Even FFactors of That



void DisplayEvenFactor(int iNo){
    int i = 0;
    if(iNo <= 0)
    {
        iNo = -iNo;
    }
    for(i = 1 ; i < iNo ; i++){
        if(iNo % i == 0 && iNo % 2 == 0){
            printf("%d ",i);
        }
    }
}

int main(){
    int iValue  = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);
    
    return 0;
}
