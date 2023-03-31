package BackTracking;

public class _13_N_Quuens {
    public static void nQueens(char[][] board,int row)
    {
        if(row== board.length)
        {
            printBoard(board);
            return;

        }
        for(int j=0;j<board.length;j++)
        {
            board[row][j]='Q';
            nQueens(board,row+1);
            board[row][j]='*';// backtracking step
        }

    }
    public static void printBoard(char [][]board)
    {
        System.out.println("-----*---Ches Board------*---");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)

            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //n queen problem
        int n=2;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='*';
            }
        }
        nQueens(board,0);

    }
}
