package Pattern;

public class _02_Rhombus {
    public static void main(String[] args) {
        //printing rhombus pattern
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
