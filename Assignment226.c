#include<stdio.h>

int Count(char *str)
{
    static int i = 0;
    if(*str == '\0')
    {   
        return;
    }

    if((*str) == ' ')
    {
        i++;
    }
    str++,i++;
    Count(str);
    return i;
}

int main()
{
    char str[30];
    int iRet = 0;

    printf("Enter the string : ");
    scanf("%[^'\n']s",str);

    iRet = Count(str);
    printf("Count of white spaces are : %d",iRet);
    return 0;
}