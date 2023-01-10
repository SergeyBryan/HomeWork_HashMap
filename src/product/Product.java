package product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    public String name;
    public int price;
    public double quantity;
    public Set<Product> list = new HashSet<>();
    public boolean bought;

    public Product(String name, int price, double quantity) throws IllegalArgumentException {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Нужно заполнить все данные");
        } else {
            this.name = name;
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Нужно заполнить все данные");
        }
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Нужно заполнить все данные");
        }
    }

    public String getName() {
        return name;
    }

    public void addProductsInBusket(Set<Product> busket) {
        if (!busket.contains((this))) {
            busket.add(this);
            this.bought = true;
        } else {
            throw new UnsupportedOperationException("Продукт " + this.getName() + " уже находится в корзине");
        }
    }

    public int getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isBought() {
        return bought;
    }

    @Override
    public String toString() {
        return "Продукт " +
                name +
                ", цена " + price +
                ", вес " + quantity + " кг";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}