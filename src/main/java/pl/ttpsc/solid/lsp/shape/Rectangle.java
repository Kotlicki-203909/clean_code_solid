package pl.ttpsc.solid.lsp.shape;

public class Rectangle implements Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurfaceArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * a + 2 * b;
    }
}
