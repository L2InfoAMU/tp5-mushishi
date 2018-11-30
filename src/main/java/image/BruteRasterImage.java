package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage implements Image{

    public BruteRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);

        createRepresentation();

        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);

        setHeight(Matrices.getColumnCount(colors));; // Méthode malhonette , nomage anbigue
        setWidth(Matrices.getRowCount(colors)); // Méthode malhonette , nomage anbigue


        pixels = colors;
    }

}
