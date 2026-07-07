package com.google.android.mms.pdu;

public class GenericPdu {
    com.google.android.mms.pdu.PduHeaders mPduHeaders;
    public GenericPdu() {}
    GenericPdu(com.google.android.mms.pdu.PduHeaders p0) {}
    public com.google.android.mms.pdu.EncodedStringValue getFrom() { return null; }
    public int getMessageType() { return 0; }
    public int getMmsVersion() { return 0; }
    com.google.android.mms.pdu.PduHeaders getPduHeaders() { return null; }
    public void setFrom(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setMessageType(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setMmsVersion(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
}
