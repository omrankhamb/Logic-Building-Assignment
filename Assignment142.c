#include<stdio.h>
// Accepet Character From user and check whether it is capital or not (A-Z)
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if((ch >= 'A') && (ch <= 'Z'))
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
        printf("It is Capital letter\n");
    }
    else{
        printf("It is not capital letter\n");
    }

    return 0;
}