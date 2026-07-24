#include <stdio.h>
// Write A recursie program display below pattern
Display(int iNo)
{
    if(iNo == 0)
    {
        return;
    }
    printf("*\t",iNo);
    Display(iNo-1);
}

int main()
{
    int iNo = 0;
    printf("Enter A number : ");
    scanf("%d", &iNo);
    Display(iNo);
    return 0;
}