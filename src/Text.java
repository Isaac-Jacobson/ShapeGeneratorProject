// Author: Isaac Jacobson
// Date: 9/4/2019
// Class: CS165
// Email: isaac13@colostate.edu
public class Text extends Primitive {

	private int color;
	private int x, y;
	private String text;
	private String fontName;
	private int fontSize;

	public Text(int x, int y, java.lang.String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}

	public Text() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Text(int color, int x, int y, String text, String fontName, int fontSize) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.text = text;
		this.fontName = fontName;
		this.fontSize = fontSize;
	}

	public void draw(UserInterface ui) {
		ui.textColor(color);
		ui.setFont(fontName, fontSize);
		ui.drawText(x, y, text);
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public void setFont(String string, int parseInt) {
		this.setFontName(string);
		this.setFontSize(parseInt);
	}

}
