class IntArray {
    int[] array;

    IntArray(int n) {
        array = new int[n];
    }
    IntArray(int[] array) {
        this.array = new int[array.length];
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    int sum() {
        int sum = 0;
        for (int n : this.array) {
            sum += n;
        }
        return sum;
    }

    String description() {
        String elem = "[";
        for (int i = 0; i < this.array.length; i++) {
            elem += String.format("%d" + ((i == this.array.length -1) ? "]" : ", "), this.array[i]);
        }
        return elem;
    }

    void sort() {
        for (int i = 0; i < this.array.length - 1; i++) {
            for (int j = 0; j < this.array.length - 1; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    int tmp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = tmp;
                }
            }
        }
    }

    void reverse() {
        for (int i = 0; i < this.array.length / 2; i++) {
            int tmp = this.array[i];
            this.array[i] = this.array[this.array.length -1 - i];
            this.array[this.array.length - 1 - i] = tmp;
        }
    }

    int max() {
        int max = Integer.MIN_VALUE;
        for (int n : this.array) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    int min() {
        int min = Integer.MAX_VALUE;
        for (int n : this.array) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

    void add(int n) {
        int[] newArray = new int[this.array.length + 1];

        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        newArray[newArray.length - 1] = n;

        this.array = newArray;
    }

    void insert(int n, int index) {
        int[] newArray = new int[this.array.length + 1];

        System.arraycopy(this.array, 0, newArray, 0, index);
        newArray[index] = n;
        System.arraycopy(this.array, index, newArray, index + 1, this.array.length - index);

        this.array = newArray;
    }

    void join(IntArray numbers) {
        int[] newArray = new int[this.array.length + numbers.array.length];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        System.arraycopy(numbers.array, 0, newArray, this.array.length, numbers.array.length);

        this.array = newArray;
    }
}
