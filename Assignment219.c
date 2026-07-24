#include <stdio.h>
// Write A recursie program display below pattern
Display(char ch,int iNo)
{
    if(iNo == 0)
    {
        return;
    }

    printf("%c\t",ch);
    ch = ch + 1;
    Display(ch ,iNo -1);
}

int main()
{
    Display('A',6);
    return 0;
}