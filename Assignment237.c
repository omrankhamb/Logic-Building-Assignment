#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<io.h>

// write application which accepet file name from and create the file

int main()
{
    char Fname[30] = {'\0'};
    int fd = 0;

    printf("enter the File name ; ");
    scanf("%s",Fname);

    fd = creat(Fname,0777);

    if(fd == -1)
    {
        printf("File is not created \n");
    }
    else
    {
        printf("File is created successfully\n");
    }
    return 0;
}