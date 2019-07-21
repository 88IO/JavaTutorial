class IntArrayTester {
    public static void main(String[] args) {
        IntArray numbers = new IntArray(new int[] {1, 5, 2, 4, 2, 1});

        System.out.println("Description: " + numbers.description());

        System.out.println("Max: " + numbers.max());
        System.out.println("Min: " + numbers.min());
        System.out.println("Sum: " + numbers.sum());

        numbers.sort();
        System.out.println("Sort: " + numbers.description());

        numbers.reverse();
        System.out.println("Reverse: " + numbers.description());

        numbers.add(3);
        System.out.println("Add 3: " + numbers.description());

        numbers.insert(10, 2);
        System.out.println("Insert [10] = 2: " + numbers.description());

        numbers.join(new IntArray(new int[] {-1, -2, -3}));
        System.out.println("Join {-1, -2, -3}: " + numbers.description());
    }
}
