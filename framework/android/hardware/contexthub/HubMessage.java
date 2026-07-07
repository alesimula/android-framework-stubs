package android.hardware.contexthub;

@android.annotation.SystemApi
public final class HubMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubMessage> CREATOR = null;
    private static final int DEBUG_LOG_NUM_BYTES = 16;
    private final byte[] mMessageBody = null;
    private int mMessageSequenceNumber;
    private final int mMessageType = 0;
    private boolean mResponseRequired;
    private HubMessage(int p0, byte[] p1, boolean p2) {}
    private HubMessage(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getMessageBody() { return null; }
    public int getMessageSequenceNumber() { return 0; }
    public int getMessageType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isResponseRequired() { return false; }
    public void setIsResponseRequired(boolean p0) {}
    public void setMessageSequenceNumber(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private byte[] mMessageBody;
        private int mMessageType;
        private boolean mResponseRequired;
        public Builder(int p0, byte[] p1) {}
        public android.hardware.contexthub.HubMessage build() { return null; }
        public android.hardware.contexthub.HubMessage.Builder setResponseRequired(boolean p0) { return null; }
    }
}
