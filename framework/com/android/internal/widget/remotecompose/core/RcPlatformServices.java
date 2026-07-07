package com.android.internal.widget.remotecompose.core;

public interface RcPlatformServices {
    public static final com.android.internal.widget.remotecompose.core.RcPlatformServices None = null;
    public int getImageHeight(java.lang.Object p0);
    public int getImageWidth(java.lang.Object p0);
    public byte[] imageToByteArray(java.lang.Object p0);
    public boolean isAlpha8Image(java.lang.Object p0);
    public void log(com.android.internal.widget.remotecompose.core.RcPlatformServices.LogCategory p0, java.lang.String p1);
    public java.lang.Object parsePath(java.lang.String p0);
    public float[] pathToFloatArray(java.lang.Object p0);

    public static interface ComputedTextLayout {
        public float getHeight();
        public int getVisibleLineCount();
        public float getWidth();
        public boolean isHyphenatedText();
    }

    public static enum LogCategory {
        DEBUG,
        ERROR,
        INFO,
        TODO,
        WARN;
        private static final com.android.internal.widget.remotecompose.core.RcPlatformServices.LogCategory[] $VALUES = null;
        private LogCategory() {}
    }

    public static interface RcPathArrayCreator {
        public float[] createFloatArray();
    }
}
