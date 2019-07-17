class Complex {
    private double real;
    private double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    double getReal() {
        return this.real;
    }

    double getImaginary() {
        return this.imaginary;
    }

     private String formatNum(double n, boolean isInPlus) {
        if (n > 0) {
            if (isInPlus)  return String.format("+ %.1f", n);
           return String.format("%.1f", n);
        }  else if (n < 0) {
            return String.format("- %.1f", Math.abs(n));
        }  else {
            return "";
        }
    }

    String description() {
        return String.format("%s %si",
                formatNum(this.real, false),
                formatNum(this.imaginary, this.real != 0 ? true : false));
    }

    void add(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    void sub(Complex c) {
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }

    void mul(Complex c) {
        double real, imaginary;
        real = this.real * c.real - this.imaginary * c.imaginary;
        imaginary = this.real * c.imaginary + this.imaginary * c.real;
        this.real = real;
        this.imaginary = imaginary;
    }

    void div(Complex c) {
        if (c.real == 0 && c.imaginary == 0)  return;
        this.mul(c.conject());
        double c_aps = Math.pow(c.real, 2) + Math.pow(c.imaginary, 2);
        this.real /= c_aps;
        this.imaginary /= c_aps;
    }

    Complex conject() {
        return new Complex(this.real, -this.imaginary);
    }

    double absolute() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }


}
