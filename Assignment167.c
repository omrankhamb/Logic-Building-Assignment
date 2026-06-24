#include<stdio.h>
//Write a program which accepet a number from user and copy the contents of that string into another string (Implement strcpy function)


void StrnCpyX(char *src,char *dest,int iCnt)
{
   
    while (((*src) != '\0') && (iCnt != 0))
    {
        *dest = *src;
        dest++;
        src++;
        iCnt--;

    }
    *src ='\0',*dest= '\0';
}

int main()
{
    char arr[30] = "Marvellous multi OS";
    char brr[30];

    StrnCpyX(arr,brr,10);

    printf("%s",brr);

    return 0;
}