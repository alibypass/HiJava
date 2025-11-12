package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ItemTest {

    @Test
    void should_check_if_item_names_are_not_null_or_empty() {
        ShoppingListService shoppingList = new ShoppingListServiceImpl();

        List<Item> itemList = new LinkedList<>();

        itemList.add(new Item("banana", 5));
        shoppingList.savedItems(itemList);

        Assertions.assertDoesNotThrow(() -> shoppingList.savedItems(itemList));

    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_null_name_exist () {}


}
