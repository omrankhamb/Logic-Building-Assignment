#include<stdio.h>

//Write a program which accepet Width and Height of rectangle from user and calculate its area
double FhtoCs(float fTemp){
   return (fTemp - 32) * (5 / 9);

}

int main(){
    float fValue  = 0.0;
    double dRet = 0.0;

    printf("Enter Tenprature in Fahrenhit : ");
    scanf("%f",fValue);

    dRet = FhtoCs(fValue);
    printf("Tempratue in 'c id : %f ",dRet);
    
    return 0;
}
