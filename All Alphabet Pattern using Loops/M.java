public class M {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {
                if(j==0||j==n||i==j&&i<=5||i==n-j&&j>=5)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
