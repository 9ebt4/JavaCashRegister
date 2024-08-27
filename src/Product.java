public class Product {
    String name = "";
    String category = "";
    String description= "";
    Double price = 0d;

    public Product(String _name, String _category, String _description, Double _price ){
        this.name = _name;
        this.category = _category;
        this.description = _description;
        this.price = _price;
    }

    public String toString(){
        return String.format("Name: %s Category: %s Description: %s Cost: $%s", this.name, this.category, this.description,this.price);
    }
}
