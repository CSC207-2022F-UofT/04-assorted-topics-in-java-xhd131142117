/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
public class DrivableTrader extends Trader{
    private final List<T> inventory;
    private final List<T> wishlist;
    private int money;
    public DrivableTrader(List<T> inventory, List<T> wishlist,
                  int money) {
        this.inventory = inventory;
        this.wishlist = wishlist;
        this.money = money;
    }
    @Override
    public int getSellingPrice(T obj){
        return obj.getPrice() + obj.getMaxSpeed();
    }
}
