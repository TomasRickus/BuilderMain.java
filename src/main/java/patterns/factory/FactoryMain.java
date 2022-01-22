package patterns.factory;

import java.util.Optional;

/**
        * Factory pattern
        *
        * Vienas labiausiai naudojamas patternu OO (obkektiskai orientuotas) programavime. Jis priklauso Creational DP tipui.
        * Patterno tikslas suteikti vartotojui galimybe lengvai kuti/gauti reikiamus objektus.
        *
        * Factory patterno tikslas kurti objektus neatskleidziant/neparodant objekto kurimo logikos
        */

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Optional<Shape> circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.ifPresent(Shape::draw); //method reference metodo nuorodda

        Optional<Shape> triangle = shapeFactory.getShape(ShapeType.TRIANGLE);
        triangle.ifPresent(shape -> shape.draw()); // lamda israiska

        Optional<Shape> nonExistingShape = shapeFactory.getShape(null);
        nonExistingShape.ifPresent(Shape::draw);

    }
}
