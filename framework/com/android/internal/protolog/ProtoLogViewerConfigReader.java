package com.android.internal.protolog;

public class ProtoLogViewerConfigReader {
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.Long>> mGroupHashes = null;
    private volatile android.util.LongSparseArray<java.lang.String> mLogMessageMap;
    private final com.android.internal.protolog.ViewerConfigInputStreamProvider mViewerConfigInputStreamProvider = null;
    public ProtoLogViewerConfigReader(com.android.internal.protolog.ViewerConfigInputStreamProvider p0) {}
    private long loadGroupId(java.lang.String p0) throws java.io.IOException { return 0L; }
    private java.util.Map<java.lang.Long, java.lang.String> loadViewerConfigMappingForGroup(java.lang.String p0) throws java.io.IOException { return null; }
    private static com.android.internal.protolog.ProtoLogViewerConfigReader.ParsedGroup readGroup(android.util.proto.ProtoInputStream p0) throws java.io.IOException { return null; }
    private static com.android.internal.protolog.ProtoLogViewerConfigReader.ParsedMessage readMessage(android.util.proto.ProtoInputStream p0) throws java.io.IOException { return null; }
    public com.android.internal.protolog.ProtoLogViewerConfigReader.MessageData getMessageDataForHashFromFile(long p0) throws java.io.IOException { return null; }
    public java.lang.String getViewerString(long p0) { return null; }
    public void loadViewerConfig(java.lang.String[] p0) {}
    public void loadViewerConfig(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) {}
    public boolean messageHashIsAvailableInFile(long p0) throws java.io.IOException { return false; }
    public void unloadViewerConfig(java.lang.String[] p0) {}
    public void unloadViewerConfig(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) {}

    public static class MessageData {
        public final java.lang.String group = null;
        public final java.lang.String message = null;
        public MessageData(java.lang.String p0, java.lang.String p1) {}
    }

    private static class ParsedGroup {
        long groupId;
        java.lang.String groupName;
        private ParsedGroup() {}
    }

    private static class ParsedMessage {
        int groupId;
        java.lang.String message;
        long messageId;
        private ParsedMessage() {}
    }
}
