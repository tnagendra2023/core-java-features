package com.java.programs;

import java.util.Arrays;

public class CustomArrayList<E> {
    private static int size = 0;
    private Object[] elements;

    public CustomArrayList() {
        int DEFAULT_CAPACITY = 10;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (size == elements.length) {
            increaseThreshHold();
        }
        elements[size] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(E element) {
        int index = indexOf(element);
        if (index != -1) {
            removeAtIndex(index);
        }
    }

    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;

                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i]))
                    return i;
            }
        }
        return -1;
    }

    private void removeAtIndex(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                elements[i] = null;
                size--;
                break;
            }
        }

    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index > elements.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of range: " + index);
        }
        return (E) elements[index];
    }

    private void increaseThreshHold() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}

class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.remove(0);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(10));
    }
}
