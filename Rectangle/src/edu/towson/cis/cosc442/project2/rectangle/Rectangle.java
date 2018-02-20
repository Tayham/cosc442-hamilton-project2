package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		return Math.abs(xDiff() * yDiff());
	}
	
	private Double xDiff() {
		return (p2.x - p1.x);
	}
	
	private Double yDiff() {
		return (p2.y - p1.y);
	}
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow(xDiff(), 2) + Math.pow(yDiff(), 2));
	}
}
