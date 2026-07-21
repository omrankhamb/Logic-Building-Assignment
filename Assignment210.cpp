#include<iostream>
using namespace std;
// Write A genric program and reverse the Contents
template<class T>
int Reverse(T *arr,int iSize)
{
    int iCnt = 0;
    int Pos = 0;
    int left = 0;
    int right = iSize-1;
    while(right >= left)
    {

        swap(arr[right],arr[left]);
        right--;
        left++;
    }
    return Pos + 1;
}

int main()
{   
    int arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = 0;
    iRet = Reverse(arr,9);
    cout<<iRet<<endl;

    for(int i = 0 ; i < 9 ; i++)
    {
        cout<<arr[i]<<"     ";
    }


    return 0;
}