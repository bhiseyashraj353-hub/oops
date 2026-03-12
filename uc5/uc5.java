public class UC5Banner {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array in a single statement using String.join()
        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", "*******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", "*      * ", " *     * "),
            String.join(" ", "*       *", "*       *", "*      * ", " *       "),
            String.join(" ", "*       *", "*       *", "*******  ", "  *****  "),
            String.join(" ", "*       *", "*       *", "*        ", "       * "),
            String.join(" ", " *     * ", " *     * ", "*        ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  ")
        };
        // Step 2: Use enhanced for loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}