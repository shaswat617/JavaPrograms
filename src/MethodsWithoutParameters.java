public class MethodsWithoutParameters {
    void m1(){ //instance method
        System.out.println("m1 method");
    }
    static void m2() { //static method
        System.out.println("m2 Method");
    }

    public static void main(String[] args) {
        MethodsWithoutParameters m = new MethodsWithoutParameters();
        m.m1(); //ClassName.m1() is not allowed since it is an instance method
        MethodsWithoutParameters.m2();

    }
}
