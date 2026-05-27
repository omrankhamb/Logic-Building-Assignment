#include<stdio.h>
// Write a Programme accepet its number and print the table
void Table(int iNo){
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    int iCnt = 0;
    for(iCnt = 1 ; iCnt<= 10 ; iCnt++)
    {
        printf("%d\t",iNo*iCnt);
    }

}

int main(){
    int iValue = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    Table(iValue);

    
    return 0;
}
