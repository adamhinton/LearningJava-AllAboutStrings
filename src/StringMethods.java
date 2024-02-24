public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.printf("\n startingIndex: %d \n", startingIndex);
        System.out.printf("Birth year: %s", birthDate.substring(startingIndex));

        // substring() excludes the character at your second index. Good to know.
        System.out.printf("\n Month = %s", birthDate.substring(3, 5));

    }

}
