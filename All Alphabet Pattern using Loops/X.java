public class X {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==j||i==n-j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
