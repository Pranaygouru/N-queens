/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueens {
    public static void main(String[] args) throws Exception{
        NQueens nq = new NQueens();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        str = br.readLine();
        int N = Integer.parseInt(str);
        int[][] Board;
        Board = new int[N][N];
        boolean b = nq.nqueens(Board,N);
    }
    public boolean nqueens(int[][] Board,int N)
    {
//        System.out.println(N);
        if (N == 0)
            return true;
        for (int i=0;i<N;i++
             ) {
            for (int j = 0;j<N;j++)
            {
                    if(is_attacked(Board,i,j,N))
            }
        }
        return false;
    }
    public boolean is_attacked(int[][] Board,int M,int P,int N)
    {
        for(int i=0;i<N;i++)
        if (Board[M][i]==1)
        {
            return true;
        }

        for(int i=0;i<N;i++)
            if (Board[i][P]==1)
            {
                return true;
            }

        return false;
    }
}
*/
