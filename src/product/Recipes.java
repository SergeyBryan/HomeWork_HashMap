package product;

import java.util.*;

public class Recipes {
    public HashMap<Product, Integer> productSet;
    public String name;

    public Recipes(String name) {
        this.productSet = new HashMap<>();
        this.name = name;
    }

    public double getTotalForAllProduct() {
        double totalProduct = 0.0;
        for (Map.Entry<Product, Integer> product : productSet.entrySet()) {
            totalProduct += product.getKey().getPrice() * product.getValue();
        }
        return totalProduct;
    }

    public void addProductList(Product product) {
        if (product == null) {
            return;
        }
        if (this.productSet.containsKey(product)) {
            Integer productCount = this.productSet.get(product);
            this.productSet.put(product, ++productCount);
        } else {
            this.productSet.put(product, 1);
        }
    }

    public void checkProduct(String name) {
        boolean isBought = false;
        for (Map.Entry<Product, Integer> product : productSet.entrySet()) {
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + " куплен");
                isBought = true;
                break;
            }
        }
        if (!isBought) {
            System.out.println(name + " не куплен");
        }
    }

    public String getName() {
        return name;
    }


    public void addRecipeInSet(Set<Recipes> recipesSet) {
        if (!recipesSet.contains((this))) {
            recipesSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.getName() + " уже находится в коллекции");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(name, recipes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт " + name + "\n" +
                " требуется: " + productSet;
    }
}
