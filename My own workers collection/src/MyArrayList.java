public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index <= size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String string) {
        for (int i = 0; i < size; i++) {
            if (string.equals(array[i])) {
                remove(i);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index <= size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}
