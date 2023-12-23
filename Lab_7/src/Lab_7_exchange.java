
public class Lab_7_exchange<T> {
    public static void main(String[] args) {
        Lab_7_exchange<String> firstClass = new Lab_7_exchange<>("Hello");
        Lab_7_exchange<String> secondClass = new Lab_7_exchange<>("World!");
        System.out.printf("Значения до обмена у первого класса: %s и у второго: %s", firstClass.getData(), secondClass.getData());
        Lab_7_exchange.exchangeData(firstClass, secondClass);
        System.out.printf("\nЗначения после обмена у первого класса: %s и у второго: %s", firstClass.getData(), secondClass.getData());
    }

    public Lab_7_exchange(T data) {
        this.data = data;
    }

    public static <E> void exchangeData(Lab_7_exchange<E> firstClass, Lab_7_exchange<E> secondClass) {
        E tmp = firstClass.getData();
        firstClass.setData(secondClass.getData());
        secondClass.setData(tmp);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
}