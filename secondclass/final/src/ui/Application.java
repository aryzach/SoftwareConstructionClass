package ui;

import model.Query;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.interfaces.ICoordinate;
import org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Timer;
import java.util.*;

public class Application extends JFrame {

    private BingAerialTileSource bing;

    private final ContentPanel contentPanel;

    private List<Query> queries;



    public static void main(String[] args) {



        new Application().setVisible(true);
    }

    public Application(){

        super("Twitter content viewer");
        setSize(300, 300);

        queries = new ArrayList<>();

        Query q1 = new Query("hi");
        Query q2 = new Query("the");
        queries.add(q1);
        queries.add(q2);

        bing = new BingAerialTileSource();

        contentPanel = new ContentPanel(this);
        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        map().setMapMarkerVisible(true);
        map().setZoomContolsVisible(true);
        map().setScrollWrapEnabled(true);

        map().setTileSource(bing);

        Coordinate coord = new Coordinate(0, 0);

        java.util.Timer bingTimer = new Timer();
        TimerTask bingAttributionCheck = new TimerTask() {
            @Override
            public void run() {
                // This is the best method we've found to determine when the Bing data has been loaded.
                // We use this to trigger zooming the map so that the entire world is visible.
                if (!bing.getAttributionText(0, coord, coord).equals("Error loading Bing attribution data")) {
                    map().setZoom(2);
                    bingTimer.cancel();
                }
            }
        };
        bingTimer.schedule(bingAttributionCheck, 100, 200);

        map().addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point p = e.getPoint();
                ICoordinate pos = map().getPosition(p);
                // TODO: Use the following method to set the text that appears at the mouse cursor
                map().setToolTipText("This is a tooltip");
            }
        });
    }

    public JMapViewer map() {
        return contentPanel.getViewer();
    }


    private Set<String> getQueryTerms() {
        Set<String> ans = new HashSet<>();
        for (Query q : queries) {
            ans.add(q.getQueryString());
        }
        return ans;
    }

    public void updateVisibility() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Recomputing visible queries");
                for (Query q : queries) {
//                    JCheckBox box = q.getCheckBox();
//                    Boolean state = box.isSelected();
                    q.setVisible(true);
                }
                map().repaint();
            }
        });
    }
}
