public class charAddress {
    public static void main(String[] args) {
        // Create a char array with 5 elements
        char[] charArray = new char[5];

        // Populate the array with some characters
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 'e';

        // Print the elements along with their memory addresses
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Element at index " + i + ": " + charArray[i] + " - Memory Address: " + getAddress(charArray[i]));
        }
    }

    // Method to get the memory address of a char variable
    public static String getAddress(char c) {
        // Convert the char to an integer, as Java does not provide direct memory access
        int address = (int) c;
        // Convert the integer to hexadecimal for better readability
        return Integer.toHexString(address);
    }
}
