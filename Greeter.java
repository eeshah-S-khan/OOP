public class Greeter{
    private String name;

    public Greeter(String name){
        this.name = name;
    }

    public void message(){
        System.out.println("Hello there!");
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Eeshah");
        greeter.message();
        }
}
