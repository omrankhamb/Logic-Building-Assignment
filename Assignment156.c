#include<stdio.h>
// Write a program which accepet string from user and Conert it in to lower case

void strlwrX(char *str)
{
    int iCount = 0;

    while (str[iCount] != '\0')
    {
        printf("%c",str[iCount]+32);
        iCount++;
    }
    
        
}

int main()
{
    char arr[20];
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    strlwrX(arr);
    
    return 0;
}