#include<stdio.h>
//Write a program which accepet a number from user and accepet one character. Return index of last occuernece of that character

int strlenX(char *str)
{
    int i = 0;
    while (str[i] != '\0')
    {
        i++;
    }

    return i;
    
}

int LastChar(char *str,char ch)
{
    int Length = strlenX(str)-1;
    int i = 0;
    i = Length;
    while (i>=0)
    {
        if(str[i] == ch)
        {
            break;
        }
        i--;    
    }
    return Length-i;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    printf("Enter Chractr to fnd : ");
    scanf("\n%c",&cValue);           // space is required to tell the compiler that the previoud string input is completd

    iRet = LastChar(arr,cValue);

    printf("character Location is at from end : %d",iRet);

    return 0;
}