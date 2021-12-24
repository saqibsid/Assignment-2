public class charactercount {
    public static void main(String[] args) {
        // program to count characters in a string
        String str = "hello bhai how are you";
        int count=0; // this vaiable will keep count of characters
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= ' '){ // count the characters excluding the space
                count++;
            }
        }
        System.out.println("The total characters are: " +count);
    }

}
