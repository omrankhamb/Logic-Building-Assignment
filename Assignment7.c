#include<stdio.h>



void Display(int iNo){
    
    while(iNo>0){
        printf("*\n");
        iNo--;
    }
}

int main(){
   int iValuse = 0;
    printf("Enter Number :");
    scanf("%d",&iValuse);

    Display(iValuse);
    
    return 0;
}