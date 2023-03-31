package _2d_Array;

public class _01Transpose {
    public static int[][]transpose(int [][]arr,int r,int c)
    {
        int [][]transpose=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }
        return transpose;
    }
    public  static void print(int [][]transpose)
    {
        for(int i=0;i<transpose.length;i++)
        {
            for(int j=0;j<transpose[0].length;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        //transpose of a matrix
        int [][]arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int [][]transpose=transpose(arr,arr.length,arr[0].length);
        print(transpose);

    }
}
