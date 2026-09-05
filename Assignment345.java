import java.util.*;

class node<T>
{
    public T data;
    public node<T>next;

    public node(T data)
    {
        this.data = data;
        this.next = null;
    }
}

// Stack implemntation
class StackX<T>
{
    public node<T> first;

    public int size;
    public int Cnt;

    public StackX(int size) {
        this.first = null;
        this.size = size;
        this.Cnt = 0;
    }

    public void push(T data)
    {

        if(this.Cnt == this.size)
        {
            pop();
        }

        node<T> newn = new node<T>(data);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }

        this.Cnt++;
    }

    public void pop()
    {

        if(this.Cnt == 0)
        {
            System.out.println("STACK IS EMPTY");
        }

        if(this.first == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        else if (this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            node <T> temp = this.first;

            while(temp.next.next != null)
            {
                temp  = temp.next;
            }
            temp.next = null;
        }
    }

    public T top()
    {
        if(this.first == null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        return this.first.data;
    }

    public boolean empty()
    {
        if(this.first == null)
        {
            return true;
        }

        return  false;
    }

    public void  display()
    {
        node<T> temp = null;

        temp  =  this.first;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}


class Assignment345
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int size = 0;
        System.out.println("Enter the size of Stack : ");
        size = sobj.nextInt();

        StackX <String> obj = new StackX<String>(size);

        obj.push("google.com");
        obj.push("github.com");
        obj.push("openai.com");
        obj.push("oracle.com");
        obj.push("stackoverflow.com");
        obj.push("youtube.com");

        obj.display();

    }
}