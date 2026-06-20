#include<stdio.h>
// Accepet charcter from user and check whether it is digit or not (0-9)
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if((ch >= '0') && (ch <= '9'))
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
        printf("It is Digit\n");
    }
    else{
        printf("It is not Digit\n");
    }

    return 0;
}