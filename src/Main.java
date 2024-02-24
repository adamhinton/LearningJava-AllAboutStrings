public class Main {
    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));
    }

    public static void printInformation(String string){
        // Interesting, length() is a function in java, as opposed to JS's number length property
        int length = string.length();

        System.out.printf("Length = %d %n", length);

        // Is empty is a "" string literal
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        // isBlank can have white spaces, blank lines and so on
        if(string.isBlank()){
            System.out.println("String is blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length -1));

        // If string is empty, length is 0
    }
}