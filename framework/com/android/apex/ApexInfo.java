package com.android.apex;

public class ApexInfo {
    private java.lang.Boolean isActive;
    private java.lang.Boolean isFactory;
    private java.lang.Long lastUpdateMillis;
    private java.lang.String moduleName;
    private java.lang.String modulePath;
    private java.lang.String partition;
    private java.lang.String preinstalledModulePath;
    private java.lang.Boolean provideSharedApexLibs;
    private java.lang.Long versionCode;
    private java.lang.String versionName;
    public ApexInfo() {}
    static com.android.apex.ApexInfo read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public boolean getIsActive() { return false; }
    public boolean getIsFactory() { return false; }
    public long getLastUpdateMillis() { return 0L; }
    public java.lang.String getModuleName() { return null; }
    public java.lang.String getModulePath() { return null; }
    public java.lang.String getPartition() { return null; }
    public java.lang.String getPreinstalledModulePath() { return null; }
    public boolean getProvideSharedApexLibs() { return false; }
    public long getVersionCode() { return 0L; }
    public java.lang.String getVersionName() { return null; }
    boolean hasIsActive() { return false; }
    boolean hasIsFactory() { return false; }
    boolean hasLastUpdateMillis() { return false; }
    boolean hasModuleName() { return false; }
    boolean hasModulePath() { return false; }
    boolean hasPartition() { return false; }
    boolean hasPreinstalledModulePath() { return false; }
    boolean hasProvideSharedApexLibs() { return false; }
    boolean hasVersionCode() { return false; }
    boolean hasVersionName() { return false; }
    public void setIsActive(boolean p0) {}
    public void setIsFactory(boolean p0) {}
    public void setLastUpdateMillis(long p0) {}
    public void setModuleName(java.lang.String p0) {}
    public void setModulePath(java.lang.String p0) {}
    public void setPartition(java.lang.String p0) {}
    public void setPreinstalledModulePath(java.lang.String p0) {}
    public void setProvideSharedApexLibs(boolean p0) {}
    public void setVersionCode(long p0) {}
    public void setVersionName(java.lang.String p0) {}
    void write(com.android.apex.XmlWriter p0, java.lang.String p1) throws java.io.IOException {}
}
