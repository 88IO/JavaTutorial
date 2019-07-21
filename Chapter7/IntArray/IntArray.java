class IntArray {
    int[] intarray;

    IntArray(int n) {
        intarray = new int[n];
    }
    IntArray(int[] intarray) {
        this.intarray = new int[intarray.length];
        System.arraycopy(intarray, 0, this.intarray, 0, intarray.length);
    }

    int sum() {
        int sum = 0;
        for (int i = 0; i < this.intarray.length; i++) {
            sum += this.intarray[i];
        }
        return sum;
    }

    String description() {
        String elem = "[";
        for (int i = 0; i < this.intarray.length; i++) {
            elem += String.format("%d" + ((i == this.intarray.length -1) ? "]" : ", "), this.intarray[i]);
        }
        return elem;
    }

    void sort() {
        for (int i = 0; i < this.intarray.length - 1; i++) {
            for (int j = 0; j < this.intarray.length - 1; j++) {
                if (this.intarray[j] > this.intarray[j + 1]) {
                    int tmp = this.intarray[j];
                    this.intarray[j] = this.intarray[j + 1];
                    this.intarray[j + 1] = tmp;
                }
            }
        }
    }

    void reverse() {
        for (int i = 0; i < this.intarray.length / 2; i++) {
            int tmp = this.intarray[i];
            this.intarray[i] = this.intarray[this.intarray.length -1 - i];
            this.intarray[this.intarray.length - 1 - i] = tmp;
        }
    }

    int max() {
        int max = this.intarray[0];
        for (int i = 1; i < this.intarray.length; i++) {
            if (max < this.intarray[i]) {
                max = this.intarray[i];
            }
        }
        return max;
    }

    int min() {
        int min = this.intarray[0];
        for (int i = 1; i < this.intarray.length; i++) {
            if (min > this.intarray[i]) {
                min = this.intarray[i];
            }
        }
        return min;
    }

    void add(int n) {
        int[] new_array = new int[this.intarray.length + 1];

        System.arraycopy(this.intarray, 0, new_array, 0, this.intarray.length);
        new_array[new_array.length - 1] = n;

        this.intarray = new_array;
    }

    void insert(int n, int index) {
        int[] new_array = new int[this.intarray.length + 1];

        System.arraycopy(this.intarray, 0, new_array, 0, index);
        new_array[index] = n;
        System.arraycopy(this.intarray, index, new_array, index + 1, this.intarray.length - index);

        this.intarray = new_array;
    }

    void join(IntArray numbers) {
        int[] new_array = new int[this.intarray.length + numbers.intarray.length];
        System.arraycopy(this.intarray, 0, new_array, 0, this.intarray.length);
        System.arraycopy(numbers.intarray, 0, new_array, this.intarray.length, numbers.intarray.length);

        this.intarray = new_array;
    }
}
