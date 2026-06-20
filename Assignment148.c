#include<stdio.h>
// Accepet Character from user If it is capital then display all the characters frm the input characters till z. If input characters is small then print all the characters in reverse order till a.In othr cases return dirctley
void Display(char ch)
{
    char cCount = '\0';
    if( ch >= 'A' && ch <= 'Z')
    {   
        for(cCount = ch ; cCount <= 'Z' ; cCount++)
        {
            printf("%c\t",cCount);
        }
    }     
    else
    {
        for(cCount = ch ; cCount <= 'z' ; cCount++)
        {
            printf("%c\t",cCount);
        }
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