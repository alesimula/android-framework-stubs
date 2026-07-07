package android.os;

public final class Message implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.Message> CREATOR = null;
    static final int FLAGS_TO_CLEAR_ON_COPY_FROM = 5;
    static final int FLAG_ASYNCHRONOUS = 2;
    static final int FLAG_IN_USE = 1;
    static final int FLAG_REMOVED = 4;
    private static final int MAX_POOL_SIZE = 50;
    private static final android.os.Handler NULL_HANDLER = null;
    private static final java.lang.Object NULL_OBJECT = null;
    private static final java.lang.Runnable NULL_RUNNABLE = null;
    public static final int UID_NONE = -1;
    static final java.lang.invoke.VarHandle sFlags = null;
    static final android.os.Message.MatchAllFutureMessages sMatchAllFutureMessages = null;
    static final android.os.Message.MatchAllMessages sMatchAllMessages = null;
    static final android.os.Message.MatchDeliverableMessages sMatchDeliverableMessages = null;
    static final android.os.Message.MatchHandler sMatchHandler = null;
    static final android.os.Message.MatchHandlerAndObject sMatchHandlerAndObject = null;
    static final android.os.Message.MatchHandlerAndObjectEquals sMatchHandlerAndObjectEquals = null;
    static final android.os.Message.MatchHandlerRunnableAndObject sMatchHandlerRunnableAndObject = null;
    static final android.os.Message.MatchHandlerRunnableAndObjectEquals sMatchHandlerRunnableAndObjectEquals = null;
    public static final android.os.Message.MatchHandlerWhatAndObject sMatchHandlerWhatAndObject = null;
    static final android.os.Message.MatchHandlerWhatAndObjectEquals sMatchHandlerWhatAndObjectEquals = null;
    private static android.os.Message sPool;
    private static int sPoolSize;
    public static final java.lang.Object sPoolSync = null;
    public int arg1;
    public int arg2;
    java.lang.Runnable callback;
    android.os.Bundle data;
    public long enqueueTime;
    volatile long eventId;
    volatile int flags;
    public int heapIndex;
    public long insertSeq;
    android.os.Message next;
    android.os.Message nextFree;
    public java.lang.Object obj;
    android.os.Message prev;
    public android.os.Messenger replyTo;
    java.lang.String sendingThreadName;
    public int sendingUid;
    android.os.Handler target;
    public int what;
    public long when;
    public int workSourceUid;
    public Message() {}
    static int compareMessages(android.os.Message p0, android.os.Message p1) { return 0; }
    public static android.os.Message obtain() { return null; }
    public static android.os.Message obtain(android.os.Handler p0) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, int p2, int p3) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, int p2, int p3, java.lang.Object p4) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, java.lang.Object p2) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, java.lang.Runnable p1) { return null; }
    public static android.os.Message obtain(android.os.Message p0) { return null; }
    private void onClear() {}
    private void readFromParcel(android.os.Parcel p0) {}
    void clear() {}
    void clearReferenceFields() {}
    public void copyFrom(android.os.Message p0) {}
    public int describeContents() { return 0; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.Runnable getCallback() { return null; }
    public android.os.Bundle getData() { return null; }
    public android.os.Handler getTarget() { return null; }
    public long getWhen() { return 0L; }
    public boolean isAsynchronous() { return false; }
    boolean isInUse() { return false; }
    boolean isRemoved() { return false; }
    void markInUse() {}
    public boolean markRemoved() { return false; }
    public android.os.Bundle peekData() { return null; }
    public void recycle() {}
    void recycleUnchecked() {}
    public void sendToTarget() {}
    public void setAsynchronous(boolean p0) {}
    public android.os.Message setCallback(java.lang.Runnable p0) { return null; }
    public void setData(android.os.Bundle p0) {}
    public void setTarget(android.os.Handler p0) {}
    public android.os.Message setWhat(int p0) { return null; }
    public java.lang.String toString() { return null; }
    java.lang.String toString(long p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static final class MatchAllFutureMessages extends android.os.Message.MessageCompare {
        MatchAllFutureMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    public static final class MatchAllMessages extends android.os.Message.MessageCompare {
        public MatchAllMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchBarrierToken extends android.os.Message.MessageCompare {
        final int mBarrierToken = 0;
        MatchBarrierToken(int p0) { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchDeliverableMessages extends android.os.Message.MessageCompare {
        MatchDeliverableMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandler extends android.os.Message.MessageCompare {
        MatchHandler() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerAndObject extends android.os.Message.MessageCompare {
        MatchHandlerAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerAndObjectEquals extends android.os.Message.MessageCompare {
        MatchHandlerAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerRunnableAndObject extends android.os.Message.MessageCompare {
        MatchHandlerRunnableAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerRunnableAndObjectEquals extends android.os.Message.MessageCompare {
        MatchHandlerRunnableAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    public static final class MatchHandlerWhatAndObject extends android.os.Message.MessageCompare {
        public MatchHandlerWhatAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerWhatAndObjectEquals extends android.os.Message.MessageCompare {
        MatchHandlerWhatAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static abstract class MessageCompare {
        MessageCompare() {}
        public abstract boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5);
    }
}
