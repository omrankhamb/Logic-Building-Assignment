#include<stdio.h>
//Write a programme which Accepet Number from user and 
// if number is less thsn 50 thrn print small , if it is greater than 100 then print medium,if it is greater then 100 then print large
void Number(int iNo){
    
    if(iNo < 50)
    {
        printf("Small");
    }
    else if (iNo >= 50 && iNo <= 100)
    {
        printf("Medium");
    }else
    {
        printf("Large");
    }
    
    
}

int main(){
    int iValue = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    Number(iValue);
    
    return 0;
}
