package android.hardware.power;

public class ChannelMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.ChannelMessage> CREATOR = null;
    public android.hardware.power.ChannelMessage.ChannelMessageContents data;
    public int sessionID;
    public long timeStampNanos;
    public ChannelMessage() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class ChannelMessageContents implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.power.ChannelMessage.ChannelMessageContents> CREATOR = null;
        public static final int hint = 2;
        public static final int mode = 3;
        public static final int reserved = 0;
        public static final int targetDuration = 1;
        public static final int workDuration = 4;
        private int _tag;
        private java.lang.Object _value;
        public ChannelMessageContents() {}
        private ChannelMessageContents(int p0, java.lang.Object p1) {}
        private ChannelMessageContents(android.os.Parcel p0) {}
        private void _assertTag(int p0) {}
        private void _set(int p0, java.lang.Object p1) {}
        private java.lang.String _tagString(int p0) { return null; }
        private int describeContents(java.lang.Object p0) { return 0; }
        public static android.hardware.power.ChannelMessage.ChannelMessageContents hint(int p0) { return null; }
        public static android.hardware.power.ChannelMessage.ChannelMessageContents mode(android.hardware.power.ChannelMessage.ChannelMessageContents.SessionModeSetter p0) { return null; }
        public static android.hardware.power.ChannelMessage.ChannelMessageContents reserved(long[] p0) { return null; }
        public static android.hardware.power.ChannelMessage.ChannelMessageContents targetDuration(long p0) { return null; }
        public static android.hardware.power.ChannelMessage.ChannelMessageContents workDuration(android.hardware.power.WorkDurationFixedV1 p0) { return null; }
        public int describeContents() { return 0; }
        public int getHint() { return 0; }
        public android.hardware.power.ChannelMessage.ChannelMessageContents.SessionModeSetter getMode() { return null; }
        public long[] getReserved() { return null; }
        public final int getStability() { return 0; }
        public int getTag() { return 0; }
        public long getTargetDuration() { return 0L; }
        public android.hardware.power.WorkDurationFixedV1 getWorkDuration() { return null; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void setHint(int p0) {}
        public void setMode(android.hardware.power.ChannelMessage.ChannelMessageContents.SessionModeSetter p0) {}
        public void setReserved(long[] p0) {}
        public void setTargetDuration(long p0) {}
        public void setWorkDuration(android.hardware.power.WorkDurationFixedV1 p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class SessionModeSetter implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.hardware.power.ChannelMessage.ChannelMessageContents.SessionModeSetter> CREATOR = null;
            public boolean enabled;
            public int modeInt;
            public SessionModeSetter() {}
            public int describeContents() { return 0; }
            public final int getStability() { return 0; }
            public final void readFromParcel(android.os.Parcel p0) {}
            public final void writeToParcel(android.os.Parcel p0, int p1) {}
        }

        public static @interface Tag {
            public static final byte hint = 2;
            public static final byte mode = 3;
            public static final byte reserved = 0;
            public static final byte targetDuration = 1;
            public static final byte workDuration = 4;
        }
    }
}
