package android.os;

public class StatsBootstrapAtomValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.StatsBootstrapAtomValue> CREATOR = null;
    public android.os.StatsBootstrapAtomValue.Annotation[] annotations;
    public android.os.StatsBootstrapAtomValue.Primitive value;
    public StatsBootstrapAtomValue() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Annotation implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.StatsBootstrapAtomValue.Annotation> CREATOR = null;
        public byte id;
        public android.os.StatsBootstrapAtomValue.Annotation.Primitive value;
        public Annotation() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface Id {
            public static final byte IS_UID = 1;
            public static final byte NONE = 0;
        }

        public static final class Primitive implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.os.StatsBootstrapAtomValue.Annotation.Primitive> CREATOR = null;
            public static final int boolValue = 0;
            public static final int intValue = 1;
            private int _tag;
            private java.lang.Object _value;
            public Primitive() {}
            private Primitive(int p0, java.lang.Object p1) {}
            private Primitive(android.os.Parcel p0) {}
            private void _assertTag(int p0) {}
            private void _set(int p0, java.lang.Object p1) {}
            private java.lang.String _tagString(int p0) { return null; }
            public static android.os.StatsBootstrapAtomValue.Annotation.Primitive boolValue(boolean p0) { return null; }
            public static android.os.StatsBootstrapAtomValue.Annotation.Primitive intValue(int p0) { return null; }
            public int describeContents() { return 0; }
            public boolean getBoolValue() { return false; }
            public int getIntValue() { return 0; }
            public int getTag() { return 0; }
            public void readFromParcel(android.os.Parcel p0) {}
            public void setBoolValue(boolean p0) {}
            public void setIntValue(int p0) {}
            public final void writeToParcel(android.os.Parcel p0, int p1) {}

            public static @interface Tag {
                public static final int boolValue = 0;
                public static final int intValue = 1;
            }
        }
    }

    public static final class Primitive implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.StatsBootstrapAtomValue.Primitive> CREATOR = null;
        public static final int boolValue = 0;
        public static final int bytesValue = 5;
        public static final int floatValue = 3;
        public static final int intValue = 1;
        public static final int longValue = 2;
        public static final int stringArrayValue = 6;
        public static final int stringValue = 4;
        private int _tag;
        private java.lang.Object _value;
        public Primitive() {}
        private Primitive(int p0, java.lang.Object p1) {}
        private Primitive(android.os.Parcel p0) {}
        private void _assertTag(int p0) {}
        private void _set(int p0, java.lang.Object p1) {}
        private java.lang.String _tagString(int p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive boolValue(boolean p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive bytesValue(byte[] p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive floatValue(float p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive intValue(int p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive longValue(long p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive stringArrayValue(java.lang.String[] p0) { return null; }
        public static android.os.StatsBootstrapAtomValue.Primitive stringValue(java.lang.String p0) { return null; }
        public int describeContents() { return 0; }
        public boolean getBoolValue() { return false; }
        public byte[] getBytesValue() { return null; }
        public float getFloatValue() { return 0.0f; }
        public int getIntValue() { return 0; }
        public long getLongValue() { return 0L; }
        public java.lang.String[] getStringArrayValue() { return null; }
        public java.lang.String getStringValue() { return null; }
        public int getTag() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void setBoolValue(boolean p0) {}
        public void setBytesValue(byte[] p0) {}
        public void setFloatValue(float p0) {}
        public void setIntValue(int p0) {}
        public void setLongValue(long p0) {}
        public void setStringArrayValue(java.lang.String[] p0) {}
        public void setStringValue(java.lang.String p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface Tag {
            public static final int boolValue = 0;
            public static final int bytesValue = 5;
            public static final int floatValue = 3;
            public static final int intValue = 1;
            public static final int longValue = 2;
            public static final int stringArrayValue = 6;
            public static final int stringValue = 4;
        }
    }
}
