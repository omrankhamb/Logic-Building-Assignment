#include<stdio.h>
//Write a programme accepet one number from user nad print that number of even numbers on screen



void DisplayFactor(int iNo){
    int i = 0;
    if(iNo <= 0)
    {
        iNo = -iNo;
    }
    for(i = 1 ; i < iNo ; i++){
        if(iNo % i == 0){
            printf("%d ",i);
        }
    }
}

int main(){
    int iValue  = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    DisplayFactor(iValue);
    
    return 0;
}
