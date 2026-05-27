#include<stdio.h>
// Write a Programme accepet its number and display number from reverse order
void Table(int iNo){
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    int iCnt = 0;
    for(iCnt = 10 ; iCnt>0 ; iCnt--)
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
