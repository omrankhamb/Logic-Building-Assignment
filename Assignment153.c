#include<stdio.h>
// Write a program which accepet string from user and count number of small characters

int CountCapital(char *str)
{
    int iCnt = 0;
    int iSmall = 0;
    int iCapital = 0;
    while (str[iCnt] != '\0')
    {
        if( (str[iCnt] >= 'A' && str[iCnt] <= 'Z'))
        {
        
            iCapital++;
        }
        else if((str[iCnt] >= 'a' && str[iCnt] <= 'z'))
        {
            iSmall++;
        }
        iCnt++;
    }
    return (iCapital - iSmall);
}

int main()
{
    char arr[20];
    int iRet = 0;
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    iRet = CountCapital(arr);
    
    if(iRet < 0)
    {
        iRet= -iRet;
    }
    printf("%d",iRet);
    return 0;
}