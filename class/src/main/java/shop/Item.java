package shop;

public class Item {

    private static String name;
    private static int quantity;
    public Item(String name, int quantity) {
        Item.name = name;
        this.quantity = quantity;
    }

    static void check() {
        if (name == null || quantity == 0) {
            throw new ItemNameException();
        }
        if (quantity > 100) {
            throw new ItemNameException();

        }
    }

}
