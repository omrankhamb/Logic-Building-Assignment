#include<stdio.h>

// Accepet Character From user and check whether it is alphabet or not (A-Z or a-z)
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if( (ch >= 'a' && ch <= 'z') || (ch >= 'A') && ch <= 'Z')
    {
        return TRUE;
    }else{
        return FALSE;
    }

}

int main()
{
    char cValue = '\0'; // default value
    BOOL bRet = FALSE;

    printf("Enter chracter :");
    scanf("%c",&cValue);

    bRet = ChkAlpha(cValue);
    if(bRet)
    {
        printf("IT IS CHARACTER\n");
    }
    else{
        printf("IT IS NOT CHARACTER\n");
    }

    return 0;
}