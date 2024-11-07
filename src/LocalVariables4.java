public class LocalVariables4 {
    public static void main(String[] args) {
//        public int x = 10; [ public is not allowed ]
//        private int x = 10; [ private is not allowed ]
//        protected int x = 10; [ protected is not allowed ]
//        static int x = 10; [ static is not allowed ]
//        volatile int x = 10; [ volatile is not allowed ]
//        transient int x = 10; [ transient is not allowed ]
//        abstract int x = 10; [ abstract is not allowed ]
//        native int x = 10; [ native is not allowed ]

        final int x = 10; //[ final is valid]
        System.out.println(x);
    }

    static int y = 10;
    protected int z = 20;
    int[] a = new int[3]; // left hand side equal to sign is declaration and right hand side is initialization
    int[] b = {10, 20, 30}; // instantiation
//    int[] b = new int[3];
////    b[0]=10; 21 - 23 : is instantiation
////    b[1]=20;
////    b[2]=30;
}
