import com.jad.parallelchange.field.ShoppingCart;
import com.jad.parallelchange.field.ShoppingCart2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    public void singleItem_totalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);
        assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);
        assertFalse(shoppingCart.hasDiscount());
    }

    @Test
    public void multipleItems_numberOfProductsInTheCart() throws Exception {
        ShoppingCart2 shoppingCart2 = new ShoppingCart2();
        shoppingCart2.add(10);
        shoppingCart2.add(20);
        assertEquals(2, shoppingCart2.numberOfProducts());
    }

    @Test
    public void multipleItems_totalPrice() throws Exception {
        ShoppingCart2 shoppingCart2 = new ShoppingCart2();
        shoppingCart2.add(10);
        shoppingCart2.add(20);
        assertEquals(30, shoppingCart2.calculateTotalPrice());
    }

    @Test
    public void multipleItems_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart2 shoppingCart2 = new ShoppingCart2();
        shoppingCart2.add(10);
        shoppingCart2.add(130);
        assertTrue(shoppingCart2.hasDiscount());
    }

    @Test
    public void multipleItems_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart2 shoppingCart2 = new ShoppingCart2();
        shoppingCart2.add(10);
        shoppingCart2.add(99);
        assertFalse(shoppingCart2.hasDiscount());
    }
}