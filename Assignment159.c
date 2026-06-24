#include<stdio.h>
// Write a program which accepet string from user and Display only dogit from string

void DisplayDigit(char *str)
{
    int iCount = 0;

    while (str[iCount] != '\0')
    {
        if (str[iCount] >= '0' && str[iCount] <= '9')
        {
            printf("%c",str[iCount]);
        }
        
        iCount++;
    }
    
        
}

int main()
{
    char arr[20];
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    DisplayDigit(arr);
    
    return 0;
}