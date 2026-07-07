package com.android.internal.util;

public interface HeavyHitterSketch<T extends java.lang.Object> {
    public static <V extends java.lang.Object> com.android.internal.util.HeavyHitterSketch<V> newDefault() { return null; }
    public void add(T p0);
    public java.util.List<T> getCandidates(java.util.List<T> p0);
    public float getRequiredValidationInputRatio();
    public java.util.List<T> getTopHeavyHitters(int p0, java.util.List<T> p1, java.util.List<java.lang.Float> p2);
    public void reset();
    public void setConfig(int p0, int p1);

    public static final class HeavyHitterSketchImpl<T extends java.lang.Object> implements com.android.internal.util.HeavyHitterSketch<T> {
        private int mCapacity;
        private boolean mConfigured;
        private final android.util.SparseIntArray mFrequencies = null;
        private int mNumInputs;
        private final android.util.SparseArray<T> mObjects = null;
        private int mPassSize;
        private int mTotalSize;
        public HeavyHitterSketchImpl() {}
        private void addToMGSummary(T p0) {}
        private void validate(T p0) {}
        public void add(T p0) {}
        public java.util.List<T> getCandidates(java.util.List<T> p0) { return null; }
        public float getRequiredValidationInputRatio() { return 0.0f; }
        public java.util.List<T> getTopHeavyHitters(int p0, java.util.List<T> p1, java.util.List<java.lang.Float> p2) { return null; }
        public void reset() {}
        public void setConfig(int p0, int p1) {}
    }
}
