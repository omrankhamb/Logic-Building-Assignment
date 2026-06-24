#include<stdio.h>
//Write a program which accepet a number from user and accepet one character. Return the frequency of character 



int Countchar(char *str,char ch)
{
    int i = 0;
    int iFrequency = 0;
    while (str[i] != '\0')
    {
        if(str[i] == ch)
        {
            iFrequency++;
        }
        i++;    
    }
    return iFrequency;
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

    iRet = Countchar(arr,cValue);

    printf("the frequency of character is  : %d",iRet);

    return 0;
}