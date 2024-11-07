class OperatorOverloading {
    public static void main(String[] args) {
        add(10, 20); //calling function
    }

    public static void add(int a, int b) { //method declaration + called function
//5-8 is method definition
        int c = a + b;
        System.out.println(c);
    }

    public static void add(float d, float f) { //method declaration + called function
//5-8 is method definition
        float e = d + f;
        System.out.println(d);
    }
}

