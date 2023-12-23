public class Lab_10 {
    public static void main(String[] args) {
        Triple<Integer> triple_int = new Triple<>(10, 5, 8);

        System.out.println("Min: " + triple_int.min());
        System.out.println("Max: " + triple_int.max());
        System.out.println("Mean: " + triple_int.mean());

        Triple<String> nonMeanableTriple = new Triple<>("one", "two", "three");
        try {
            System.out.println("Mean: " + nonMeanableTriple.mean());
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}