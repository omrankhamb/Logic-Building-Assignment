#include<iostream>
using namespace std;

template<class T>
void Display(T ch,int iSize)
{
    int iCnt = 0;
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        cout<<ch<<"   ";
    }
    cout<<endl;
}

int main()
{   
    Display('M',7);
    Display(11,3);
    Display(3.7,3);

    return 0;
}