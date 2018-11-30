package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage implements Image{

    public BruteRasterImage(Color color, int width, int height){
        this.height = height;
        this.width = width;

        createRepresentation();

        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);

        this.height = Matrices.getColumnCount(pixels); // Méthode malhonette , nomage anbigue
        this.width = Matrices.getRowCount(pixels); // Méthode malhonette , nomage anbigue

        pixels = colors;
    }

}
