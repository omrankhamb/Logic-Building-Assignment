#include<iostream>

// Write a Accepet N values from user and return addition of that values

template<class T>
T AddN(T Arr[],int iSize)
{
    T Sum = 0;
    int i = 0 ; 

    for(i = 0 ; i < iSize ; i++)
    {
        iSum = iSum + Arr[i];
    }

    return iSum;
}

int main()
{
    int Arr[]  = {10,20,30,40,50};
    float brr[] = {10.0,3.7,9.8,8.7};

    int iSum = AddN(Arr,5);
    printf("%d\n",iSum);

    float fSum = AddN(brr,4);
    printf("%d\n",fSum);



    return 0;
}