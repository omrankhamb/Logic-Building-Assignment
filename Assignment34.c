#include<stdio.h>

//Write a program to find a even factorial of number

int OddFactorial(int iNo){
   int iAns = 1;
   if(iNo < 0)
   {
    iNo = -iNo;
   }
   int iCnt = 0;
   for(int iCnt = 1 ; iCnt <= iNo ; iCnt++)
   {
        if(iCnt % 2 != 0)
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

    iRet = OddFactorial(iValue);
    printf("value in INR is : %d",iRet);
    
    return 0;
}
