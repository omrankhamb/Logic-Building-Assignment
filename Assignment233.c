#include<stdio.h>
#include<fcntl.h>
#include<io.h>
#include<unistd.h>

// Write a program which accepet a file name from and count number of whitespace in file

#define BUFFER_SIZE 1024

int CountSmall(char FName[])
{
    char Local[BUFFER_SIZE];
    int iCnt = 0;
    int fd = 0;
    int iRet = 0;

    fd = open(FName,O_RDONLY);

    while((iRet = read(fd,Local,sizeof(Local))) != 0)
    {
        for(int i = 0 ; i < iRet ; i++)
        {
            if(Local[i] >= ' ')
            {
                iCnt++;
            }
        }
        memset(Local,iRet,sizeof(Local));
    }

    return iCnt;
}

int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter The File Name : ");
    scanf("%s",FileName);

    iRet = CountSmall(FileName);

    printf("Number of White Spaces are :  %d",iRet);
    return 0;
}