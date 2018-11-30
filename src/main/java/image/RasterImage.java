package image;

import javafx.scene.paint.Color;
import util.Matrices;

public abstract class RasterImage {
    public Color[][] pixels;
    public int width;
    public int height;

    public  void createRepresentation(){
        this.pixels = new Color[this.width][this.height];
    }

    public  void setPixelColor(Color color, int x, int y){
        pixels[x][y]= color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    protected  void setPixelsColor(Color[][] pixels){
        int x = Matrices.getRowCount(pixels);
        int y = Matrices.getColumnCount(pixels);

        for (int i = 0 ; i < x ; i++){
            for (int j = 0; j < y ; j++){
                setPixelColor(pixels[x][y],x,y);
            }
        }

    }

    protected void setPixelsColor(Color color){
       for (int x = 0 ; x < width ; x++){
           for(int y = 0; y < height ; y++){
               setPixelColor(color,x,y);
           }
       }

    }
    public  int getWidth(){
        return width;
    }

    public  int getHeight(){
        return height;
    }

    protected  void setWidth(int width){
        if ( width < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.width = width;
    }

    protected  void setHeight(int height) {
        if ( height < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.height = height;
    }

}
