#include<stdio.h>
// Write a program which accepet string from user and Toggle the case

void strlwrX(char *str)
{
    int iCount = 0;

    while (str[iCount] != '\0')
    {
        if (str[iCount] >= 'A' && str[iCount] <= 'Z')
        {
            printf("%c",str[iCount]+32);
        }
        else{
            printf("%c",str[iCount]-32);
        }
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