package pl.ttpsc.solid.lsp.shape;

public class Square implements IShape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSurfaceArea() {
        return a * a;
    }

    @Override
    public double getCircumference() {
        return 4 * a;
    }
}
