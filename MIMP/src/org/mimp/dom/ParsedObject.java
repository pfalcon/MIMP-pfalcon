package org.mimp.dom;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import org.mimp.dom.gpx.WptType;
import org.mimp.newimp.GeoPoint;

public interface ParsedObject extends Serializable {

    String getName();
    String getDescr();
    Vector<GeoPoint> getPoints();
    List<WptType> getPOIs();
}
