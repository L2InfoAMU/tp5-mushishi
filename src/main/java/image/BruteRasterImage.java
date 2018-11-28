package image;

import util.Matrices;

import java.awt.*;

public class BruteRasterImage implements Image{
    public Color[][] pixels;
    public int width;
    public int height;


    public BruteRasterImage(Color color, int width , int height){
        this.width = width;
        this.height = height;
        createRepresentation();

        for (int x = 0 ; x < width ; x++){
            for(int y = 0; y < height ; y++){
                setPixelColor(color,x,y);
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);

        pixels = colors;
    }

    public void createRepresentation(){
        this.pixels = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y]= color;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        this.pixels
    }

}
