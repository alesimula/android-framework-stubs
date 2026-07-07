package android.telephony;

@android.annotation.SystemApi
public class CbGeoUtils {
    private static final java.lang.String CIRCLE_SYMBOL = "circle";
    public static final int EARTH_RADIUS_METER = 6371000;
    public static final double EPS = 1e-07;
    public static final int GEOMETRY_TYPE_CIRCLE = 3;
    public static final int GEOMETRY_TYPE_POLYGON = 2;
    public static final int GEO_FENCING_MAXIMUM_WAIT_TIME = 1;
    private static final java.lang.String POLYGON_SYMBOL = "polygon";
    private static final java.lang.String TAG = "CbGeoUtils";
    private CbGeoUtils() {}
    public static java.lang.String encodeGeometriesToString(java.util.List<android.telephony.CbGeoUtils.Geometry> p0) { return null; }
    private static java.lang.String encodeGeometryToString(android.telephony.CbGeoUtils.Geometry p0) { return null; }
    public static java.util.List<android.telephony.CbGeoUtils.Geometry> parseGeometriesFromString(java.lang.String p0) { return null; }
    public static android.telephony.CbGeoUtils.LatLng parseLatLngFromString(java.lang.String p0) { return null; }
    public static int sign(double p0) { return 0; }

    public static class Circle implements android.telephony.CbGeoUtils.Geometry {
        private final android.telephony.CbGeoUtils.LatLng mCenter = null;
        private final double mRadiusMeter = 0.0;
        public Circle(android.telephony.CbGeoUtils.LatLng p0, double p1) {}
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.telephony.CbGeoUtils.LatLng getCenter() { return null; }
        public double getRadius() { return 0.0; }
        public java.lang.String toString() { return null; }
    }

    public static interface Geometry {
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0);
    }

    public static class LatLng {
        public final double lat = 0.0;
        public final double lng = 0.0;
        public LatLng(double p0, double p1) {}
        public double distance(android.telephony.CbGeoUtils.LatLng p0) { return 0.0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.telephony.CbGeoUtils.LatLng subtract(android.telephony.CbGeoUtils.LatLng p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class Polygon implements android.telephony.CbGeoUtils.Geometry {
        private static final double SCALE = 1000.0;
        private final android.telephony.CbGeoUtils.LatLng mOrigin = null;
        private final java.util.List<android.telephony.CbGeoUtils.Polygon.Point> mScaledVertices = null;
        private final java.util.List<android.telephony.CbGeoUtils.LatLng> mVertices = null;
        public Polygon(java.util.List<android.telephony.CbGeoUtils.LatLng> p0) {}
        private android.telephony.CbGeoUtils.Polygon.Point convertAndScaleLatLng(android.telephony.CbGeoUtils.LatLng p0) { return null; }
        private static double crossProduct(android.telephony.CbGeoUtils.Polygon.Point p0, android.telephony.CbGeoUtils.Polygon.Point p1) { return 0.0; }
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.List<android.telephony.CbGeoUtils.LatLng> getVertices() { return null; }
        public java.lang.String toString() { return null; }

        static final class Point {
            public final double x = 0.0;
            public final double y = 0.0;
            Point(double p0, double p1) {}
            public android.telephony.CbGeoUtils.Polygon.Point subtract(android.telephony.CbGeoUtils.Polygon.Point p0) { return null; }
        }
    }
}
