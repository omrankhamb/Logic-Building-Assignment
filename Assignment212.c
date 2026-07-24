#include <stdio.h>
// Write a recusive program which display below pattern
Display(int iNo)
{
    if(iNo == 0)
    {
        return;
    }
    Display(iNo-1);
    printf("%d\t",iNo);
}

int main()
{
    int iNo = 0;
    printf("Enter A number : ");
    scanf("%d", &iNo);
    Display(iNo);
    return 0;
}