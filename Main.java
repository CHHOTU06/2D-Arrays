import java.util.Scanner;
public class Main {

    //Element search in a matrix
    public static void elementSearch(int[][] matrix, int key) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell :"+"["+i+","+j+"]");
                    return;
                }
            }
        }
    }

    //Max and Min element in a matrix
    public static void MaxAndMin(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                min = Math.min(min,matrix[i][j]);
                max = Math.max(max,matrix[i][j]);
            }
        }
        System.out.println("Max value is : "+max);
        System.out.println("Min value is : "+min);
    }

    //Spiral Matrix
    public static void spiralMatrix(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //Top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(endRow==startRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(endCol==startCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    //Diagonal Sum of a Matrix
    public static void diagonalSum(int [][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][matrix.length-i-1];
            if(i!=matrix.length-i-1)
                sum+=matrix[i][i];
        }
        System.out.println("Sum is : "+sum);
    }

    //StaireCase Search
    public static void staircaseSearch(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("Found at cell :"+"["+row+","+col+"]");
                return;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found");
    }
    // OR
    public static void stairCaseSearch(int[][] matrix, int key){
        int col = 0;
        int row = matrix.length-1;
        while(col < matrix[0].length && row >=0){
            if(matrix[row][col]==key){
                System.out.println("Found at cell :"+"["+row+","+col+"]");
                return;
            }
            else if(matrix[row][col]>key){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Not found");
    }
    // Ques. Print the number of 7's that are in the 2nd array
    public static void indexOf7(int[][] matrix){
        for(int i=0;i<3;i++) {
            if (matrix[1][i] == 7) {
                System.out.print("Found at column :" + i);
            }
        }
    }

    // Ques.2 Print out the sum of the numbers in the second row of the "nums" array
    public static int sumOfNumbers(int[][] nums){
        int sum = 0;
        for(int i=0;i<3;i++){
            sum+=nums[1][i];
        }
        return sum;
    }

    //Ques.3 Write a program to find "Transpose" of a Matrix
    public static void transpose(int[][] matrix){
        int[][] temp = new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i< matrix[0].length;i++){
            for(int j=0;j< matrix.length;j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Main Function
    public static void main(String[] args){
//        int[][] matrix=new int[4][4];
//        System.out.print("Enter the Key element : ");
//        Scanner sc=new Scanner(System.in);
//        int key = sc.nextInt();
//        System.out.println("Enter the elements of the matrix : ");
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        //elementSearch(matrix,key);
        //MaxAndMin(matrix);
        //spiralMatrix(matrix);
        //diagonalSum(matrix);
        //staircaseSearch(matrix,key);
        //stairCaseSearch(matrix,key);
        //int[][] matrix = {{4,7,8},{8,8,7}};
        //indexOf7(matrix);
        int[][] matrix={{1,4,9},{5,4,3},{5,4,8},{7,8,2},{8,9,5}};
        //System.out.print("Sum is : "+sumOfNumbers(nums));
        transpose(matrix);
    }
}