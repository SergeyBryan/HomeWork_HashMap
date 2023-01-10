
import phonebook.Phone;
import product.Product;
import product.Recipes;

import java.util.*;

public class Main {
    private static Map<String, Integer> list = new HashMap<>();

    public static void main(String[] args) {
//        Задание 1
        Phone phoneList = new Phone();
        phoneList.addPhone("Василий Петрович", "79278902762");
        phoneList.addPhone("Иван Иванов", "792752502762");
        phoneList.addPhone("Василий Сидоров", "81328902762");
        phoneList.addPhone("Генадий Петрович", "79223502762");
        phoneList.addPhone("Михаил Петрович", "+79278902762");
        phoneList.addPhone("Александр Петрович", "+89278902762");
        phoneList.addPhone("Максим Петрович", "792732402762");
        phoneList.addPhone("Николай Романович", "79338902762");
        phoneList.addPhone("Семен Романович", "79338902762");
        phoneList.addPhone("Семен Николаевич", "79998902762");
        phoneList.addPhone("Артем Романович", "89838902762");
        phoneList.addPhone("Никита Константинович", "+79838922762");
        phoneList.addPhone("Данила Романович", "79278902762");
        phoneList.addPhone("Артем Романович", "79278903762");
        phoneList.addPhone("Лев Романович", "79278905762");
        phoneList.addPhone("Ибрагим Константинович", "79272902762");
        phoneList.addPhone("Руслан Дамирович", "79278902262");
        phoneList.addPhone("Николай Сидоров", "79278905562");
        phoneList.addPhone("Леонид Сидоров", "79278922362");
        phoneList.addPhone("Максим Сидоров", "79278902762");
        System.out.println(phoneList);
//        Задание 2
        Product bananas = new Product("Бананы", 149, 2);
        Product orange = new Product("Апельсины", 150, 4);
        Product potates = new Product("Картошка", 160, 2);
        Product cucumbers = new Product("Огурцы", 110, 2);
        Product sugar = new Product("Сахар", 110, 2);
        Product cheese = new Product("Сыр", 110, 2);
        Product carrot = new Product("Морковь", 95, 2);
        Product sausage = new Product("Колбаса", 200, 0.5);
        Product olives = new Product("Оливки", 110, 0.3);
        Product chicken = new Product("Курица", 210, 1);
        Product lettuce = new Product("Салат", 125, 0.1);
        Product pepper = new Product("Перец", 150, 1);
        Product tomates = new Product("Помидоры", 210, 1);
        Recipes olivieSalad = new Recipes("Салат Оливье");
        Recipes vegetableSalad = new Recipes("Овощной салат");
        Recipes caesar = new Recipes("Салат цезарь");
        caesar.addProductList(cheese);
        caesar.addProductList(cheese);
        caesar.addProductList(tomates);
        caesar.addProductList(tomates);
        vegetableSalad.addProductList(tomates);
        vegetableSalad.addProductList(tomates);
        vegetableSalad.addProductList(pepper);
        vegetableSalad.addProductList(pepper);
        vegetableSalad.addProductList(pepper);
        vegetableSalad.addProductList(lettuce);
        vegetableSalad.addProductList(lettuce);
        vegetableSalad.addProductList(cucumbers);
        System.out.println(caesar.getTotalForAllProduct());
        System.out.println(caesar);
        System.out.println(vegetableSalad);
        System.out.println(vegetableSalad.getTotalForAllProduct());
        //Задание 3
        AddInMap("str1", 2);
        AddInMap("str2", 4);
        AddInMap("str1", 3);
        for (Map.Entry<String, Integer> stringIntegerEntry : list.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
//       Задание 4
        Map<String, List<Integer>> random = new HashMap<>();
        Random element = new Random();
        random.put("String1", Arrays.asList(element.nextInt(1000), element.nextInt(1000), element.nextInt(1000)));
        random.put("String2", Arrays.asList(element.nextInt(1000), element.nextInt(1000), element.nextInt(1000)));
        random.put("String3", Arrays.asList(element.nextInt(1000), element.nextInt(1000), element.nextInt(1000)));
        random.put("String4", Arrays.asList(element.nextInt(1000), element.nextInt(1000), element.nextInt(1000)));
        random.put("String5", Arrays.asList(element.nextInt(1000), element.nextInt(1000), element.nextInt(1000)));
        for (Map.Entry<String, List<Integer>> stringListEntry : random.entrySet()) {
            System.out.println(stringListEntry.getKey() + " : " + stringListEntry.getValue());
        }
        Map<String, Integer> randomNew = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringIntegerEntry : random.entrySet()) {
            randomNew.put(stringIntegerEntry.getKey(), sumElements(stringIntegerEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : randomNew.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
//      Задание 5
        Map<Integer, String> task2 = new LinkedHashMap<>();
        task2.put(1, "first line");
        task2.put(150, "second line");
        task2.put(132, "third line");
        task2.put(177, "fourth line");
        task2.put(185, "fifth line");
        task2.put(200, "sixth line");
        task2.put(55, "seventh line");
        task2.put(88, "eighth line");
        task2.put(5, "ninth line");
        task2.put(99, "tenth line");
        for (Map.Entry<Integer, String> stringIntegerEntry : task2.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

    public static void AddInMap(String name, Integer value) {
        if (list.containsValue(value) && list.containsKey(name)) {
            throw new RuntimeException("Данное значение и ключ уже есть");
        } else {
            list.put(name, value);
        }
    }
}