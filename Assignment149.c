#include<stdio.h>
// Accepet Character from user and check Whether it is special symobl or not(!,@,#,$,%,^,&,*)

#define TRUE 1
#define FALSE 0

typedef int BOOL;
BOOL Display(char ch)
{
    if((ch == '!') || (ch == '@') || (ch == '#') || (ch == '$') || (ch == '%') || (ch == '^') || (ch == '&') ||(ch == '*'))
    {
        return TRUE;
    }else
    {
        return FALSE;
    }

}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;
    printf("Enter character : \n");
    scanf("%c",&cValue);

    bRet = Display(cValue);
    if(bRet)
    {
        printf("It Is special character\n");
    }
    else
    {
        printf("It is not specail character\n");
    }

    return 0;
}