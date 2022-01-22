package patterns.factory;

import java.util.Optional;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String TRIANGLE = "TRIANGLE";
    public static final String SQUARE = "SQUARE";

    public Optional<Shape> getShape (ShapeType shapeType) {
        if(shapeType == null) {
            return Optional.empty(); //grazinam tuscia Optional konteineri
        }

        if (CIRCLE.equalsIgnoreCase(shapeType.toString())) {
            //pvz kreipiuosi i duombaze, istraukiu apskritimo duomenis
            //konstruoju apskritima su DB duomenimis
            //nusiunciu duomenis i kazkoki external servisa
            //gaunu atsakyma
            //papildau duomenis ir grazinu Circle objekta
            Circle circle = new Circle();
            return Optional.of(new Circle());
        }else if (TRIANGLE.equalsIgnoreCase(shapeType.toString())) {
            return Optional.of(new Triangle()); //grazinu konteineri su trikampio objektu viduje
        }else if (SQUARE.equalsIgnoreCase(shapeType.toString())) {
            return Optional.of(new Square());
        }

        return Optional.empty();
    }

}
