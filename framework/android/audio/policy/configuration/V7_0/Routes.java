package android.audio.policy.configuration.V7_0;

public class Routes {
    private java.util.List<android.audio.policy.configuration.V7_0.Routes.Route> route;
    public Routes() {}
    static android.audio.policy.configuration.V7_0.Routes read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public java.util.List<android.audio.policy.configuration.V7_0.Routes.Route> getRoute() { return null; }

    public static class Route {
        private java.lang.String sink;
        private java.lang.String sources;
        private android.audio.policy.configuration.V7_0.MixType type;
        public Route() {}
        static android.audio.policy.configuration.V7_0.Routes.Route read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
        public java.lang.String getSink() { return null; }
        public java.lang.String getSources() { return null; }
        public android.audio.policy.configuration.V7_0.MixType getType() { return null; }
        boolean hasSink() { return false; }
        boolean hasSources() { return false; }
        boolean hasType() { return false; }
        public void setSink(java.lang.String p0) {}
        public void setSources(java.lang.String p0) {}
        public void setType(android.audio.policy.configuration.V7_0.MixType p0) {}
    }
}
