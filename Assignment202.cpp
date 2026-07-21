#include<iostream>

// Write a genric program to find largest of three numbers

template<class T>
T Max(T No1,T No2,T No3)
{
    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No3 > No1)
    {
        return No2;
    }
    else
    {
        return No3;
    }

}

int main()
{
    int iRet = Max(10,20,30);
    printf("%d\n",iRet);

    float fRet = Max(10.04f,20.43f,23.432f);
    printf("%f\n",fRet);

    return 0;
}