package ru.kfc.autotests.lesson_4.less_4_3;

import java.util.*;

public class Product_main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("xiaomi3", 99000, 3));
        products.add(new Product("galaxy21", 100000, 2));
        products.add(new Product("Pixel9", 90000, 4));
        products.add(new Product("iphone16", 120000, 5));

        for(Product pr : products){
            System.out.println(pr);
        }

        Product maxPrice = products.get(0);
        Product minPrice = products.get(0);

        for(Product p : products){
            if(p.getPrice() > maxPrice.getPrice()){
                maxPrice = p;
            }
            if(p.getPrice() < minPrice.getPrice()){
                minPrice = p;
            }
        }

        System.out.println();

        System.out.println("Товар с наибольшей ценой: " + maxPrice);
        System.out.println("Товар с наименьшей ценой: " + minPrice);

        System.out.println();

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getRating() < 3){
                iterator.remove();
            }
        }
        Collections.sort(products, Comparator.comparing(Product::getName));
        for(Product sort : products){
            System.out.println(sort);
        }
    }

}
