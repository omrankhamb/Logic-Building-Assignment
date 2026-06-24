#include<stdio.h>
//Write a program which accepet a number from user and copy small character os string into another string


void StrCpySmall(char *src,char *dest)
{
   
    while (((*src) != '\0'))
    {
        if(((*src) >= 'a' && (*src) <= 'z') || (*src) == ' ')
        {
            *dest = *src;
            dest++;
        }
        
        src++;

    }
    *src ='\0',*dest= '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    StrCpySmall(arr,brr);

    printf("\"%s\"",brr);

    return 0;
}