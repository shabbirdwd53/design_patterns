/**
 * This is the example of object level adater because we are adapting groceryItem using
 * instance of that particular class.
 */
public class GroceryItemAdapter  implements Item {
    private GroceryItem item;
    public GroceryItemAdapter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
