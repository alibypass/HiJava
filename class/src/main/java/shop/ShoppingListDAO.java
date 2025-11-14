package shop;

import java.util.List;

public interface ShoppingListDAO {

    List<Item> findAllItems();

    void savedItems (List<Item> items);
}
