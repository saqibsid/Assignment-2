public class upperlowercase {
    public static void main(String[] args) {
        // java program to convert upper case to lower and vice-versa
        // string buffer represents growable and writable character sequences and we can make changes and it can grow to adapt changes
        String str = "hi there";
        StringBuffer a1 = new StringBuffer(str); // we convert normal string to string buffer as it has wide functionality and changes can be made in it
        for(int i=0; i<str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) { // if character is lower case at ith index of string
                a1.setCharAt(i, Character.toUpperCase(str.charAt(i))); // then convert that character to upper case at ith index of string
            } else if (Character.isUpperCase(str.charAt(i))) { // if character is upper case at ith index of string
                a1.setCharAt(i, Character.toLowerCase(str.charAt(i))); // then convert that character to lowercase
            }
        }
        System.out.println("The new improved string is: " +a1);

    }
}



