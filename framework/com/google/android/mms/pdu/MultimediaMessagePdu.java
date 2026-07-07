package com.google.android.mms.pdu;

public class MultimediaMessagePdu extends com.google.android.mms.pdu.GenericPdu {
    private com.google.android.mms.pdu.PduBody mMessageBody;
    public MultimediaMessagePdu() { super(); }
    MultimediaMessagePdu(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    public MultimediaMessagePdu(com.google.android.mms.pdu.PduHeaders p0, com.google.android.mms.pdu.PduBody p1) { super(); }
    public void addTo(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public com.google.android.mms.pdu.PduBody getBody() { return null; }
    public long getDate() { return 0L; }
    public int getPriority() { return 0; }
    public com.google.android.mms.pdu.EncodedStringValue getSubject() { return null; }
    public com.google.android.mms.pdu.EncodedStringValue[] getTo() { return null; }
    public void setBody(com.google.android.mms.pdu.PduBody p0) {}
    public void setDate(long p0) {}
    public void setPriority(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setSubject(com.google.android.mms.pdu.EncodedStringValue p0) {}
}
