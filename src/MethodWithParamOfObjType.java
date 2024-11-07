class X {

}

class Emp {

}

class Y {

}

class Student {

}

public class MethodWithParamOfObjType {
    void m1(X x, Emp emp) {
        System.out.println("m1 method");
    }

    static void m2(Y y, Student stud) {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        MethodWithParamOfObjType obj = new MethodWithParamOfObjType();
        X xi = new X(); // xi -> refernce variable // X is Class
        Emp e = new Emp();
        obj.m1(new X(), new Y()); //obj.m1(new X(), new Emp())
        Y yi = new Y();
        Student stu1 = new Student();
        MethodWithParamOfObjType.m2(yi,stu1); // (31-33) can be written in a single statement : MethodWithParamOfObjType.m2(new Y(), new Student())

    }
}
