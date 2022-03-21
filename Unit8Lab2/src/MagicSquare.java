public class MagicSquare{

    private int[][] square;

    public MagicSquare(int[][] square){
        square = this.square;
    }

    public int rowSum(int row){
        int sum = 0;
        for(int i = 0; i < square.length; i++){
            sum = sum + square[row][i];
        }
        return sum;
    }

    public int colSum(int col){
        int sum = 0;
        for(int i = 0; i < square[0].length; i++){
            sum = sum + square[i][col];
        }
        return sum;
    }

    public boolean diagSums(int sum){
        int a = 0;
        int b = 0;
        for(int i = 0; i < square.length; i++){
            a = a + square[i][i];
            b = b + square[i][square.length - 1 - i];
        }
        if(a == sum && b == sum){
            return true;
        }
        return false;
    }

    public boolean exactlyOnce(){
        int n = square.length;
        boolean[] bool = new boolean[n*n];
        for(int[] row: square){
            for(int i = 0; i < row.length; i++){
                if(bool[row[i]-1] == true){
                    return false;
                }
                else{
                    bool[row[i]-1] = true;
                }
            }
        }
        return true;
    }

    public boolean isMagic(){
        for(int i = 0; i < square.length; i++){
            if(rowSum(i) != colSum(i) || diagSums(rowSum(i)) == false){
                return false;
            }
        }
        return exactlyOnce();
    }
}

