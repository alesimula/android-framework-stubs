package android.util;

public interface AttributeSet {
    public boolean getAttributeBooleanValue(int p0, boolean p1);
    public boolean getAttributeBooleanValue(java.lang.String p0, java.lang.String p1, boolean p2);
    public int getAttributeCount();
    public float getAttributeFloatValue(int p0, float p1);
    public float getAttributeFloatValue(java.lang.String p0, java.lang.String p1, float p2);
    public int getAttributeIntValue(int p0, int p1);
    public int getAttributeIntValue(java.lang.String p0, java.lang.String p1, int p2);
    public int getAttributeListValue(int p0, java.lang.String[] p1, int p2);
    public int getAttributeListValue(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3);
    public java.lang.String getAttributeName(int p0);
    public int getAttributeNameResource(int p0);
    default public java.lang.String getAttributeNamespace(int p0) { return null; }
    public int getAttributeResourceValue(int p0, int p1);
    public int getAttributeResourceValue(java.lang.String p0, java.lang.String p1, int p2);
    public int getAttributeUnsignedIntValue(int p0, int p1);
    public int getAttributeUnsignedIntValue(java.lang.String p0, java.lang.String p1, int p2);
    public java.lang.String getAttributeValue(int p0);
    public java.lang.String getAttributeValue(java.lang.String p0, java.lang.String p1);
    public java.lang.String getClassAttribute();
    public java.lang.String getIdAttribute();
    public int getIdAttributeResourceValue(int p0);
    public java.lang.String getPositionDescription();
    public int getStyleAttribute();
}
