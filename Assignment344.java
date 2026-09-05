
import java.util.*;

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

    public student(String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return this.name + " " + this.marks;
    }
}

class Assignment344
{
    public static void main(String Arg[])
    {

        student s1 = new student("Amit" , 78);
        student s2 = new student("Pooja", 92);
        student s3 = new student("Rahul", 85);
        student s4 = new student("Neha", 92);
        student s5 = new student("Kiran", 67);

        ArrayList<student> aobj = new ArrayList<>();

        aobj.add(s1);
        aobj.add(s2);
        aobj.add(s3);
        aobj.add(s4);
        aobj.add(s5);
        
        
        Collections.sort(aobj,new Comparator<student>()
            {
                public int compare(student s1 , student s2)
                {
                    if(s1.marks != s2.marks)
                    {
                        return s2.marks - s1.marks;
                    }   
                    return s1.name.compareTo(s2.name);
                }
            });

        for(student s : aobj)
        {
            System.out.println(s);;
        }
        
        
              
    }
}