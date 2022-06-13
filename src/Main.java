public class Main {
    public static void main(String[] args) {
        task1and2();
        task3();
        task4();
    }


    public static void task1and2() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");

        double[] arr2 = {1.57, 7.564, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else System.out.print(arr2[i] + ", ");
        }
        System.out.print("\n");


        int[] arr3 = {1, 2, 54, 21, 675, 13, 0, 0, 342};
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
            } else System.out.print(arr3[i] + ", ");
        }
    }

    public static void task3() {
        int[] arr = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 54, 21, 675, 13, 0, 0, 342};
        System.out.println("\n");


        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else
                System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");


        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
            } else System.out.print(arr2[i] + ", ");
        }
        System.out.print("\n");


        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
            } else System.out.print(arr3[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void task4() {
        int[] arr = {1, 2, 3};
        for (int i = 0; i <= (arr.length - 1); i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + 1 + ", ");

            } else
                System.out.print(arr[i] + ", ");
        }


    }
}