#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<io.h>

// write a application o fprogram which accepet filne name from user and open that file in read mode
int main()
{
    char Fname[30] = {'\0'};
    int fd = 0;

    printf("enter the File name ; ");
    scanf("%s",Fname);

    fd = open(Fname,O_RDONLY);

    if(fd == -1)
    {
        printf("File is not opened \n");
    }
    else
    {
        printf("File is opened successfully\n");
    }
    return 0;
}