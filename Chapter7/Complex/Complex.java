import java.math.BigDecimal;

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

    private String dbl2str(double d, boolean isInPlus) {
        if (d > 0) {
            if (isInPlus) {
                return "+ " + BigDecimal.valueOf(d).toPlainString();
            } else {
                return BigDecimal.valueOf(d).toPlainString();
            }
        } else if (d < 0) {
            return "- " + BigDecimal.valueOf(Math.abs(d)).toPlainString();
        } else {
            return "0";
        }
    }

    String description() {
        if (this.real == 0) {
            if (this.imaginary == 0) {
                return "0";
            } else {
                return dbl2str(this.imaginary, false) + "i";
            }
        } else {
            if (this.imaginary == 0) {
                return dbl2str(this.real, false);
            } else {
                return dbl2str(this.real, false) + " " + dbl2str(this.imaginary, true) + "i";
            }
        }
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
        double cAbsSquare = Math.pow(c.real, 2) + Math.pow(c.imaginary, 2);
        this.real /= cAbsSquare;
        this.imaginary /= cAbsSquare;
    }

    Complex conject() {
        return new Complex(this.real, -this.imaginary);
    }

    double absolute() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }


}
