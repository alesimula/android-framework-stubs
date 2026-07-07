package android.content.res;

public class ColorStateList extends android.content.res.ComplexColor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.res.ColorStateList> CREATOR = null;
    private static final int DEFAULT_COLOR = -65536;
    private static final int[][] EMPTY = null;
    private static final java.lang.String TAG = "ColorStateList";
    private static final android.util.SparseArray<java.lang.ref.WeakReference<android.content.res.ColorStateList>> sCache = null;
    private int mChangingConfigurations;
    private int[] mColors;
    private int mDefaultColor;
    private android.content.res.ColorStateList.ColorStateListFactory mFactory;
    private boolean mIsOpaque;
    private int[][] mStateSpecs;
    private int[][] mThemeAttrs;
    private ColorStateList() { super(); }
    private ColorStateList(android.content.res.ColorStateList p0) { super(); }
    public ColorStateList(int[][] p0, int[] p1) { super(); }
    private void applyTheme(android.content.res.Resources.Theme p0) {}
    public static android.content.res.ColorStateList createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    @java.lang.Deprecated
    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources.Theme p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private int modulateColor(int p0, float p1, float p2) { return 0; }
    private void onColorsChanged() {}
    public static android.content.res.ColorStateList valueOf(int p0) { return null; }
    public boolean canApplyTheme() { return false; }
    public int describeContents() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public int getColorForState(int[] p0, int p1) { return 0; }
    public int[] getColors() { return null; }
    public android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState() { return null; }
    public int getDefaultColor() { return 0; }
    public int[][] getStates() { return null; }
    public boolean hasFocusStateSpecified() { return false; }
    public boolean hasState(int p0) { return false; }
    public boolean isOpaque() { return false; }
    public boolean isStateful() { return false; }
    public android.content.res.ColorStateList obtainForTheme(android.content.res.Resources.Theme p0) { return null; }
    public java.lang.String toString() { return null; }
    public android.content.res.ColorStateList withAlpha(int p0) { return null; }
    public android.content.res.ColorStateList withLStar(float p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0) {}

    private static class ColorStateListFactory extends android.content.res.ConstantState<android.content.res.ComplexColor> {
        private final android.content.res.ColorStateList mSrc = null;
        public ColorStateListFactory(android.content.res.ColorStateList p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.content.res.ColorStateList newInstance() { return null; }
        public android.content.res.ColorStateList newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
    }
}
