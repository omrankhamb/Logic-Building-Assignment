#include<stdio.h>

//Write a programme which Accepet Number from user and return the count of even digits

int  CountEven(int iNo){
   
    if(iNo  < 0 )
    {
        iNo = -iNo;
    }
    int iCountEven = 0;
    while(iNo > 0)
    {
        int iTemp = iNo % 10;
        if(iTemp % 2 == 0)
        {
            iCountEven++;
        }
        iNo = iNo / 10;
    }
    return iCountEven;

}

int main(){
    int iValue  = 0.0;
    int iRet = 0.0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = CountEven(iValue);
    printf("%d",iRet);
    
    return 0;
}
