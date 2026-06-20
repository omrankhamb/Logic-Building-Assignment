#include<stdio.h>
// Write a program which accepet string from user and display it in reverse order

int length(const char *arr)
{
    int i = 0;
    while (arr[i] != '\0')
    {
        i++;
    }
    return i;
}

void Reverse(char str[])
{
    int len = length(str) - 1;

    while (len != -1)
    {
        printf("%c",str[len]);
        len--;
    }
    
        
}

int main()
{
    char arr[20];
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    Reverse(arr);
    
    return 0;
}