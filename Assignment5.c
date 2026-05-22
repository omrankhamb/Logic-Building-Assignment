#include<stdio.h>



void Accepet(int iNo){
    int iCnt = 0;
    for(int i = 0 ; i< iNo ; i++){
        printf(("*\n"));
    }
}

int main(){
   int iValuse = 0;
   iValuse = 5;

   Accepet(iValuse);
   


    return 0;
}