#include<iostream>
using namespace std;
// Write A genric program to Accepet N values and search first occuerence of any specific value
template<class T>
int SearchFirst(T *arr,int iSize,T iNO)
{
    int iCnt = 0;
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        if(arr[iCnt] == iNO)
        {
            break;
        }
    }
    return iCnt;
}

int main()
{   
    int arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = 0;
    iRet = SearchFirst(arr,9,40);
    cout<<iRet<<endl;


    return 0;
}