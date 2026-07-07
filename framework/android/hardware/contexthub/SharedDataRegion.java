package android.hardware.contexthub;

public class SharedDataRegion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion> CREATOR = null;
    public static final int OFFSET_INVALID = -1;
    public int id;
    public java.lang.String[] permissions;
    public android.os.ParcelFileDescriptor sharedMemory;
    public long sizeBytes;
    public SharedDataRegion() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class DataFlowBlockHeader implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowBlockHeader> CREATOR = null;
        public int baseIndex;
        public int nextBlockOffsetBytes;
        public byte[] reserved;
        public int skipIndex;
        public android.hardware.contexthub.SharedDataRegion.DataFlowSourceMetadata sourceMetadata;
        public DataFlowBlockHeader() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class DataFlowElementConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig> CREATOR = null;
        public static final int fixedSize = 0;
        public static final int variableSize = 1;
        private int _tag;
        private java.lang.Object _value;
        public DataFlowElementConfig() {}
        private DataFlowElementConfig(int p0, java.lang.Object p1) {}
        private DataFlowElementConfig(android.os.Parcel p0) {}
        private void _assertTag(int p0) {}
        private void _set(int p0, java.lang.Object p1) {}
        private java.lang.String _tagString(int p0) { return null; }
        private int describeContents(java.lang.Object p0) { return 0; }
        public static android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig fixedSize(android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.FixedSize p0) { return null; }
        public static android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig variableSize(android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.VariableSize p0) { return null; }
        public int describeContents() { return 0; }
        public android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.FixedSize getFixedSize() { return null; }
        public final int getStability() { return 0; }
        public int getTag() { return 0; }
        public android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.VariableSize getVariableSize() { return null; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void setFixedSize(android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.FixedSize p0) {}
        public void setVariableSize(android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.VariableSize p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class FixedSize implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.FixedSize> CREATOR = null;
            public char elementAlignmentBytes;
            public int elementSizeBytes;
            public byte[] reserved;
            public FixedSize() {}
            public int describeContents() { return 0; }
            public final int getStability() { return 0; }
            public final void readFromParcel(android.os.Parcel p0) {}
            public final void writeToParcel(android.os.Parcel p0, int p1) {}
        }

        public static @interface Tag {
            public static final byte fixedSize = 0;
            public static final byte variableSize = 1;
        }

        public static class VariableSize implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig.VariableSize> CREATOR = null;
            public char elementAlignmentBytes;
            public byte[] reserved;
            public VariableSize() {}
            public int describeContents() { return 0; }
            public final int getStability() { return 0; }
            public final void readFromParcel(android.os.Parcel p0) {}
            public final void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static class DataFlowMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowMetadata> CREATOR = null;
        public int blockCapacityBytes;
        public int blockListEpoch;
        public android.hardware.contexthub.SharedDataRegion.DataFlowElementConfig elementConfig;
        public byte localNotify;
        public byte[] reserved;
        public android.hardware.contexthub.SharedDataRegion.EndpointIdFixedSize sourceId;
        public int sourceMetadataOffsetBytes;
        public android.hardware.contexthub.SharedDataRegion.Version version;
        public DataFlowMetadata() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class DataFlowSinkMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowSinkMetadata> CREATOR = null;
        public android.hardware.contexthub.SharedDataRegion.EndpointIdFixedSize id;
        public int indexCorrection;
        public int initialBlockListEpoch;
        public int initialHeadBlockOffsetBytes;
        public boolean isOverwritable;
        public int readIndex;
        public byte[] reserved;
        public int sinkFlags;
        public int sourceFlags;
        public android.hardware.contexthub.SharedDataRegion.Version version;
        public DataFlowSinkMetadata() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface SinkFlags {
            public static final int CLEARED = 0;
            public static final int FINISHED = 1;
        }

        public static @interface SourceFlags {
            public static final int BLOCKING = 2;
            public static final int DISCONNECTED = 16;
            public static final int FINISHED = 8;
            public static final int NONE = 0;
            public static final int OVERWRITE = 4;
            public static final int PENDING_INIT = 1;
        }
    }

    public static class DataFlowSourceMetadata implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowSourceMetadata> CREATOR = null;
        public int indexCorrection;
        public byte[] reserved;
        public int tailBlockOffsetBytes;
        public int writeIndex;
        public DataFlowSourceMetadata() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class DataFlowVariableSizeBlockHeader implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowVariableSizeBlockHeader> CREATOR = null;
        public android.hardware.contexthub.SharedDataRegion.DataFlowBlockHeader blockHeader;
        public int firstElementIndex;
        public byte[] reserved;
        public DataFlowVariableSizeBlockHeader() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class DataFlowVariableSizeElementHeader implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.DataFlowVariableSizeElementHeader> CREATOR = null;
        public int sizeBytes;
        public DataFlowVariableSizeElementHeader() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class EndpointIdFixedSize implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.EndpointIdFixedSize> CREATOR = null;
        public long endpointId;
        public long hubId;
        public EndpointIdFixedSize() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class Version implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegion.Version> CREATOR = null;
        public byte major;
        public byte minor;
        public char patch;
        public Version() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
