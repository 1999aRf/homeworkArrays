public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int [] integerArray = new int[3];
        integerArray[0] = 19;
        integerArray[1] = 5;
        integerArray[2] = 3;
        double [] fractions = {1.57, 7.654, 9.986};
        int [] myArrays = new int[] {30, 10, 1999};


        System.out.println("Задание 2");
        System.out.println("Элементы целочисленного массива");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Элементы массива дробных чисел");
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Элементы произвольного массива");
        for (int i = 0; i < myArrays.length; i++) {
            System.out.print(myArrays[i]);
            if (i < myArrays.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Задание 3");
        System.out.println("Элементы целочисленного массива в обратном порядке");
        for (int i = integerArray.length-1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Элементы массива дробных чисел в обратном порядке");
        for (int i = fractions.length-1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Элементы произвольного массива в обратном порядке");
        for (int i = myArrays.length-1; i >= 0; i--) {
            System.out.print(myArrays[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i]++;
                }
            }
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}