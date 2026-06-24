#include<stdio.h>
//Write a program which accepet a number from user and copy the contents of that string into another string (Implement strcpy function)


void StrCpyX(char *src,char *dest)
{
    int i = 0;
   
    while (src[i] != '\0')
    {
        dest[i] = src[i];
        i++;

    }
    src[i] ='\0',dest[i]= '\0';
}

int main()
{
    char arr[30] = "Marvellous multi OS";
    char brr[30];

    StrCpyX(arr,brr);

    printf("%s",brr);

    return 0;
}