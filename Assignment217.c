#include <stdio.h>
// Write A recursie program display below pattern
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
    Display(5);
    return 0;
}