import java.util.ArrayList;
import java.util.stream.Collectors;
public class Menu {
   private ArrayList<Product> menu= new ArrayList<Product>();

   //Empty Menu
   public Menu(){
    this.menu = new ArrayList<>();
   }
   //Filled Menu
   public Menu(ArrayList<Product> menu){
    this.menu = menu;
   }
   //Organize Menu
   public String toString(){
    String complete ="";
    // Collections.sort(this.menu, new Comparator<Product>(){
    //     @Override
    //     public int compare(Product p1, Product p2){
    //         return Double.compare(p1.price, p2.price);
    //     }
    // });

    //sorts list using stream
    this.menu = (ArrayList<Product>)menu.stream()
    .sorted((p1,p2)-> Double.compare(p1.price, p2.price))
    .collect(Collectors.toList());
    int count = 1;
    for(Product item:menu){
        complete+= String.format("%s. %s \r\n",count++,item);
    }
    return complete;
   }

   //Add Item
   public void addItem(String input, Menu inputMenu){
    Product selectedProduct = null;
    try{
        int numberInput = Integer.parseInt(input);
        selectedProduct = inputMenu.menu.get(numberInput-1);

    }catch(Exception e){
        selectedProduct = (Product) inputMenu.menu.stream()
        .filter(p->p.name.toLowerCase().contains(input.toLowerCase()))
        .findFirst().orElse(null);
    }
    this.menu.add(selectedProduct);

   }
   //Remove Item
   public void removeItem(int i){
    this.menu.remove(i);
   }





   //testing variables
   public static ArrayList<Product> createMenu(){
    ArrayList<Product> inventory = new ArrayList<Product>();
    inventory.add(new Product("Frappe","Drink","Just Sugar",7.99));
    inventory.add(new Product("Coffee","Drink","Hot and Black",1.99));
    inventory.add(new Product("Smoothie","Drink","Cold and Fruity",10.99));
    inventory.add(new Product("Americano","Drink","Scalding and not American",2.99));
    inventory.add(new Product("Latte","Drink","Hot and Sweet",5.99));
    inventory.add(new Product("Iced Coffee","Drink","Honestly It's Just Ice",4.99));
    inventory.add(new Product("Vanilla Frappe","Drink","2x The Sugar",14.99));
    


    return inventory;
   }

   
}

