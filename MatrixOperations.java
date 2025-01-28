import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix of size rows x columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers from 0 to 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication not possible, invalid dimensions.");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular, cannot find inverse.");
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular, cannot find inverse.");
        }

        // Calculating inverse using adjugate matrix and determinant
        double[][] adjugate = new double[3][3];
        adjugate[0][0] = determinant3x3(new int[][] { { matrix[1][1], matrix[1][2] }, { matrix[2][1], matrix[2][2] } })
                / determinant;
        adjugate[0][1] = -determinant3x3(new int[][] { { matrix[1][0], matrix[1][2] }, { matrix[2][0], matrix[2][2] } })
                / determinant;
        adjugate[0][2] = determinant3x3(new int[][] { { matrix[1][0], matrix[1][1] }, { matrix[2][0], matrix[2][1] } })
                / determinant;
        adjugate[1][0] = -determinant3x3(new int[][] { { matrix[0][1], matrix[0][2] }, { matrix[2][1], matrix[2][2] } })
                / determinant;
        adjugate[1][1] = determinant3x3(new int[][] { { matrix[0][0], matrix[0][2] }, { matrix[2][0], matrix[2][2] } })
                / determinant;
        adjugate[1][2] = -determinant3x3(new int[][] { { matrix[0][0], matrix[0][1] }, { matrix[2][0], matrix[2][1] } })
                / determinant;
        adjugate[2][0] = determinant3x3(new int[][] { { matrix[0][1], matrix[0][2] }, { matrix[1][1], matrix[1][2] } })
                / determinant;
        adjugate[2][1] = -determinant3x3(new int[][] { { matrix[0][0], matrix[0][2] }, { matrix[1][0], matrix[1][2] } })
                / determinant;
        adjugate[2][2] = determinant3x3(new int[][] { { matrix[0][0], matrix[0][1] }, { matrix[1][0], matrix[1][1] } })
                / determinant;

        return adjugate;
    }

    // Main method for Matrix Manipulations
    public static void main(String[] args) {
        int rows = 3, cols = 3;

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Added Matrix:");
        displayMatrix(addedMatrix);

        int[][] subtractedMatrix = subtractMatrices(matrix1, matrix2);
        System.out.println("Subtracted Matrix:");
        displayMatrix(subtractedMatrix);

        int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Multiplied Matrix:");
        displayMatrix(multipliedMatrix);

        int[][] transposedMatrix = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposedMatrix);

        System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(matrix1));

        double[][] inverseMatrix1 = inverse3x3(matrix1);
        System.out.println("Inverse of Matrix 1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(inverseMatrix1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
