
    import java.util.Arrays;

    public class ej5 {
        public static void main(String[] args) {
            int N = 10;
            int[][] multiplicationTables = generateMultiplicationTables(N);
            displayMultiplicationTables(multiplicationTables);
        }

        public static int[][] generateMultiplicationTables(int N) {
            int[][] tables = new int[N][10];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 10; j++) {
                    tables[i][j] = (i + 1) * j;
                }
            }
            return tables;
        }

        public static void displayMultiplicationTables(int[][] tables) {
            for (int i = 0; i < tables.length; i++) {
                System.out.println("Tabla de multiplicar del número " + (i + 1) + ":");
                for (int j = 0; j < tables[i].length; j++) {
                    System.out.println((i + 1) + " x " + j + " = " + tables[i][j]);
                }
                System.out.println();
            }
        }
    }
