package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ItemTest {

    private ShoppingListService shoppingList;

    @BeforeEach
    void setUp () {
        shoppingList = new ShoppingListServiceImpl();

    }

    @Test
    void should_check_if_item_names_are_not_null_or_empty() {

        List<Item> itemList = new LinkedList<>();

        itemList.add(new Item("banana", 5));
        shoppingList.savedItems(itemList);

        Assertions.assertDoesNotThrow(() -> shoppingList.savedItems(itemList));

    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_null_name_exist () {

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("banana", 5));
        itemList.add(new Item(null, 5));

        Assertions.assertThrows(ItemNameException.class, () -> shoppingList.savedItems(itemList));
    }

    @Test
    void should_throw_item_name_exception_when_an_item_has_a_quantity_less_than_1 () {

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("banana", 0));

        Assertions.assertThrows(ItemNameException.class, () -> shoppingList.savedItems(itemList));

    }

    @Test
    void should_throw_item_name_exception_when_an_item_has_a_quantity_greater_than_100 () {

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("banana", 1000));

        Assertions.assertThrows(ItemNameException.class, () -> shoppingList.savedItems(itemList));

    }
}

