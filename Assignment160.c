#include<stdio.h>
// Write a program which accepet string from user and Count Number of whitespaces

int CountWhite(char *str)
{
    int iCount = 0;
    int iFrequency = 0;
    while (str[iCount] != '\0')
    {
        if (str[iCount] == ' ')
        {
            iFrequency++;
        }
        
        iCount++;
    }
    return iFrequency;
    
        
}

int main()
{
    char arr[20];
    int iRet = 0;
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    iRet = CountWhite(arr);

    printf("%d",iRet);
    
    return 0;
}