package android.app.people;

@android.annotation.SystemApi
public final class Expression implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.Expression> CREATOR = null;
    private final java.util.List<android.app.people.Operand> mOperands = null;
    private final java.util.List<android.app.people.Operator> mOperators = null;
    private Expression(android.app.people.Expression.Builder p0) {}
    public Expression(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.people.Operand> getOperands() { return null; }
    public java.util.List<android.app.people.Operator> getOperators() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final java.util.List<android.app.people.Operand> mOperands = null;
        private final java.util.List<android.app.people.Operator> mOperators = null;
        public Builder(android.app.people.Operand p0) {}
        public android.app.people.Expression.Builder addBinaryOperation(android.app.people.Operator p0, android.app.people.Operand p1) { return null; }
        public android.app.people.Expression.Builder addListOperation(android.app.people.Operator p0, android.app.people.Operand... p1) { return null; }
        public android.app.people.Expression.Builder addUnaryOperation(android.app.people.Operator p0) { return null; }
        public android.app.people.Expression build() { return null; }
    }
}
