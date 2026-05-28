#include<stdio.h>

//Write a programme which Accepet Distance in Kilometre and convert into meter 
int  KMtoMeter(int iNo){
   
    return iNo * 1000;

}

int main(){
    int iValue  = 0 ,iRet = 0;

    printf("Enter Distance : ");
    scanf("%d",&iValue);


    iRet = KMtoMeter(iValue);
    printf("Area of Circle is : %f",iRet);
    
    return 0;
}
