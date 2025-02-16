

    public class ExtremeFinder_QN33 {
        public static int findExtreme(String type, int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("At least one number must be provided.");
            }
    
            int extreme = numbers[0];  
            for (int num : numbers) {
                if (type.equals("smallest") && num < extreme) {
                    extreme = num;
                } else if (type.equals("largest") && num > extreme) {
                    extreme = num;
                }
            }
            return extreme;
        }
    public static void main(String[] args) {
        int x = findExtreme("smallest", 5, 2, 9, 0);
        int y = findExtreme("largest", 8, 23, 10, 4);

        System.out.println("Smallest: " + x);
        System.out.println("Largest: " + y);

    }
}
