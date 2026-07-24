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
    Display(5);
    return 0;
}