public class Methods1 {
//    Variables
//    Methods
//    Constructors
//    instance blocks
//    static blocks

}

class Test {
    int a = 10;
    int b = 20;
//    sout [ inside a class, writing directly business logic is not allowed ]
}

class Test1 {
    int a = 10;
    int b = 10;
    void add(){
        System.out.println(a + b); // inside the class, declare the method and inside the method write business logic
    }
}
/*
Two types of methods in Java :
1. Instance method :
    void m1() {
    // logic here
        }
        Instance always linked with object
        Instance method memory is allocated during Object creation


2. Static method
    static void m1() {
    // logic here
        }
        Static always linked with Class
        Static method memory is allocated during class loading
    NOTE :
        Instance area -> instance methods and instance variables are directly accessible into instance area
        Static area -> Instance methods and instance variables are accessed using object in static area

Static variables and Static methods :
Access static members using ClassName

Syntax of a method :
drivingLicense(String aadharCard, String electricityBill ) // method declaration || method signature

method name : drivingLicense()
arguments / parameters : aadharCard + electricityBill of String type

return drivingLicense
drivingLicense method will be executed whenever we are passing arguments.
After driving function and relevant driving tests are completed, method returns driving license card
Similarly, after execution of the function, there will be return value having some return type.
Modifier list return type methodName(params list) {
 // logic here
}
public int sum (float a, float b) {
// logic here
}

public void m1(int a, int b) {
// logic here
}

private int m2(){
//logic here
}

protected int m3(int a) throws Exception {

}
void m1() {    //method declaration
// logic here   // method implementation
}
Test t = new Test();
t.m1(); // method calling

Method without parameters


 */
