package image;

import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.List;

public class VectorImage implements Image{
    public int width;
    public int height;
    //public Color[][] pixels; Erreur de jeunesse
    public List<Shape> shapes;


    public VectorImage(List<Shape> shapes, int width, int height){
        setHeight(height);
        setWidth(width);
        this.shapes = shapes;


        /*this.pixels = new Color[width][height];
        for (int i = 0 ; i< width; i++){
            Arrays.fill(pixels[i],Color.WHITE);
        }


        for (int j = shapes.size() - 1; j >= 0; j--){
            for(int x = 0; x<width ; x++){
                for (int y =0 ; y < height ; y++){
                    if (shapes.get(j).contains(new Point(x,y))) pixels[x][y] = shapes.get(j).getColor();

                }
            }
        } Regardez ce que la débrouille peut donner , c'est immonde */

    }

    @Override
    public Color getPixelColor(int x, int y) {
        Point n = new Point(x,y);
        for (int i = 0 ; i < shapes.size(); i++){
            if(shapes.get(i).contains(n))
                return shapes.get(i).getColor();
        }
        return Color.WHITE;
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
