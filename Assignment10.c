#include<stdio.h>
//Accepet number from user and check whether number is even or odd

typedef int BOOL;
#define TRUE 1
#define FALSE 0


BOOL ChkEven(int iNo){
    if(iNo % 2 == 0){
        return TRUE;
    }else{
        return FALSE;
    }
}

int main(){
    int iValuse = 0;
    BOOL bRet = FALSE;

    printf("Enter numnber :");
    scanf("%d",&iValuse);

    bRet = ChkEven(iValuse);
    if(bRet == TRUE){
        printf("Number is Even");
    }else{
        printf("Number is odd");
    }
    
    return 0;
}
