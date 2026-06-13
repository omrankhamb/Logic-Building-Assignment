#include<stdio.h>
/*
INPUT  : iRow = 3 , iCol = 4
OUTPUT :
        1       2       3       4
        5       6       7       8
        9       10      11      12
        
            
*/
void Pattern(int iRow,int iCol)
{
    int i =0,j = 0,k=0;
    k = 1;
    for(i = iRow; i >=1 ; i--)
    {
        for(j = 1; j<=iCol ; j++)   
        {
            printf("%d\t",k);
            k++;
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