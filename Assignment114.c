#include<stdio.h>
/*
INPUT  : iRow = 3 , iCol = 4
OUTPUT :
        *       #       *       #
        *       #       *       #
        *       #       *       #
            
*/
void Pattern(int iRow,int iCol)
{
    int i =0,j = 0;

    for(i = 1 ; i <=iRow ; i++)
    {
        for(j = 1 ; j<=iCol ; j++)
        {
            if(j % 2 == 0)
            {
                printf("#\t");
            }
            else{
                printf("*\t");
            }
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