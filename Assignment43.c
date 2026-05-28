#include<stdio.h>

//Write a programme which Accepet Number from user and return the count of digits in between 3 and 7

int  CountRange(int iNo){
   
    if(iNo  < 0 )
    {
        iNo = -iNo;
    }
    int iCount = 0;
    while(iNo > 0)
    {
        int iTemp = iNo % 10;
        if(iTemp >= 3 && iTemp <= 7 )
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    return iCount;

}

int main(){
    int iValue  = 0.0;
    int iRet = 0.0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = CountRange(iValue);
    printf("%d",iRet);
    
    return 0;
}
