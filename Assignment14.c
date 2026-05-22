#include<stdio.h>
//Accepet one character from user and convert case of that character



void DisplayConvert(char Cvalue){
    if(Cvalue >= 65 && Cvalue <= 97)
    {
        printf("%c",Cvalue+32);
    }
    else{
        printf("%c",Cvalue-32);
    }
}

int main(){
    char CValue  = 0;
    printf("Enter Number : ");
    scanf("%c",&CValue);

    DisplayConvert(CValue);
    
    return 0;
}
