package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class PaletteRasterImage extends RasterImage implements Image  {

    public PaletteRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);

        createRepresentation();

        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);

        setHeight(Matrices.getColumnCount(pixels)); // Méthode malhonette , nomage anbigue
        setWidth(Matrices.getRowCount(pixels)); // Méthode malhonette , nomage anbigue

        this.pixels = pixels;
    }
}
