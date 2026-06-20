#include<stdio.h>
// Write a program which accepet string from user and check contains vowel it or not

#define TRUE 1
#define FALSE 0
typedef int BOOL;
BOOL CountCapital(char *str)
{
    int iCnt = 0;
    int iSmall = 0;
    int iCapital = 0;
    while (str[iCnt] != '\0')
    {
        if((str[iCnt] == 'A') || (str[iCnt] == 'E') || (str[iCnt] == 'I') ||(str[iCnt] == 'O') || (str[iCnt] == 'U') || (str[iCnt] == 'a') || (str[iCnt] == 'e') || (str[iCnt] == 'i') || (str[iCnt] == 'o') ||(str[iCnt] == 'u'))
        {
            return TRUE;
        }
        iCnt++;
        
    }
    return FALSE;
}

int main()
{
    char arr[20];
    BOOL bRet = FALSE;
    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    bRet = CountCapital(arr);
    
    if(bRet == TRUE)
    {
        printf("Vowels are present");
    }else{
        printf("vowels are not present");
    }
    return 0;
}