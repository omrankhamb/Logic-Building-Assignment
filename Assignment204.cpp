#include<iostream>

// Write a Accepet N values from user and return Maxmium of that values

template<class T>
T AddN(T Arr[],int iSize)
{
    T Max = Arr[0];
    int i = 0 ; 

    for(i = 1 ; i < iSize ; i++)
    {
        if(Max < Arr[i])
        {
            Max = Arr[i];
        }
    }
    return Max;
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