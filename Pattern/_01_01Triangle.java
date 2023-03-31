package Pattern;

public class _01_01Triangle {
    public static void main(String[] args) {
        //printing 01 Triangle
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)  //even case indies sum
                {
                    System.out.print("1"+" ");  //odd case indices sum
                }
                else
                {
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }

    }
}
