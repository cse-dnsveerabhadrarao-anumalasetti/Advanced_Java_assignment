package OnlineShoppingCartPriceCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartServiceTest {

    private CartService service;

    @BeforeEach
    void setup() {
        service = new CartService();
    }

    @Test
    void testCalculateTotal() {
        double total = service.calculateTotal(1000, 1500, 2000);
        assertEquals(4500, total);
    }

    @Test
    void testDiscountApplied() {
        double total = service.calculateTotal(2000, 2000, 1000); // 5000
        double discount = service.calculateDiscount(total);
        assertEquals(500, discount);
    }


    @Test
    void testNoDiscount() {
        double total = service.calculateTotal(1000, 1500, 2000); // 4500
        double discount = service.calculateDiscount(total);
        assertEquals(0, discount);
    }

    @Test
    void testFinalPayableAmount() {
        double total = service.calculateTotal(2000, 2000, 1000); // 5000
        double finalAmount = service.calculateFinalAmount(total);
        assertEquals(4500, finalAmount);
    }
}
