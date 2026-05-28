#include<stdio.h>

//Write a programme which Accepet a radius from user and calculate its area Consider of PI as 3.14

#define PI 3.14
double  CircleArea(float fRadius){
   
    return PI * fRadius * fRadius;

}

int main(){
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter Radius : ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);
    printf("Area of Circle is : %f",dRet);
    
    return 0;
}
