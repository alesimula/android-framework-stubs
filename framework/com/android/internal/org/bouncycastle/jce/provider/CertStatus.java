package com.android.internal.org.bouncycastle.jce.provider;

class CertStatus {
    public static final int UNDETERMINED = 12;
    public static final int UNREVOKED = 11;
    int certStatus;
    java.util.Date revocationDate;
    CertStatus() {}
    public int getCertStatus() { return 0; }
    public java.util.Date getRevocationDate() { return null; }
    public void setCertStatus(int p0) {}
    public void setRevocationDate(java.util.Date p0) {}
}
