#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>

// write application which accepet file name from user and Display size of file

# define BUFFER_SIZE 1024
int Size(char Fname[])
{
    int fd = 0;
    struct stat sb;
    int iRet = 0;
    char Buffer[1024] = {'\0'};

    fd = open(Fname,O_RDONLY);

    if(fd == -1)
    {
        printf("File is not opened");
    }
    else
    {
        stat(Fname,&sb);
    }

    return sb.st_size;
}


int main()
{
    char Fname[30];
    int iRet = 0;

    printf("Enter File name ; ");
    scanf("%s",Fname);

    iRet = Size(Fname);

    printf("The size of file is : %d",iRet);
    return 0;
}