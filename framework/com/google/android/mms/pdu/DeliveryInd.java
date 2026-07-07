package com.google.android.mms.pdu;

public class DeliveryInd extends com.google.android.mms.pdu.GenericPdu {
    public DeliveryInd() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    DeliveryInd(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public long getDate() { return 0L; }
    public byte[] getMessageId() { return null; }
    public int getStatus() { return 0; }
    public com.google.android.mms.pdu.EncodedStringValue[] getTo() { return null; }
    public void setDate(long p0) {}
    public void setMessageId(byte[] p0) {}
    public void setStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setTo(com.google.android.mms.pdu.EncodedStringValue[] p0) {}
}
