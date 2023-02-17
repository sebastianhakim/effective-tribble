public class FibNum {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int f1 = 0;
        int f2 = 1;

        for (int i = 1; i <= num; i ++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;  
        }
        System.out.println(f1);
    }
}

