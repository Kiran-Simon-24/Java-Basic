package basic.java;

class Student{
    int rollno;
    String name;
     static String college = "IBM"; // static variable
     static void change(){ // static method
         college = "FCC";
     }
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno + " " + name +" "+ college);}
}
class Counter{ // counter memory space for instance variable
    int count = 0;
    Counter(){
        count ++;
        System.out.println(count);
    }
}
class Counter1{ // counter for static variable get memory space
    static int count = 0;
    Counter1(){
        count ++;
        System.out.println(count);
    }
}
class  cubic{
    static int cube(int x){
        return x*x*x;
    }
}

public class TsetStaticKeyword {
     static int a = 10;
    public static void main(String[] args){
        Student.change(); // calling change method
        Student s1 = new Student(1,"Jonny");
        Student s2 = new Student(2,"Sonny");
        s1.display();
        s2.display();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter1 C1 = new Counter1();
        Counter1 C2 = new Counter1();
        Counter1 C3 = new Counter1();

        System.out.println(a);

        int result = cubic.cube(6);
        System.out.println(result);
    }
}
