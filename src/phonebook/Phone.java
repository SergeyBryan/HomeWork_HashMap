package phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phone {
    private final Map<String, String> phoneList = new HashMap<>();

    public void addPhone(String name, String phone) {
        phoneList.put(name, phone);
    }

    public void removePhone(String name) {
        phoneList.remove(name);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneList=" + phoneList +
                '}';
    }

}