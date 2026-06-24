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

void strrevX(char *str)
{
    int right = 0;
    int left = strlenX(str)-1;
   
    while (right <= left)   // two pointer Approach
    {
        char temp = str[right];
        str[right] = str[left];
        str[left] = temp;
        right++,left--;

    }
}

int main()
{
    char arr[20];

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    strrevX(arr);

    printf("After Reverse the string : %s",arr);

    return 0;
}