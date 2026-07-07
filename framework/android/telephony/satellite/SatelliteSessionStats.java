package android.telephony.satellite;

public final class SatelliteSessionStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSessionStats> CREATOR = null;
    private java.util.Map<java.lang.Integer, android.telephony.satellite.SatelliteSessionStats> datagramStats;
    private int mCountOfSuccessfulUserMessages;
    private int mCountOfTimedOutUserMessagesWaitingForAck;
    private int mCountOfTimedOutUserMessagesWaitingForConnection;
    private int mCountOfUnsuccessfulUserMessages;
    private int mCountOfUserMessagesInQueueToBeSent;
    private long mLastMessageLatency;
    private long mLatencyOfSuccessfulUserMessages;
    private long mMaxLatency;
    public SatelliteSessionStats() {}
    private SatelliteSessionStats(android.os.Parcel p0) {}
    public SatelliteSessionStats(android.telephony.satellite.SatelliteSessionStats.Builder p0) {}
    private void getPrintableCounters(java.lang.StringBuilder p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public void addCountOfUnsuccessfulUserMessages(int p0, int p1) {}
    public void clear() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCountOfSuccessfulOutgoingDatagram(int p0) { return 0; }
    public int getCountOfSuccessfulUserMessages() { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForAck() { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForAck(int p0) { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForConnection() { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForConnection(int p0) { return 0; }
    public int getCountOfUnsuccessfulUserMessages() { return 0; }
    public int getCountOfUnsuccessfulUserMessages(int p0) { return 0; }
    public int getCountOfUserMessagesInQueueToBeSent() { return 0; }
    public int getCountOfUserMessagesInQueueToBeSent(int p0) { return 0; }
    public long getLastMessageLatency() { return 0L; }
    public long getLatencyOfAllSuccessfulUserMessages() { return 0L; }
    public java.lang.Long getLatencyOfAllSuccessfulUserMessages(int p0) { return null; }
    public long getMaxLatency() { return 0L; }
    public java.util.Map<java.lang.Integer, android.telephony.satellite.SatelliteSessionStats> getSatelliteSessionStats() { return null; }
    public int hashCode() { return 0; }
    public void incrementSuccessfulUserMessageCount() {}
    public void incrementTimedOutUserMessagesWaitingForAck() {}
    public void incrementTimedOutUserMessagesWaitingForConnection() {}
    public void incrementUnsuccessfulUserMessageCount() {}
    public void incrementUserMessagesInQueueToBeSent() {}
    public void recordSuccessfulOutgoingDatagramStats(int p0, long p1) {}
    public void resetCountOfUserMessagesInQueueToBeSent() {}
    public void setSatelliteSessionStats(java.util.Map<java.lang.Integer, android.telephony.satellite.SatelliteSessionStats> p0) {}
    public java.lang.String toString() { return null; }
    public void updateCountOfUserMessagesInQueueToBeSent(int p0) {}
    public void updateLatencyOfAllSuccessfulUserMessages(long p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mCountOfSuccessfulUserMessages;
        private int mCountOfTimedOutUserMessagesWaitingForAck;
        private int mCountOfTimedOutUserMessagesWaitingForConnection;
        private int mCountOfUnsuccessfulUserMessages;
        private int mCountOfUserMessagesInQueueToBeSent;
        private long mLastMessageLatency;
        private long mLatencyOfSuccessfulUserMessages;
        private long mMaxLatency;
        public Builder() {}
        public android.telephony.satellite.SatelliteSessionStats build() { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfSuccessfulUserMessages(int p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfTimedOutUserMessagesWaitingForAck(int p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfTimedOutUserMessagesWaitingForConnection(int p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfUnsuccessfulUserMessages(int p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfUserMessagesInQueueToBeSent(int p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setLastLatency(long p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setLatencyOfSuccessfulUserMessages(long p0) { return null; }
        public android.telephony.satellite.SatelliteSessionStats.Builder setMaxLatency(long p0) { return null; }
    }
}
