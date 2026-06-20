#include<stdio.h>
// Write a program which accepet string from user and count number of small characters

int CountCapital(char *str)
{
    int iCnt = 0;
    int iCount = 0;
    while (str[iCnt] != '\0')
    {
        if( str[iCnt] >= 'a' && str[iCnt] <= 'z')
        {
        
            iCount++;
        }
        iCnt++;
    }
    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    iRet = CountCapital(arr);
    
    printf("%d",iRet);
    return 0;
}