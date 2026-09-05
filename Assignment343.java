


/*
    Create a student class and display the studetns record according to descending  marks
    if two students have equal marks  , sort them alphabetically 

    Expected output : 
        Neha : 92
        Pooja : 92
        Rahul : 85
        Amit : 78
        Kiran : 67
*/

class student{
    public String name;
    public int marks;

    public void add(String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return this.name + " " + this.marks;
    }
}

class Assignment343
{
    public static void main(String Arg[])
    {

        student student = new student();

        student.add("Omprasad", 98);

        System.out.println(student);
              
    }
}