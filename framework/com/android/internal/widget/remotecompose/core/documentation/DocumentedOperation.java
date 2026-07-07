package com.android.internal.widget.remotecompose.core.documentation;

public class DocumentedOperation {
    public static final int BOOLEAN = 2;
    public static final int BUFFER = 4;
    public static final int BYTE = 6;
    public static final int BYTE_ARRAY = 12;
    public static final int FLOAT = 1;
    public static final int FLOAT_ARRAY = 10;
    public static final int INT = 0;
    public static final int INT_ARRAY = 11;
    public static final int LAYOUT = 0;
    public static final int LONG = 8;
    public static final int REPEATED_BYTE = 15;
    public static final int REPEATED_FLOAT = 13;
    public static final int REPEATED_INT = 14;
    public static final int SHORT = 9;
    public static final int UTF8 = 5;
    public static final int VALUE = 7;
    int mAddedVersion;
    java.lang.String mAdditionalDocumentation;
    final java.lang.String mCategory = null;
    java.lang.String mDescription;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> mExamples;
    int mExamplesHeight;
    int mExamplesWidth;
    boolean mExperimental;
    com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation.RepeatedField mFields;
    int mId;
    final java.lang.String mName = null;
    java.lang.String mTextExamples;
    java.lang.String mVarSize;
    boolean mWIP;
    public DocumentedOperation(java.lang.String p0, int p1, java.lang.String p2) {}
    public DocumentedOperation(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public static java.lang.String getType(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation addedVersion(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation additionalDocumentation(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation description(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation endSubsection() { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation exampleImage(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation examples(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation examplesDimension(int p0, int p1) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation experimental(boolean p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation field(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation field(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public int getAddedVersion() { return 0; }
    public java.lang.String getAdditionalDocumentation() { return null; }
    public java.lang.String getCategory() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> getExamples() { return null; }
    public int getExamplesHeight() { return 0; }
    public int getExamplesWidth() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.DocumentedField> getFields() { return null; }
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    public int getSizeFields() { return 0; }
    public java.lang.String getTextExamples() { return null; }
    public java.lang.String getVarSize() { return null; }
    public boolean isExperimental() { return false; }
    public boolean isWIP() { return false; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation possibleValues(java.lang.String p0, int p1) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation startSubsection(java.lang.String p0) { return null; }

    static class RepeatedField implements com.android.internal.widget.remotecompose.core.documentation.DocumentedField {
        java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.DocumentedField> mFields;
        private java.lang.String mName;
        com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation.RepeatedField mParentFields;
        RepeatedField(java.lang.String p0, com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation.RepeatedField p1) {}
        public void add(com.android.internal.widget.remotecompose.core.documentation.DocumentedField p0) {}
        public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.DocumentedField> getFields() { return null; }
        public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation.RepeatedField getParent() { return null; }
        public int getSize() { return 0; }
        public java.lang.String getVarSize() { return null; }
        public java.lang.String toDoc() { return null; }
    }
}
