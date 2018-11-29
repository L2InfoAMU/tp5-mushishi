package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.HashMap;


public class SparseRasterImage extends RasterImage implements Image{
    public HashMap<Point, Color> picture;



    public SparseRasterImage(Color color, int width , int height){
        this.height = height;
        this.width = width;

        this.createRepresentation();

        this.setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels) {
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);

        this.height = Matrices.getColumnCount(pixels); // Méthode malhonette , nomage anbigue
        this.width = Matrices.getRowCount(pixels); // Méthode malhonette , nomage anbigue

        this.createRepresentation();

        this.setPixelsColor(pixels);
    }

    @Override
    public void createRepresentation() {
        picture = new HashMap<Point,Color>(width * height);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        picture.put(new Point(x,y),color);
    }

    @Override
    protected void setPixelsColor(Color color) {
        for (int x = 0 ; x < width ; x++){
            for(int y = 0; y < height ; y++){
                this.setPixelColor(color,x,y);
            }
        }
    }

    @Override
    protected void setPixelsColor(Color[][] pixels) {
        int x = Matrices.getRowCount(pixels);
        int y = Matrices.getColumnCount(pixels);

        for (int i = 0 ; i < x ; i++){
            for (int j = 0; j < y ; j++){
                this.setPixelColor(pixels[i][j],i,j);
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return picture.get(new Point(x,y));
    }







    /*public  int getWidth(){
        return width;
    }

    public  int getHeight(){
        return height;
    }

    protected  void setWidth(int width){
        if ( width < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.width = width;
        createRepresentation();
    }

    protected  void setHeight(int height) {
        if ( height < 0 ) throw new ArrayIndexOutOfBoundsException();

        this.height = height;
        createRepresentation();
    }*/

    //Duplication de code , a moins que je n'ai pas compris.




}
