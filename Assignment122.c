#include<stdio.h>
/*
    Input = iRow = 4,iCol = 4
    Output : 
        1       2       3       4
        5       6       7       8
        9       1       2       3
        4       5       6       7
        
*/

void Pattern(int iRow,int iCol)
{
    int i = 0, j =0,k=0;
    k = 1;
    for(i = 1; i<= iRow ; i++)   
    {
        if(i % 2 == 0)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                printf("%d\t",j*2-1);
            }
        }
        else
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                printf("%d\t",(2*j));
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