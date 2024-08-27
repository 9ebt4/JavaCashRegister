import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.flush();

        Menu menu = new Menu(Menu.createMenu());
        Menu cart = new Menu();

        

        System.out.println("\r\n \r\nWelcome to Generic Coffee where we have generic coffee.\r\nPlease choose from any of our super generic items.\r\n");
        System.out.println(menu);
        System.out.println("Enter the item you would like or it's number");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        cart.addItem(input, menu);

        System.out.println(cart);
    }
}
