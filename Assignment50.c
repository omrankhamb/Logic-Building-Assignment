#include<stdio.h>

//Write a programme which Accepet Area in square feet and convert it into square meter
double  SquareMeter(int iValue){
   
    return iValue * 0.0929;

}

int main(){
    int iValue  = 0 ;
    double dRet = 0;


    printf("Enter Value in Square feet : ");
    scanf("%d",&iValue);


    dRet = SquareMeter(iValue);
    printf("Area of Circle is : %f",dRet);
    
    return 0;
}
