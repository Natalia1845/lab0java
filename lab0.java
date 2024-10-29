package labs.lab0;

public class Variant2 {

    /**
     * Array2: Формує масив розміру N, що містить степені двійки.
     * @param N розмір масиву (N > 0)
     * @return масив із степенями двійки
     */
    public int[] arrayTask(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N має бути більше 0");
        }
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = (int) Math.pow(2, i);
        }
        return result;
    }

    /**
     * Boolean2: Перевірка, чи є число A непарним.
     * @param A ціле число
     * @return true, якщо A непарне, інакше false
     */
    public boolean booleanTask(int A) {
        return A % 2 != 0;
    }

    /**
     * Case2: Виводить опис оцінки, що відповідає числу K.
     * @param K ціле число від 1 до 5
     * @return рядок-опис оцінки або "помилка"
     */
    public String caseTask(int K) {
        switch (K) {
            case 1: return "погано";
            case 2: return "незадовільно";
            case 3: return "задовільно";
            case 4: return "добре";
            case 5: return "відмінно";
            default: return "помилка";
        }
    }

    /**
     * For2: Виводить усі цілі числа між A та B у порядку зростання і їх кількість.
     * @param A початкове число
     * @param B кінцеве число (A < B)
     * @return масив цілих чисел між A і B
     */
    public int[] forTask(int A, int B) {
        if (A >= B) {
            throw new IllegalArgumentException("A має бути менше за B");
        }
        int[] result = new int[B - A + 1];
        for (int i = 0; i <= B - A; i++) {
            result[i] = A + i;
        }
        return result;
    }

    /**
     * If2: Змінює число на основі його значення.
     * @param number ціле число
     * @return змінене число (додати 1, якщо позитивне; відняти 2, якщо не позитивне)
     */
    public int ifTask(int number) {
        return (number > 0) ? number + 1 : number - 2;
    }

    /**
     * Integer2: Визначає кількість повних тонн у масі M (1 тонна = 1000 кг).
     * @param M маса в кілограмах
     * @return кількість тонн
     */
    public int integerTask(int M) {
        return M / 1000;
    }

    /**
     * Matrix2: Формує матрицю розміру M x N, де J-й стовпець має значення 5 * J.
     * @param M кількість рядків
     * @param N кількість стовпців
     * @return сформована матриця
     */
    public int[][] matrixTask(int M, int N) {
        int[][] matrix = new int[M][N];
        for (int j = 0; j < N; j++) {
            int value = 5 * (j + 1);
            for (int i = 0; i < M; i++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    /**
     * While2: Рахує кількість відрізків B, що поміщаються на відрізку A без накладень.
     * @param A довжина відрізка A
     * @param B довжина відрізка B
     * @return кількість відрізків B на відрізку A
     */
    public int whileTask(int A, int B) {
        if (A <= B || B <= 0) {
            throw new IllegalArgumentException("A має бути більше за B, B > 0");
        }
        int count = 0;
        while (A >= B) {
            A -= B;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Variant6 variant = new Variant6();

        // Приклади виклику методів
        System.out.println("ArrayTask: " + java.util.Arrays.toString(variant.arrayTask(5)));
        System.out.println("BooleanTask: " + variant.booleanTask(5));
        System.out.println("CaseTask: " + variant.caseTask(3));
        System.out.println("ForTask: " + java.util.Arrays.toString(variant.forTask(2, 6)));
        System.out.println("IfTask: " + variant.ifTask(-3));
        System.out.println("IntegerTask: " + variant.integerTask(1200));
        System.out.println("MatrixTask: ");
        int[][] matrix = variant.matrixTask(3, 4);
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
        System.out.println("WhileTask: " + variant.whileTask(20, 3));
    }
}
