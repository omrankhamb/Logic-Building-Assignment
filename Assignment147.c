#include<stdio.h>
// Write A program Which displays ASCII table .Table contains symbol,
// Decimal,Hexadecimal and Octal representation of every member from 0 to 255
#define TRUE 1
#define FALSE 0

typedef int BOOL;

void Display(char ch)
{
    if( ch >= 'a' && ch <= 'z')
    {
        printf("%c\n",ch-32);
    }else if(ch >= 'A' && ch <= 'Z')
    {
        printf("%c\n",ch+32);
    }
    else
    {
        printf("%c\n",ch);
    }

}

int main()
{
    char cValue = '\0';
    printf("Enter character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}