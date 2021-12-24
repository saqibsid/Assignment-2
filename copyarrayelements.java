public class copyarrayelements {
    public static void main(String[] args) {
        int i;


        int[] array1 = new int[]{1, 2, 3, 4, 5};
        //create another array of same size of array1
        int[] array2 = new int[array1.length];
        //Copying all elements
        for (i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of original array");
        for (i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }

        System.out.println();


        System.out.println("Elements of new array: ");
        for (i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }
    }
}
