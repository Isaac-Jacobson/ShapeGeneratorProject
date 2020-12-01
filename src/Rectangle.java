// Author: Isaac Jacobson
// Date: 9/4/2019
// Class: CS165
// Email: isaac13@colostate.edu
public class Rectangle extends Primitive {
	private int color;
	private int x, y;
	private int width, height;
	private boolean isFilled;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int color, int x, int y, int width, int height, boolean isFilled) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isFilled = isFilled;
	}

	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawRectangle(x, y, width, height, isFilled);
		
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}
