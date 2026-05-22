#include<stdio.h>



void Display(int iNo){
    
    if(iNo < 10){
        printf("Hello");
    }else{
        printf("Demo");
    }
    
}

int main(){
    int iValuse = 0;
    printf("Enter Number :");
    scanf("%d",&iValuse);

    Display(iValuse);
    
    return 0;
}