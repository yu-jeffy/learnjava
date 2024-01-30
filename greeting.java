public class Greeting {
    private String message;
    
    public Greeting(String message) {
        this.message = message;
    }

    public void GreetMe(String name) {
        System.out.println(message + ", " + name + "!");
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello");
        if (args.length > 0) {
            greeting.GreetMe(args[0]);
        }
        else {
            System.out.println("No name provided!");
        }
    }
}