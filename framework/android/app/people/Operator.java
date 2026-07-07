package android.app.people;

@android.annotation.SystemApi
public final class Operator implements android.os.Parcelable {
    public static final int ABS = 4;
    public static final int ABSENT = 2;
    public static final int ALL_IN = 12;
    public static final int AND = 33;
    public static final int ANY_IN = 11;
    public static final int CONCAT = 35;
    public static final int COUNT = 9;
    public static final android.os.Parcelable.Creator<android.app.people.Operator> CREATOR = null;
    public static final int DIV = 20;
    public static final int EQ = 13;
    public static final int FIRST_N = 24;
    public static final int GE = 18;
    public static final int GT = 17;
    public static final int IDENTITY = 0;
    public static final int LAST_N = 25;
    public static final int LE = 16;
    public static final int LOG = 22;
    public static final int LOGIT = 8;
    public static final int LT = 15;
    public static final int MAX = 32;
    public static final int MEAN = 29;
    public static final int MEDIAN = 30;
    public static final int MIN = 31;
    public static final int NE = 14;
    public static final int NOT = 3;
    public static final int OR = 34;
    public static final int POW = 21;
    public static final int PRESENT = 1;
    public static final int PRODUCT = 28;
    public static final int REGEX_MATCH = 23;
    public static final int RELU = 6;
    public static final int SGN = 5;
    public static final int SIGMOID = 7;
    public static final int SORT = 10;
    public static final int SUB = 19;
    public static final int SUM = 27;
    public static final int TAKE_IF = 26;
    private final boolean mReduce = false;
    private final int mType = 0;
    private Operator(android.app.people.Operator.Builder p0) {}
    private Operator(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean reduce() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private boolean mReduce;
        private final int mType = 0;
        public Builder(int p0) {}
        public android.app.people.Operator build() { return null; }
        public android.app.people.Operator.Builder setReduce(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
