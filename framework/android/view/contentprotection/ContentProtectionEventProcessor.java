package android.view.contentprotection;

public class ContentProtectionEventProcessor {
    private static final java.util.Set<java.lang.Integer> EVENT_TYPES_TO_STORE = null;
    private static final java.time.Duration MIN_DURATION_BETWEEN_FLUSHING = null;
    private static final int RESET_LOGIN_TOTAL_EVENTS_TO_PROCESS = 150;
    private static final java.lang.String TAG = "ContentProtectionEventProcessor";
    private boolean mAnyGroupFound;
    private final android.view.contentcapture.IContentCaptureManager mContentCaptureManager = null;
    private final com.android.internal.util.RingBuffer<android.view.contentcapture.ContentCaptureEvent> mEventBuffer = null;
    private final java.util.List<android.view.contentprotection.ContentProtectionEventProcessor.SearchGroup> mGroupsAll = null;
    private final java.util.List<android.view.contentprotection.ContentProtectionEventProcessor.SearchGroup> mGroupsOptional = null;
    private final java.util.List<android.view.contentprotection.ContentProtectionEventProcessor.SearchGroup> mGroupsRequired = null;
    private final android.os.Handler mHandler = null;
    public java.time.Instant mLastFlushTime;
    private final android.content.ContentCaptureOptions.ContentProtectionOptions mOptions = null;
    private final java.lang.String mPackageName = null;
    private int mResetLoginRemainingEventsToProcess;
    public ContentProtectionEventProcessor(com.android.internal.util.RingBuffer<android.view.contentcapture.ContentCaptureEvent> p0, android.os.Handler p1, android.view.contentcapture.IContentCaptureManager p2, java.lang.String p3, android.content.ContentCaptureOptions.ContentProtectionOptions p4) {}
    private android.content.pm.ParceledListSlice<android.view.contentcapture.ContentCaptureEvent> clearEvents() { return null; }
    private void flush() {}
    private void handlerOnLoginDetected(android.content.pm.ParceledListSlice<android.view.contentcapture.ContentCaptureEvent> p0) {}
    private void loginDetected() {}
    private void maybeResetLoginFlags() {}
    private void processViewAppearedEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    private void resetLoginFlags() {}
    private void storeEvent(android.view.contentcapture.ContentCaptureEvent p0) {}
    public void processEvent(android.view.contentcapture.ContentCaptureEvent p0) {}

    private static final class SearchGroup {
        public boolean mFound;
        private final java.util.List<java.lang.String> mSearchStrings = null;
        SearchGroup(java.util.List<java.lang.String> p0) {}
        public boolean matches(java.lang.String p0) { return false; }
    }
}
