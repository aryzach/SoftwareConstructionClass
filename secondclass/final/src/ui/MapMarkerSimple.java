package ui;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;

import java.awt.*;

public class MapMarkerSimple extends MapMarkerCircle {
    // i change to 100 from 5
    public static final double defaultMarkerSize = 5.0;
    public static final Color defaultColor = Color.red;

    public MapMarkerSimple(Layer layer, Coordinate coord) {
        super(layer, null, coord, defaultMarkerSize, STYLE.FIXED, getDefaultStyle());
//        System.out.println("new map marker made");
        setColor(Color.BLACK);
        setBackColor(defaultColor);
    }
}
