#include<stdio.h>

//Write a programme area in square feet and convert it into squaremeter

double SquareMeter(int iValue){
   return iValue * 0.0929;

}

int main(){
    int iValue  = 0.0;
    double dRet = 0.0;

    printf("Enter feet   : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);
    printf("SquareMeter in 'c id : %f ",dRet);
    
    return 0;
}
