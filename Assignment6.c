#include<stdio.h>



void Display(int iNo){
    int iCnt = 0;
    while(iCnt < iNo){
        printf("*\n");
        iCnt++;
    }
}

int main(){
   int iValuse = 0;
    printf("Enter Number :");
    scanf("%d",&iValuse);

    Display(iValuse);
    
    return 0;
}