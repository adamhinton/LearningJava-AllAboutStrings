public class Main {
    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");

    }

    public static void printInformation(String string){
        // Interesting, length() is a function in java, as opposed to JS's number length property
        int length = string.length();
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length -1));

        // If string is empty, length is 0
    }
}