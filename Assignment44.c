#include<stdio.h>

//Write a programme which Accepet Number from user and return multiplication of all digit

int  MultDigits(int iNo){
   
    if(iNo  < 0 )
    {
        iNo = -iNo;
    }
    int iCount = 1;
    while(iNo > 0)
    {
        int iTemp = iNo % 10;
        iCount = iCount * iTemp;
        iNo = iNo / 10;
    }
    return iCount;

}

int main(){
    int iValue  = 0.0;
    int iRet = 0.0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);
    printf("%d",iRet);
    
    return 0;
}
