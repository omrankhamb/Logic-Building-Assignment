#include <stdio.h>
// Write a recursive program which display below pattern
Display(char ch)
{
    if(ch > 'f')
    {
        return;
    }

    printf("%c\t",ch);
    Display(ch + 1);

}

int main()
{
    Display('a');
    return 0;
}