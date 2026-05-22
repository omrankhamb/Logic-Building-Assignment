#include<stdio.h>
//Accepet two numbers from user and display first number in second number of times
void Display(int iNo,int iFreqency){
    int iCnt = 0;

    for(iCnt ; iCnt < iFreqency ; iCnt++){
        printf("%d ",iNo);
    }
    
}

int main(){
    int iValuse = 0;
    int iCount = 0;

    printf("Enter Number");
    scanf("%d",&iValuse);

    printf("Enter Freqency");
    scanf("%d",&iCount);

    Display(iValuse,iCount);
    
    return 0;
}