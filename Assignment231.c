#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>

#define BUFFER_SIZE 100    
int CountCapital(char FName[])
{
    char Local[BUFFER_SIZE] = {'\0'};
    int fd = 0;
    int iRet = 0;
    int iCnt = 0;

    fd = open(FName,O_RDONLY);

    while ((iRet = read(fd,Local,sizeof(Local))) != 0)
    {           
        for(int i = 0 ; i < iRet ; i++)
        {
            if(Local[i] >='A' && Local[i] <='Z')
            {
                iCnt++;
            }
        }
    }
    return iCnt;
}


int main()
{
    char Filename[30];
    int iRet = 0;

    printf("Enter A file Name : ");
    scanf(" %s",Filename);

    iRet = CountCapital(Filename);

    printf("Number of capital characters are : %d\n",iRet);
    return 0;
}