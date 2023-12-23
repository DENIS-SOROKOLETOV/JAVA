public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (!isComparable()) {
            throw new UnsupportedOperationException("Type is not comparable");
        }
        return min(first, min(second, third));
    }

    public T max() {
        if (!isComparable()) {
            throw new UnsupportedOperationException("Type is not comparable");
        }
        return max(first, max(second, third));
    }

    public double mean() {
        if (!(first instanceof Number) || !(second instanceof Number) || !(third instanceof Number)) {
            throw new UnsupportedOperationException("Type is not a number");
        }
        double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
        return sum / 3.0;
    }

    private T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    private T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    private boolean isComparable() {
        return first instanceof Comparable && second instanceof Comparable && third instanceof Comparable;
    }
}