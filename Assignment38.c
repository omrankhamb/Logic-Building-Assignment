#include<stdio.h>

//Write a program which accepet Width and Height of rectangle from user and calculate its area
double RectArea(float fWidth , float fHeight){
   return fWidth * fHeight;

}

int main(){
    float fValue1 = 0.0,fValue2 = 0.0;
    double dRet = 0.0;
    printf("Enter Width : ");
    scanf("%f",&fValue1);

    printf("Enter Height : ");
    scanf("%f   ",&fValue2);

    dRet = RectArea (fValue1,fValue2);
    printf("Circle area is  %f",dRet);
    
    return 0;
}
