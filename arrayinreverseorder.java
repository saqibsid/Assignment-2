public class arrayinreverseorder {
    public static void main(String[] args) {
        int i;


        int[] array1 = new int[]{1, 2, 3, 4, 5};
        //create another array of same size of array1
        int[] array2 = new int[array1.length];
        //Copying all elements
        for (i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of array: ");
        for (i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }

        System.out.println();


        System.out.println("Elements in reversed order: ");
        for (i = array2.length - 1; i >= 0; i--) {
            System.out.print(" " + array2[i]);
        }

    }
}
