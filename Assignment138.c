#include<stdio.h>
/*
    Input = iRow = 6,iCol = 6
    Output : 
        #       #       #       #       #       #
        #                               #       #
        #                       #               #
        #               #                       #
        #       #                               #
        #       #       #       #       #       #
        
        
        
*/

void Pattern(int iRow,int iCol)
{
    int i = 0,j = 0;

    for(i=1 ; i <= iRow ; i++)
    {
        for(j = 1 ; j <= iCol ; j++)
        {
            if(j + i == (iCol+1) || (i == 1) || (i == iRow) || (j == 1) || (j == iCol))
            {
                printf("#\t",j);
            }
            else
            {
                printf(" \t");
            }
        }
        printf("\n");
    }
}
int main()
{
    int iValue1 = 0,iValue2 = 0;

    printf("Enter Number From Rows and column : ");
    scanf("%d %d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);


    return 0;
}