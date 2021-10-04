package com.disteoe.disteoeservice.order;

import com.disteoe.disteoeservice.entity.order.Cart;
import com.disteoe.disteoeservice.entity.order.ItemOrder;
import com.disteoe.disteoeservice.entity.product.Product;
import com.disteoe.disteoeservice.exceptiondisteoe.ExceptionItemOrder;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CartTest {

    private Cart cart = null;
    private List<Product> products;

    @BeforeEach
    public void init() {

        Product product1 = new Product(), product2 = new Product();
        product1.setPrice(11);
        product2.setPrice(4);

        products = new ArrayList<>(Arrays.asList(product1, product2));
    }

    @BeforeEach
    public void instanceCart() {
        cart = new Cart();
    }

    @Test
    public void testAddItemNull() {
        assertThrows(ExceptionItemOrder.class, () -> {
            cart.addItem(null);
        });
    }

    @Test
    public void testAddOneItem() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertEquals(cart.getTotal(), 22);
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testAddTwoItem() {
        ItemOrder itemOrder1 = new ItemOrder(), itemOrder2 = new ItemOrder();
        itemOrder1.setProduct(products.get(0));
        itemOrder1.setQuantity(2);
        itemOrder2.setProduct(products.get(1));
        itemOrder2.setQuantity(3);

        try {
            cart.addItem(itemOrder1);
            cart.addItem(itemOrder2);
            assertEquals(cart.getTotal(), 34);
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testAddINegative() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.addItem(-1, 1);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testAddQtInvalid() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.addItem(1, 0);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testAddIQtValide() {
        ItemOrder itemOrder1 = new ItemOrder();
        itemOrder1.setProduct(products.get(1));
        itemOrder1.setQuantity(3);

        try {
            cart.addItem(itemOrder1);
            cart.addItem(0, 10);
            assertEquals(cart.getTotal(), 52);
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveINegative() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.removeItem(-1);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveIBiggerSize() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.removeItem(1);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveI() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            cart.removeItem(0);
            assertEquals(cart.getTotal(), 0);
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveIdNegative() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.removeItem(-1, 1);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveQtInvalid() {
        ItemOrder itemOrder = new ItemOrder();
        itemOrder.setProduct(products.get(0));
        itemOrder.setQuantity(2);

        try {
            cart.addItem(itemOrder);
            assertThrows(ExceptionItemOrder.class, () -> {
                cart.removeItem(1, 0);
            });
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }

    @Test
    public void testRemoveIQtValide() {
        ItemOrder itemOrder1 = new ItemOrder();
        itemOrder1.setProduct(products.get(1));
        itemOrder1.setQuantity(3);

        try {
            cart.addItem(itemOrder1);
            cart.removeItem(0, 1);
            assertEquals(cart.getTotal(), 8);
        } catch (ExceptionItemOrder e) {
            fail("Falha ao inserir");
        }
    }
}
