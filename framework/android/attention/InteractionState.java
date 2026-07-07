package android.attention;

public class InteractionState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.attention.InteractionState> CREATOR = null;
    public static final int INTERACTION_TYPE_ALL = -1;
    public static final int INTERACTION_TYPE_GESTURE = 4;
    public static final int INTERACTION_TYPE_HOVER = 2;
    public static final int INTERACTION_TYPE_KEY = 1;
    public static final int INTERACTION_TYPE_NONE = 0;
    public long interactionTimeMillis;
    public int interactionTypes;
    public InteractionState() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
