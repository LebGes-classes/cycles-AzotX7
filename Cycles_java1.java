//В одномерном массиве, состоящем из n вещественных элементов, вычислить:
//        Максимальный отрицательный элемент массива.
//        Сумму элементов массива, расположенных до последнего положительного элемента массива.
//        Вывести массив на экран.


public class Cycles_java1 {
    public static void main(String[] args) {
        double[] arr = {9.8, 9.9, 3.3, -3.5, -2.3, 4.5, 8.8};
        double maxN = maxNeg(arr);
        double sum = suma(arr);

        System.out.println("Макс отриц число: " + maxN);
        System.out.println("Сумма: " + sum);
    }
    public static double maxNeg(double[] arr){
        double maxN = Double.NEGATIVE_INFINITY;

        for (double num : arr) {
            if (num < 0 && num > maxN) {
                maxN = num;
            }
        }
        return maxN;
    }

    public static double suma(double[] arr) {
        double sum = 0;
        int lastIndex = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >0){
                lastIndex = i;
                break;
            }
        }
        if (lastIndex != -1){
            for (int i = 0; i < lastIndex; i++) {
                sum += arr[i];

            }
        }


        return sum;
    }
}

