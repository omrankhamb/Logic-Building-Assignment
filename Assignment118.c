#include<stdio.h>
/*
INPUT  : iRow = 3 , iCol = 5
OUTPUT :
        A       A       A       A       A
        B       B       B       B       B
        C       C       C       C       C
            
*/
void Pattern(int iRow,int iCol)
{
    int i =0,j = 0;
    char ch = '\0';
    for(i = 1,ch = 'A'; i <=iRow ; i++,ch++)
    {
        for(j = 1; j<=iCol ; j++)   
        {
            printf("%c\t",ch);
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of Rows ans coumn :");
    scanf("%d %d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);
    return 0;
}