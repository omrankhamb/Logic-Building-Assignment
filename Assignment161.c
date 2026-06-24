#include<stdio.h>
//Write a program which accepet a number from user and accepet one character. Check whether that charcter is present in string or not 

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkChar(char *str,char ch)
{
    int i = 0;

    BOOL bFlag = FALSE;
    while (str[i] != '\0')
    {
        if(str[i] == ch)
        {
            bFlag = TRUE;
            break;
        }
        i++;    
    }
    return bFlag;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    printf("Enter Chractr to fnd : ");
    scanf(" %c",&cValue);           // space is required to tell the compiler that the previoud string input is completd

    bRet = ChkChar(arr,cValue);

    if(bRet == TRUE)
    {
        printf("Character is present in string\n");

    }
    else
    {
        printf("Character is not present in string\n");
    }

    return 0;
}