#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

# define BUFFER_SIZE 1024

void Display(char Fname[],int iSize)
{
    int fd = 0 , iRet = 0, i =0;
    char Local[BUFFER_SIZE] = {'\0'};
    int iCnt = 0;

    fd = open(Fname,O_RDONLY);
    
    if(fd == -1)
    {
        printf("File is not openend\n");
    }
    else
    {
        while((iRet = read(fd,Local,sizeof(Local))) != 0)
        {
            for(int i = 0 ; i < iRet ; i++)
            {
                iCnt++;
                if(iCnt > iSize)
                {
                    break;
                }
                printf("%c",Local[i]);
            }
            
            memset(Local,'\0',sizeof(Local));
        }


        close(fd);
    }
}

int main()
{
    char Fname[30];
    int iValue = 0;

    printf("Eneter File name : ");
    scanf("%s",Fname);

    printf("Enter Number of characeters to read : ");
    scanf("%d",&iValue);

    Display(Fname,iValue);

    return 0;
}