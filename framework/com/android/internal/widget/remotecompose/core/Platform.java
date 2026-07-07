package com.android.internal.widget.remotecompose.core;

public interface Platform {
    public static final com.android.internal.widget.remotecompose.core.Platform None = null;
    public int getImageHeight(java.lang.Object p0);
    public int getImageWidth(java.lang.Object p0);
    public byte[] imageToByteArray(java.lang.Object p0);
    public boolean isAlpha8Image(java.lang.Object p0);
    public void log(com.android.internal.widget.remotecompose.core.Platform.LogCategory p0, java.lang.String p1);
    public java.lang.Object parsePath(java.lang.String p0);
    public float[] pathToFloatArray(java.lang.Object p0);

    public static interface ComputedTextLayout {
        public float getHeight();
        public float getWidth();
    }

    public static enum LogCategory {
        DEBUG,
        ERROR,
        INFO,
        TODO,
        WARN;
        private static final com.android.internal.widget.remotecompose.core.Platform.LogCategory[] $VALUES = null;
        private LogCategory() {}
    }
}
