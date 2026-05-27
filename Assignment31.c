#include<stdio.h>
// Write a Programme accepet its number and display below pattern
void Table(int iNo){
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    int iCnt = 0;
    for(iCnt = 1 ; iCnt<= iNo ; iCnt++)
    {
        printf("*\t");
    }
    for(iCnt = 1 ; iCnt<= iNo ; iCnt++)
    {
        printf("#\t");
    }

}

int main(){
    int iValue = 0;
    printf("Enter Number : ");
    scanf("%d",&iValue);

    Table(iValue);

    
    return 0;
}
