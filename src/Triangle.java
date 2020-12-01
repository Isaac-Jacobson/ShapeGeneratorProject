// Author: Isaac Jacobson
// Date: 9/4/2019
// Class: CS165
// Email: isaac13@colostate.edu

public class Triangle extends Primitive {

	private int color;
	private int x0, y0;
	private int x1, y1;
	private int x2, y2;
	private boolean isFilled;

	public Triangle(int x0, int y0, int x1, int y1, int x2, int y2) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int color, int x0, int y0, int x1, int y1, int x2, int y2, boolean isFilled) {
		super();
		this.color = color;
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.isFilled = isFilled;
	}

	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = x0;
		xPoints[1] = x1;
		xPoints[2] = x2;
		yPoints[0] = y0;
		yPoints[1] = y1;
		yPoints[2] = y2;
		ui.drawPolygon(xPoints, yPoints, isFilled);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getX0() {
		return x0;
	}

	public void setX0(int x0) {
		this.x0 = x0;
	}

	public int getY0() {
		return y0;
	}

	public void setY0(int y0) {
		this.y0 = y0;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}
