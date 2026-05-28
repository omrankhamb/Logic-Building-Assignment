#include<stdio.h>

//Write a programme which Accepet Height and rectangle from user and calculate its area

double  RectArea(float fWidth, float fHeight){
   
    return fHeight * fWidth;

}

int main(){
    float fValue1 = 0.0,fValue2 = 0.0;
    double dRet = 0.0;

    printf("Enter Width : ");
    scanf("%f",&fValue1);

    printf("Enter height : ");
    scanf("%f",&fValue2);


    dRet = RectArea(fValue1,fValue2);
    printf("Area of Circle is : %f",dRet);
    
    return 0;
}
