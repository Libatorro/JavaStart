package Teamt31_Comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Sebastian on 2016-04-24.
 */
public class Product implements Comparable<Product> {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
        products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
        products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
        products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy błyskawiczne");
        products[4] = new Product("WINIARY", "Rosół", "Zupy");
        products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");

        System.out.println("Nieposortowana: ");
        for(Product p: products) {
            System.out.println(p);
        }

        Arrays.sort(products);


        Arrays.sort(products, new Product.ProductNameComparator());
        System.out.println("Posortowana: ");
        for(Product p: products) {
            System.out.println(p);
        }
    }



    private String producer;
    private String name;
    private String category;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String producer, String name, String category) {
        setProducer(producer);
        setCategory(category);
        setName(name);
    }

    @Override
    public String toString() {
        return "Product [category=" + category + ", producer=" + producer + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Product p) {
        int categoryCompare = category.compareTo(p.getCategory());
        if(categoryCompare != 0) {
            return categoryCompare;
        }
        int producerCompare = producer.compareTo(p.getProducer());
        if(producerCompare != 0) {
            return producerCompare;
        }
        return name.compareTo(p.getName());


    }

    public static class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}