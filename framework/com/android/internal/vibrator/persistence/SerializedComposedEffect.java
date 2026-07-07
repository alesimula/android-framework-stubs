package com.android.internal.vibrator.persistence;

final class SerializedComposedEffect implements com.android.internal.vibrator.persistence.XmlSerializedVibration<android.os.VibrationEffect.Composed> {
    private final com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment[] mSegments = null;
    SerializedComposedEffect(com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment p0) {}
    SerializedComposedEffect(com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment[] p0) {}
    public android.os.VibrationEffect.Composed deserialize() { return null; }
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void writeContent(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static interface SerializedSegment {
        public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0);
        public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException;
    }
}
