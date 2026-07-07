package com.android.internal.vibrator.persistence;

final class SerializedVendorEffect implements com.android.internal.vibrator.persistence.XmlSerializedVibration<android.os.VibrationEffect.VendorEffect> {
    private final android.os.PersistableBundle mVendorData = null;
    SerializedVendorEffect(android.os.PersistableBundle p0) {}
    public android.os.VibrationEffect.VendorEffect deserialize() { return null; }
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public void writeContent(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Parser {
        Parser() {}
        static com.android.internal.vibrator.persistence.SerializedVendorEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
