package android.app.people;

@android.annotation.SystemApi
public final class Operand implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.Operand> CREATOR = null;
    public static final int TYPE_CONSTANT = 2;
    public static final int TYPE_EXPRESSION = 3;
    public static final int TYPE_KEY = 1;
    private final int mType = 0;
    private final java.lang.Object mValue = null;
    private Operand(int p0, java.lang.Object p1) {}
    public Operand(android.os.Parcel p0, int p1) {}
    public static android.app.people.Operand constant(android.app.people.Feature p0) { return null; }
    public static android.app.people.Operand expression(android.app.people.Expression p0) { return null; }
    public static android.app.people.Operand key(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.people.Feature getConstant() { return null; }
    public android.app.people.Expression getExpression() { return null; }
    public int getKey() { return 0; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
