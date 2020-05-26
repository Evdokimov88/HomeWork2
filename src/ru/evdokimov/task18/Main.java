package ru.evdokimov.task18;

import java.util.ArrayList;
import java.util.List;

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


List<String> product = new ArrayList<>();
List<Integer> quantity = new ArrayList<>();
     @Override
    public void addProduct(String product, int quantity) {
        this.product.add(product);
        this.quantity.add(quantity);

    }

    @Override
    public void removeProduct(String product) {
        try{
         int prodIndex = this.product.indexOf(product);
        //if (this.product.get(prodIndex).equals(product)) {

            this.product.remove(prodIndex);
            this.quantity.remove(prodIndex);
        }
        catch (Exception e)
        {
            System.out.println("Данный товар отсутствует в корзине");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        try{
         int index = this.product.indexOf(product);
        //if (this.product.get(index).equals(product)) {

            this.quantity.set(index, quantity);
        }
        catch (Exception e){
            System.out.println("Данный товар отсутствует в корзине");
        }
    }
    @Override
    public void clear() {
product.clear();
quantity.clear();
    }

    @Override
    public List<String> getProducts() {
        System.out.println();
         System.out.println("Список товаров:");
         for (String product: product)
    System.out.println(product);
         System.out.println();
return product;
    }

    @Override
    public int getProductQuantity(String product) {
        try {
         int prodIndex = this.product.indexOf(product);
        //if (this.product.get(prodIndex).equals(product)) {

            System.out.println();
            System.out.println("Количество товара: " + this.product.get(prodIndex) + " = " +
                    quantity.get(prodIndex) + " шт.");
            System.out.println();
        }
        catch (Exception e){

            System.out.println("Данный товар отсутствует в корзине");
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
BasketShop bs = new BasketShop();
bs.addProduct("Монитор",55);
        bs.addProduct("Ноутбук",10);
        bs.addProduct("Флэш карта",15);
        bs.getProducts();
        bs.getProductQuantity("Ноутбук");
        bs.getProductQuantity("Флэш карта");
        bs.removeProduct("Монитор");
        bs.getProducts();
        bs.updateProductQuantity("Флэш карта", 32);
        bs.getProductQuantity("Флэш карта");
        bs.getProductQuantity("Монитор");
        bs.clear();
        bs.getProducts();
    }
}
