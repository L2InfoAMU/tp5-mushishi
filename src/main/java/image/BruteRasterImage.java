package image;

import util.Matrices;

import java.awt.*;

public class BruteRasterImage implements Image{
    public Color[][] pixels;
    public int width;
    public int height;


    public BruteRasterImage(Color color, int width , int height){
        this.height = height;
        this.width = width;

        createRepresentation();

        setPixelsColor(color);
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
        int x = Matrices.getColumnCount(pixels);
        int y = Matrices.getRowCount(pixels);

        for (int i = 0 ; i < x ; i++){
            for (int j = 0; j < y ; j++){
                setPixelColor(pixels[x][y],x,y);
            }
        }
    }

    private void setPixelsColor(Color color){
        for (int x = 0 ; x < width ; x++){
            for(int y = 0; y < height ; y++){
                setPixelColor(color,x,y);
            }
        }
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        if ( width < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.width = width;
         createRepresentation();

    }

    protected void setHeight(int height){
        if ( height < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.height = height;
        createRepresentation();
    }
}
