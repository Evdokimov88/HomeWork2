package ru.evdokimov.task21;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    Map<String,Integer> product = new HashMap<>();
    @Override
    public void addProduct(String product, int quantity) {
        this.product.put(product,quantity);


    }

    @Override
    public void removeProduct(String product) {
        try{
            this.product.remove(product);
        }
        catch (Exception e)
        {
            System.out.println("Данный товар отсутствует в корзине");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        try{
            this.product.put(product,quantity);
        }
        catch (Exception e){
            System.out.println("Данный товар отсутствует в корзине");
        }
    }
    @Override
    public void clear() {
        product.clear();

    }

    @Override
    public List<String> getProducts() {
        System.out.println();
        System.out.println("Список товаров:");
        for (String product: product.keySet())
            System.out.println(product);
        System.out.println();
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        try {
                System.out.println();
            System.out.println("Количество товара: " +product+ " = " +
                   +this.product.get(product)+" шт.");
            System.out.println();

            return this.product.get(product);
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
