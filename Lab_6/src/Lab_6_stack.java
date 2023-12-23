public class Lab_6_stack<T> {
    public Lab_6_stack(int maxSize) {
        data = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
        top = 0;
    }

    public void push(T element) {
        if (top == maxSize) {
            System.out.println("Вставка элемента невозможна, стек переполнен.");
        } else {
            data[top] = element;
            top += 1;
        }
    }

    public T pop() {
        if (top == 0) {
            System.out.println("Удаление невозможно, пустой стек.");
            return null;
        } else {
            top -= 1;
            return data[top];
        }
    }

    public T peek() {
        if (top == 0) {
            System.out.println("В стеке отсутствуют элементы.");
            return null;
        } else {
            return data[top - 1];
        }
    }

    public static void main(String[] args) {
        Lab_6_stack<Integer> testStack = new Lab_6_stack<>(7);

        testStack.push(3);
        testStack.push(8);
        testStack.push(11);
        System.out.println("Верхний элемент стека после добавления элементов 3, 8, 11: " + testStack.peek());

        testStack.pop();
        System.out.println("Верхний элемент стека после удаления элемента: " + testStack.peek());
    }

    private T[] data;
    private final int maxSize;
    private int top;
}