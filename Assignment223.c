#include<stdio.h>


char Count(char *str)
{
    static int iCount = 0;
    if((*str) == '\0')
    {
        return;
    }
    
    str++,iCount++;
    Count(str);

    return iCount;
}

int main()
{
    char str[30];
    int iRet = 0;

    printf("enter String :");
    scanf("%[^'\n']s",str);
    iRet = Count(str);
    printf("Count of characetr are : %d",iRet);


    return 0;
}