class LocalVariables3 {
    public static void sum(){
        System.out.println("Shaswat");
        int i = 10;
    }
    public static void main(String[] args) {
//        int x;
//        if (args.length > 0) {
//            x = 10;
//        } else {
//            x = 20;
//        }
//        System.out.println(x);
        LocalVariables3 s = new LocalVariables3();
        System.out.println(s.sum());
        System.out.println(LocalVariables3.sum(i));
    }
}