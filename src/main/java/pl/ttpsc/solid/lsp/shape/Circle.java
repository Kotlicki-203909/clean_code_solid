package pl.ttpsc.solid.lsp.shape;

public class Circle implements IShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
