#include<stdio.h>

int Count(char *str)
{
    static int i = 0;
    if(*str == '\0')
    {   
        return;
    }

    if((*str) >= 'a' && (*str) <= 'z')
    {
        i++;
    }
    str++;
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
    printf("Count of Small characters are : %d",iRet);
    return 0;
}