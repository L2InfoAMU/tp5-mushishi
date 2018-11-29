package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape{
    public int height, width;
    public Color color;
    public Point origin;


    public Rectangle(int x, int y, int width, int height, Color color){
        origin = new Point(x,y);
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return (Math.abs(point.x-origin.x-width/2) < width/2) &&  (Math.abs(point.y-origin.y-height/2) < height/2);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
