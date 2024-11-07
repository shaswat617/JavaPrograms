public class MethodsWithParameters {
    void m1(int a, char c){ // params of method : local variable
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(c);
    }
    static void m2(String str, double d){
        System.out.println("m2 method");
        System.out.println(str);
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethodsWithParameters obj = new MethodsWithParameters();
        obj.m1(10, 'd');
        MethodsWithParameters.m2("Rocky", 10.32);
    }
}
