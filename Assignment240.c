#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>

// write application which accepet file name from user and Display size of file

# define BUFFER_SIZE 1024
int Append(char Fname[],char str[])
{
    int fd = 0;
    struct stat sb;
    int iRet = 0;
    char Buffer[1024] = {'\0'};

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("File is not opened");
    }
    else
    {
        lseek(fd,0,2);
        write(fd,str,strlen(str));
    }

    return sb.st_size;
}


int main()
{
    char Fname[30];
    char str[100];
    int iRet = 0;

    printf("Enter File name ; ");
    scanf("%s",Fname);

    printf("Enter A string to add at last : ");
    scanf(" %[^'\n']s",str);

    Append(Fname,str);

    printf("The size of file is : %d",iRet);
    return 0;
}