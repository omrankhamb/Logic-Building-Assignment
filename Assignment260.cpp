/*
    An electricity company bills customers monthly based on how many units they consumed .
    The billing is progressive , meaning units are charged in slabs 
    The company wants a program to calculate bill accuratley for consumption.


    Slabs : 
        first 100 units : $5 unit
        Next Times      : $7 unit
        Above 200 uints : $10 unit

    Input : one integer units consumed
    
    validations :
        Units can not be negative

*/

#include<iostream>
using namespace std;

class Unit
{
    public : 
        int unit;
        int Price;

    public : 
        Unit()
        {
            cout<<"Pay your bill"<<endl;
            this->unit = 0;
            this->Price = 0;
        }

        int setUnits(int iUnit)
        {
            if(iUnit < 0)
            {
                return -1;
            }

            this->unit = iUnit;
        }

        int TotalBill()
        {
            if(this->unit <= 100 )
            {
                Price = this->unit * 5;
            }
            else if  (this->unit > 100 && this->unit < 200 )
            {
                Price = (100) * 5;
                Price = Price +( (this->unit - 100) * 7);
            }
            else if (this->unit >= 200 )
            {
                Price = (this->unit * 10);
            }

            return  Price;
        }
};


int main()
{
    Unit obj;
    int iRet = 0;

    obj.setUnits(150);
    cout<<"Total units are consumed : "<<obj.unit<<endl;
    iRet = obj.TotalBill();
    cout<<"Total Electicity Bill "<<iRet<<endl;
    return 0;
}