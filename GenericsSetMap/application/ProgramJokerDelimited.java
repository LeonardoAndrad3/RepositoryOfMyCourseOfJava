package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramJokerDelimited {

	public static void main(String[] args) {
		List<Shape> listShape = new ArrayList<>();
		listShape.add(new Rectangle(Color.BLACK,3.0,2.0));
		listShape.add(new Circle(Color.BLACK,3.0));

		List<Circle> listCircle = new ArrayList<>();

		System.out.println("Total area: " + totalArea(listShape));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		for(Shape s : list) sum+=s.area();
		return sum;
	}
}
