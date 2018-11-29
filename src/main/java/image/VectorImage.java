package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image{
    public int width;
    public int height;
    public Color[][] pixels;


    public VectorImage(List<Shape> shapes, int width, int height){
        setHeight(height);
        setWidth(width);

        this.pixels = new Color[width][height];

        for(Shape i : shapes){
            pixels
        }

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    protected void setWidth(int width){ //certainement une erreur , pas de retour pour un setter
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }


}
