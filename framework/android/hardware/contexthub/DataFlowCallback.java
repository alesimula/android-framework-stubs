package android.hardware.contexthub;

@android.annotation.SystemApi
public interface DataFlowCallback {
    public static final int SINK_EVENT_READABLE = 0;
    public static final int SINK_EVENT_STOPPED = 1;
    public static final int SOURCE_EVENT_SINK_GONE = 1;
    public static final int SOURCE_EVENT_WRITABLE = 0;
    public void onDataFlowSinkEvent(android.hardware.contexthub.DataFlowSink p0, int p1);
    public void onDataFlowSourceEvent(android.hardware.contexthub.DataFlowSource p0, int p1, android.hardware.contexthub.DataFlowCallback.SourceEventData p2);
    public void onReceivedDataFlowSink(android.hardware.contexthub.DataFlowSink p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.HubEndpointSession p2, android.hardware.contexthub.HubMessage p3);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SinkEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceEvent {
    }

    public static class SourceEventData {
        private final android.hardware.contexthub.HubEndpointInfo mSink = null;
        public SourceEventData(android.hardware.contexthub.HubEndpointInfo p0) {}
        public android.hardware.contexthub.HubEndpointInfo getSink() { return null; }
    }
}
