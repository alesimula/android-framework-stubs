package com.google.android.mms.pdu;

public class RetrieveConf extends com.google.android.mms.pdu.MultimediaMessagePdu {
    public RetrieveConf() throws com.google.android.mms.InvalidHeaderValueException { super(); }
    RetrieveConf(com.google.android.mms.pdu.PduHeaders p0) { super(); }
    RetrieveConf(com.google.android.mms.pdu.PduHeaders p0, com.google.android.mms.pdu.PduBody p1) { super(); }
    public void addCc(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public com.google.android.mms.pdu.EncodedStringValue[] getCc() { return null; }
    public byte[] getContentType() { return null; }
    public int getDeliveryReport() { return 0; }
    public com.google.android.mms.pdu.EncodedStringValue getFrom() { return null; }
    public byte[] getMessageClass() { return null; }
    public byte[] getMessageId() { return null; }
    public int getReadReport() { return 0; }
    public int getRetrieveStatus() { return 0; }
    public com.google.android.mms.pdu.EncodedStringValue getRetrieveText() { return null; }
    public byte[] getTransactionId() { return null; }
    public void setContentType(byte[] p0) {}
    public void setDeliveryReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setFrom(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setMessageClass(byte[] p0) {}
    public void setMessageId(byte[] p0) {}
    public void setReadReport(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setRetrieveStatus(int p0) throws com.google.android.mms.InvalidHeaderValueException {}
    public void setRetrieveText(com.google.android.mms.pdu.EncodedStringValue p0) {}
    public void setTransactionId(byte[] p0) {}
}
