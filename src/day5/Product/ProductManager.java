package day5.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<Product>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void updateProduct(int id, String name, int price, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
            }
        }
        displayProducts();
    }
    public void searchProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }
    public void sortProducts() {
        int sl = products.size();
        for(int i = 0; i < sl; i++) {
            for (int j = i+1; j < sl; j++) {
                if(products.get(i).getId() > products.get(j).getId()) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        displayProducts();
    }
}
