class ComplexTester {
    public static void main(String[] args) {
        Complex complex = new Complex(1.0, 2.0);

        System.out.println("Description: " + complex.description());
        System.out.println("Real:        " + complex.getReal());
        System.out.println("Imaginary:   " + complex.getImaginary());
        System.out.println("Absolute:    " + complex.absolute());
        System.out.println("Conject Description: " + complex.conject().description());

        System.out.println();

        Complex addComplex = new Complex(2.0, 3.0);
        addComplex.add(complex);
        System.out.println("Add Description: " + addComplex.description());

        Complex subComplex = new Complex(3.0, 1.0);
        subComplex.sub(complex);
        System.out.println("Sub Description: " + subComplex.description());

        Complex mulComplex = new Complex(3.0, 2.0);
        mulComplex.mul(complex);
        System.out.println("Mul Description: " + mulComplex.description());

        Complex divComplex = new Complex(4.0, 1.0);
        divComplex.div(complex);
        System.out.println("Div Description: " + divComplex.description());
    }
}
