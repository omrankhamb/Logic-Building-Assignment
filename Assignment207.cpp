#include<iostream>
using namespace std;
// Write a genric program to accepet N values and Count Frequency of any speciffic value
template<class T>
int Frequency (T *arr,int iSize,T iNO)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        if(arr[iCnt] == iNO)
        {
            iCount++;
        }
    }
    return iCount;
}

int main()
{   
    int arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = 0;
    iRet = Frequency(arr,9,10);
    cout<<iRet<<endl;


    return 0;
}