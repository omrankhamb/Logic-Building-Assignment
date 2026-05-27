#include<stdio.h>
//Write a programme which Accepet Number from user and 
// if number is less thsn 50 thrn print small , if it is greater than 100 then print medium,if it is greater then 100 then print large
void Display(int iNo){
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    if(iNo == 1)
    {
        printf("ONE");
    }
    else if (iNo == 2)
    {
        printf("TWO");
    }else if(iNo == 3)
    {
        printf("THREE");
    }
    else if(iNo == 4)
    {
        printf("FOUR");
    }
    else if(iNo == 5)
    {
        printf("FIVE");
    }
    else if(iNo == 6)
    {
        printf("SIX");
    }
    else if(iNo == 7)
    {
        printf("SEVEN");
    }
    else if(iNo == 8)
    {
        printf("EIGHT");
    }
    else if(iNo == 9)
    {
        printf("NINE");
    }
    else
    {
        printf("ZERO");
    }
    
    
}

int main(){
    int iValue = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    Number(iValue);
    
    return 0;
}
