#include<stdio.h>

//Write a program to find a factorial of number

int EvenFactorial(int iNo){
   int iAns = 1;
   if(iNo < 0)
   {
    iNo = -iNo;
   }
   int iCnt = 0;
   for(int iCnt = 1 ; iCnt <= iNo ; iCnt++)
   {
        if(iCnt % 2 == 0)
        {
            iAns = iAns * iCnt;
        }
   }

   return iAns;

}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);
    printf("value in INR is : %d",iRet);
    
    return 0;
}
