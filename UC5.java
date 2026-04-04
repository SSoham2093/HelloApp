public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string construction
            StringBuilder names = new StringBuilder();

            // Enhanced for loop to iterate through all arguments
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // Add comma only between names
                }
                names.append(name);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}