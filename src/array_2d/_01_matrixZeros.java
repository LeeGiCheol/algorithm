package array_2d;

/*
    주어진 행렬 m * n. 요소가 0이면 전체 행과 열을 0으로 설정한다.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _01_matrixZeros {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        print(arr);
        System.out.println();

        int[][] result = matrixZeros(arr);

        print(result);

    }

    private static void print(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] " + result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixZeros(int[][] arr) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    rowSet.add(i); colSet.add(j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }


}
