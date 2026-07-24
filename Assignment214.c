#include <stdio.h>
// Write a recursive program which display below pattern
Display(char ch)
{
    if(ch > 'F')
    {
        return;
    }

    printf("%c\t",ch);
    Display(ch + 1);

}

int main()
{
    Display('A');
    return 0;
}