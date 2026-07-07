package com.android.modules.utils;

public interface TypedXmlPullParser extends org.xmlpull.v1.XmlPullParser {
    public boolean getAttributeBoolean(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public boolean getAttributeBoolean(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return false; }
    default public boolean getAttributeBoolean(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    public byte[] getAttributeBytesBase64(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public byte[] getAttributeBytesBase64(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return null; }
    default public byte[] getAttributeBytesBase64(java.lang.String p0, java.lang.String p1, byte[] p2) { return null; }
    public byte[] getAttributeBytesHex(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public byte[] getAttributeBytesHex(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return null; }
    default public byte[] getAttributeBytesHex(java.lang.String p0, java.lang.String p1, byte[] p2) { return null; }
    public double getAttributeDouble(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public double getAttributeDouble(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0.0; }
    default public double getAttributeDouble(java.lang.String p0, java.lang.String p1, double p2) { return 0.0; }
    public float getAttributeFloat(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public float getAttributeFloat(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0.0f; }
    default public float getAttributeFloat(java.lang.String p0, java.lang.String p1, float p2) { return 0.0f; }
    default public int getAttributeIndex(java.lang.String p0, java.lang.String p1) { return 0; }
    default public int getAttributeIndexOrThrow(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    public int getAttributeInt(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public int getAttributeInt(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    default public int getAttributeInt(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public int getAttributeIntHex(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public int getAttributeIntHex(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
    default public int getAttributeIntHex(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public long getAttributeLong(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public long getAttributeLong(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0L; }
    default public long getAttributeLong(java.lang.String p0, java.lang.String p1, long p2) { return 0L; }
    public long getAttributeLongHex(int p0) throws org.xmlpull.v1.XmlPullParserException;
    default public long getAttributeLongHex(java.lang.String p0, java.lang.String p1) throws org.xmlpull.v1.XmlPullParserException { return 0L; }
    default public long getAttributeLongHex(java.lang.String p0, java.lang.String p1, long p2) { return 0L; }
}
