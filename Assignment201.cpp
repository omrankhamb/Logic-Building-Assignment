#include<iostream>

template<class T>
T Multiply(T No1,T No2)
{
    T ans = 0;
    ans = No1 * No2;

    return Ans;
}

int main()
{
    int iRet = Multiply( 10,20);
    printf("%d",iRet);

    float fRet = Multiply(10.0f,20.0f);
    printf("%f",fRet);

    return 0;
}