#include<stdio.h>
//Write a program which accepet a number from user and copy small character os string into another string


int strlenX(char *str)
{
    int i = 0;
    while (str[i] != '\0')
    {
        i++;
    }
    return i;
}


void StrCatX(char *src,char *dest)
{
   
    int i = strlenX(src)-1;
    i++;
    while (((*dest) != '\0'))
    {
        src[i] = *dest;
        i++,dest++;
    }
    src[i] ='\0',*dest= '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30] = "omprasad";

    StrCatX(arr,brr);

    printf("\"%s\"",arr);

    return 0;
}