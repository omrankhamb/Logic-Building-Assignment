#include<stdio.h>
//Write a program which accepet a number from user and copy capital character os string into another string


void StrnCpyX(char *src,char *dest)
{
   
    while (((*src) != '\0'))
    {
        if((*src) >= 'A' && (*src) <= 'Z')
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

    StrnCpyX(arr,brr);

    printf("\"%s\"",brr);

    return 0;
}