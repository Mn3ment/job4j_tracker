package ru.job4j.inheritance.product;

import java.util.Objects;

public final class Product {
    private String name;
    private int price;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return price == product.price
                && count == product.count
                && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, count);
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

    public int price() {
        return price - discount();
    }

    public int discount() {
        return 0;
    }

    public String label() {
        return name + " " + price();
    }
}
