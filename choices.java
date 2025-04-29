public class choices {
    public static void choices(int price){
        if(price < 25){
            System.out.println("I'll buy!");
        }
        else{
            System.out.println("Too expensive");
        }
    }
    public static void main(String[] args) {
        int price = 20;
        choices(price);
    }
}
