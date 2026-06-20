#include<stdio.h>
// Accepet  character from user and display its ASCII value in decimal ,
// octal and hexadecimal format

void Display(char ch)
{
    printf("Decimal : %d\n",ch);
    printf("Octal : %-10o\n",ch);
    printf("Hexadeciaml : %-10X\n",ch);

}

int main()
{
    char cValue = '\0';
    printf("Enter character : \n");
    scanf("%c",&cValue);

    Display(cValue);
    return 0;
}