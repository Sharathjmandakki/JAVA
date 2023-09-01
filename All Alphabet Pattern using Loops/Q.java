public class Q {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {
                if(j==0&&i<=5||i==0&&j<=5||i==n/2&&j<=5||j==n/2&&i<=5||i==j&&j>=4)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
