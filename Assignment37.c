#include<stdio.h>

//Write a program which accepet Width and Height of rectangle from user and calculate its area
int KMtoMtr(int iNo){
   return iNo * 1000;

}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter km : ");
    scanf("%f",&iValue);
    iRet = KMtoMtr (iValue);
    printf("Circle area is  %f",iRet);
    
    return 0;
}
