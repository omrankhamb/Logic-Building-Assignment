#include<stdio.h>

//Write a program to find a factorial of number

int FactorialDiff(int iNo){
   int iEvenFactorial = 1;
   int iOddFactorial = 1;
   if(iNo < 0)
   {
    iNo = -iNo;
   }
   int iCnt = 0;
   for(int iCnt = 1 ; iCnt <= iNo ; iCnt++)
   {
        if(iCnt % 2 == 0)
        {
            iEvenFactorial = iEvenFactorial * iCnt;
        }

        if(iCnt % 2 != 0 )
        {
            iOddFactorial = iOddFactorial * iCnt;
        }
   }

   return iEvenFactorial - iOddFactorial;

}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);
    printf("value in INR is : %d",iRet);
    
    return 0;
}
