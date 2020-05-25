package ru.evdokimov.task18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
class BasketShop implements Basket {
    public BasketShop() {

    }

    ArrayList<BasketShop> basket = new ArrayList<BasketShop>();
    BasketShop bs;
List<String> product = new ArrayList<String>();
List<Integer> quantity = new ArrayList<Integer>();
     @Override
    public void addProduct(String product, int quantity) {
        this.product.add(product);
        this.quantity.add(quantity);

    }

    @Override
    public void removeProduct(String product) {
        int prodIndex = this.product.indexOf(product);
this.product.remove(prodIndex);
this.quantity.remove(prodIndex);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {
product.clear();
quantity.clear();
    }

    @Override
    public List<String> getProducts() {
         for (String product: product)
    System.out.println(product);
return product;
    }

    @Override
    public int getProductQuantity(String product) {
        int prodIndex = this.product.indexOf(product);

            System.out.println(quantity.get(prodIndex));
        return quantity.get(prodIndex);
    }
}
public class Main {
    public static void main(String[] args) {
BasketShop bs = new BasketShop();
bs.addProduct("Хлеб",55);
        bs.addProduct("Молоко",10);
        bs.addProduct("Колбаса",15);
        bs.getProducts();
        bs.getProductQuantity("Колбаса");
        bs.getProductQuantity("Хлеб");
        bs.removeProduct("Хлеб");
        bs.getProducts();
    }
}
