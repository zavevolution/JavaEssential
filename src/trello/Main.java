package trello;

//Наименование
//Количество
//Цена
//Изготовитель
//Дата_поступления_на_склад
//
//Определить количество всех
//товаров, количество которых
//больше 5 и вывести сведения об
//этих товарах.

import java.util.ArrayList;

class Product {
    private String name;
    private int count;
    private double price;
    private String producer;
    private int insertDate;

    public Product(String name, int count, double price, String producer, int insertDate) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.producer = producer;
        this.insertDate = insertDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(int insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", insertDate=" + insertDate +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Телевізор", 7, 34.50, "Sony", 2024);
        Product product2 = new Product("Пральна машина", 8, 34.50, "Indesit", 2024);
        Product product3 = new Product("Ксерокс", 3, 34.50, "HP", 2024);
        Product product4 = new Product("Кавоварка", 34, 34.50, "Illy", 2024);
        Product product5 = new Product("Холодильник", 15, 34.50, "Samsung", 2024);

        Product[] products = {product1, product2, product3, product4, product5};

        for (Product p : products) {
            if (p.getCount() > 5) {
                System.out.println(p);
            }
        }

    }
}
