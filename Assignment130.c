#include<stdio.h>
/*
    Input = iRow = 4,iCol = 4
    Output : 
        1       2       3       4
        1       @       @       4
        1       @       @       4
        1       2       3       4
        
*/

void Pattern(int iRow,int iCol)
{
    int i = 0, j =0,k=0;
    k = 1;
    char ch = '\0';
    for(i = 1; i<= iRow ; i++)   
    {
        for(j = 1; j <= iCol ; j++)
        {
            if((i == 1) || (j==1) || (i==iRow) || (j== iCol))
            {
                printf("%d\t",j);
            }
            else{
                printf("@\t");
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