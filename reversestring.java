public class reversestring {
    public static void main(String[] args) {
        // reverse string program
        String ogstring = "hello world";

        String revstring = ""; // we created this string to store the reversed string
        for(int i=ogstring.length()-1; i>=0; i--){
            revstring = revstring + ogstring.charAt(i); // here we store last character of ogstring and add it up in revstring
            // storing the character present at index i rach time in revstring until loop breaks
        }

        System.out.println("The original string was: " +ogstring);
        System.out.println("The reversed string is: " +revstring);
    }
}
