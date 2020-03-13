package model;

import org.openstreetmap.gui.jmapviewer.Layer;

import java.awt.*;

public class Query {

    private Color color;

    private final String queryString;

    private Layer layer;

    public Query(String s){
        this.color = Color.black;
        this.queryString = s;

    }

    public void setVisible(boolean visible) {
        layer.setVisible(visible);
    }

    public String getQueryString() {
        return queryString;
    }

    public Color getColor(){
        return color;
    }
}
