#include<stdio.h>

// Accepet character from user and check whether it is small case or not (a-z)

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if((ch >= 'a') && (ch <= 'z'))
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
        printf("It is Small Case Character\n");
    }
    else{
        printf("It is Not Small Case Charater\n");
    }

    return 0;
}