#include<stdio.h>
//Accepet one character from user and convert case of that character



void Vowel(char Cvalue){
    if(Cvalue == 'a' || Cvalue == 'e' || Cvalue == 'i' || Cvalue == 'o' || Cvalue == 'u' ||Cvalue == 'A' || Cvalue == 'E' ||Cvalue == 'I' ||Cvalue == 'O' ||Cvalue == 'U')
    {
        printf("Is a vowel");
    }
    else{
        printf("Is not a Vowel");
    }
}

int main(){
    char CValue  = 0;
    printf("Enter Number : ");
    scanf("%c",&CValue);

    Vowel(CValue);
    
    return 0;
}
