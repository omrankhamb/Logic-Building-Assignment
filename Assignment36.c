#include<stdio.h>

//Write a program which accepet radius of circlr from user and calculate its area Consider value as PI as 3.14 

#define PI 3.14
double CircleArea(float fRadius){
   return PI * fRadius * fRadius;

}

int main(){
    float fValue = 0.0;
    double dRet = 0.0;
    printf("Enter Number : ");
    scanf("%d",&fValue);

    dRet = CircleArea(fValue);
    printf("Circle area is  %f",dRet);
    
    return 0;
}
