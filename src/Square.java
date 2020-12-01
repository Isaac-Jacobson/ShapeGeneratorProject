// Author: Isaac Jacobson
// Date: 9/4/2019
// Class: CS165
// Email: isaac13@colostate.edu
public class Square extends Primitive {
	private int color;
	private int x, y;
	private int size;
	private boolean isFilled;

	public Square(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Square(int color, int x, int y, int size, boolean isFilled) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.size = size;
		this.isFilled = isFilled;
	}

	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawRectangle(x, y, size, size, isFilled);
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}
