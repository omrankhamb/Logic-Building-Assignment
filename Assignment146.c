#include<stdio.h>
// Write A program Which displays ASCII table .Table contains symbol,
// Decimal,Hexadecimal and Octal representation of every member from 0 to 255
#define TRUE 1
#define FALSE 0

typedef int BOOL;

void DisplayASCII()
{
    int i = 0;
    for (int i = 0; i <= 255; i++) {
        // Handle non-printable characters
        if (i < 32 || i == 127) {
            printf("%-10s %-10d %-10X %-10o\n", "NP", i, i, i);
        } else {
            printf("%-10c %-10d %-10X %-10o\n", i, i, i, i);
        }
    }

}

int main()
{
    DisplayASCII();

    return 0;
}