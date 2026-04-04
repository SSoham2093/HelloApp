public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    names.append(", ");
                }
                names.append(args[i]);
            }
            greeting = "Hello, " + names.toString() + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}