// Author: Isaac Jacobson
// Date: 9/4/2019
// Class: CS165
// Email: isaac13@colostate.edu
public class Circle extends Primitive {

	private int color;
	private int x, y;
	private int radius;
	private boolean isFilled;

	public Circle(int x, int y, int radius) {

		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int color, int x, int y, int radius, boolean isFilled) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
	}

	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawOval(x, y, radius, radius, isFilled);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}
