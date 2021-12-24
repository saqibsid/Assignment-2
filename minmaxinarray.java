public class minmaxinarray {
    public static void main(String[] args) {
        int i;
        int[] array = new int[]{5,6,3,2,1};
        int max;
        max=array[0];
        for(i=0; i< array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("The largest value in array is: " +max);
    }
}
