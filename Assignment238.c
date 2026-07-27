#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

// write application which accepet file name from user and read all the data from file and diaplay on console

# define BUFFER_SIZE 1024
void Display(char Fname[])
{
    int fd = 0;
    int iRet = 0;
    char Buffer[1024] = {'\0'};

    fd = open(Fname,O_RDONLY);

    if(fd == -1)
    {
        printf("File is not opened");
    }
    else
    {
        while((iRet != read(fd,Buffer,sizeof(Buffer))) != 0)
        {
            printf("%s",Buffer);
            memset(Buffer,'\0',sizeof(Buffer));
        }
    }
}


int main()
{
    char Fname[30];
    int iRet = 0;

    printf("Enter File name ; ");
    scanf("%s",Fname);

    Display(Fname);
    return 0;
}