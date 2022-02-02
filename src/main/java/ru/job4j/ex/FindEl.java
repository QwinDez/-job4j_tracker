package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key)  throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] != key) {
                throw new ElementNotFoundException("Element not found");
            }
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Den"};
        try {
            System.out.println(indexOf(names, "Nick"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
