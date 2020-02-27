package code.practice.problem;

import java.util.Arrays;

public class CopyPasteSubMatrix {

    public static void main(String[] args) {

        int[][] sample1 = new int[][]{
                {1,0,0},
                {1,0,0},
                {0,0,1}
        };

        int[][] sample2 = new int[][]{
                {0,0,0,1},
                {0,1,1,1},
                {0,1,1,1},
                {0,1,1,0}
        };

        System.out.println("before:");
        Arrays.stream(sample1).forEach(row -> System.out.println(Arrays.toString(row)));

        copyPaste(sample1, new int[]{0,0}, new int[]{1,1}, new int[]{1,1});
        System.out.println("after:");
        Arrays.stream(sample1).forEach(row -> System.out.println(Arrays.toString(row)));

        System.out.println("before:");
        Arrays.stream(sample2).forEach(row -> System.out.println(Arrays.toString(row)));

        copyPaste(sample2, new int[]{2,2}, new int[]{3,3}, new int[]{0,0});
        System.out.println("after:");
        Arrays.stream(sample2).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    private static void copyPaste(int[][] matrix, int[] srcTopLeft, int[] srcBottomRight, int[] dest) {

        int[][] memory = new int[srcBottomRight[0] - srcTopLeft[0] + 1][srcBottomRight[1] - srcTopLeft[1] + 1];
        int rowIndex = 0;
        int columnIndex = 0;
        for (int i = srcTopLeft[0]; i <= srcBottomRight[0]; i++) {
            for (int j = srcTopLeft[1]; j <= srcBottomRight[1]; j++) {
                memory[rowIndex][columnIndex] = matrix[i][j];
                columnIndex++;
            }
            rowIndex++;
            columnIndex = 0;
        }
        rowIndex = 0;
        columnIndex = 0;

        for (int i = dest[0]; i < dest[0] + srcBottomRight[0] - srcTopLeft[0] + 1; i++) {
            for (int j = dest[1]; j < dest[1] + srcBottomRight[1] - srcTopLeft[1] + 1; j++) {
                matrix[i][j] = memory[rowIndex][columnIndex];
                columnIndex++;
            }
            columnIndex = 0;
            rowIndex++;
        }
    }
}
