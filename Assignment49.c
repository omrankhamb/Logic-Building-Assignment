#include<stdio.h>

//Write a programme which Accepet Tempratue in Fahrenheit and convert it into celsius 
double  FHtoCs(float fTemp){
   
    double iREt = 0 ;
    iREt  = (fTemp - 32) * (5/9);

}

int main(){
    float fValue  = 0 ;
    double dRet = 0;


    printf("Enter Distance : ");
    scanf("%d",&fValue);


    dRet = FHtoCs(fValue);
    printf("Area of Circle is : %f",dRet);
    
    return 0;
}
