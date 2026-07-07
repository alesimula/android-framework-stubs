package android.sax;

public class Element {
    android.sax.Children children;
    final int depth = 0;
    android.sax.EndElementListener endElementListener;
    android.sax.EndTextElementListener endTextElementListener;
    final java.lang.String localName = null;
    final android.sax.Element parent = null;
    java.util.ArrayList<android.sax.Element> requiredChilden;
    android.sax.StartElementListener startElementListener;
    final java.lang.String uri = null;
    boolean visited;
    Element(android.sax.Element p0, java.lang.String p1, java.lang.String p2, int p3) {}
    static java.lang.String toString(java.lang.String p0, java.lang.String p1) { return null; }
    void checkRequiredChildren(org.xml.sax.Locator p0) throws org.xml.sax.SAXParseException {}
    public android.sax.Element getChild(java.lang.String p0) { return null; }
    public android.sax.Element getChild(java.lang.String p0, java.lang.String p1) { return null; }
    public android.sax.Element requireChild(java.lang.String p0) { return null; }
    public android.sax.Element requireChild(java.lang.String p0, java.lang.String p1) { return null; }
    void resetRequiredChildren() {}
    public void setElementListener(android.sax.ElementListener p0) {}
    public void setEndElementListener(android.sax.EndElementListener p0) {}
    public void setEndTextElementListener(android.sax.EndTextElementListener p0) {}
    public void setStartElementListener(android.sax.StartElementListener p0) {}
    public void setTextElementListener(android.sax.TextElementListener p0) {}
    public java.lang.String toString() { return null; }
}
