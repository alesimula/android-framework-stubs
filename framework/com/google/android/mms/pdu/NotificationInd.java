package com.google.android.mms.pdu;

public class NotificationInd extends com.google.android.mms.pdu.GenericPdu {
    public NotificationInd() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    NotificationInd(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public int getContentClass() { return 0; }
    public byte[] getContentLocation() { return null; }
    public int getDeliveryReport() { return 0; }
    public long getExpiry() { return 0L; }
    public com.google.android.mms.pdu.EncodedStringValue getFrom() { return null; }
    public byte[] getMessageClass() { return null; }
    public long getMessageSize() { return 0L; }
    public com.google.android.mms.pdu.EncodedStringValue getSubject() { return null; }
    public byte[] getTransactionId() { return null; }
    public void setContentClass(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setContentLocation(byte[] p0) {}
    public void setDeliveryReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setExpiry(long p0) {}
    public void setFrom(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setMessageClass(byte[] p0) {}
    public void setMessageSize(long p0) {}
    public void setSubject(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setTransactionId(byte[] p0) {}
}
