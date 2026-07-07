package android.app.people;

@android.annotation.SystemApi
public final class HeuristicInferrer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.HeuristicInferrer> CREATOR = null;
    private final java.util.List<android.app.people.Expression> mFilters = null;
    private final java.util.List<android.app.people.Expression> mScorers = null;
    private HeuristicInferrer(android.app.people.HeuristicInferrer.Builder p0) {}
    public HeuristicInferrer(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.people.Expression> getFilters() { return null; }
    public java.util.List<android.app.people.Expression> getScorers() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final java.util.ArrayList<android.app.people.Expression> mFilters = null;
        private final java.util.ArrayList<android.app.people.Expression> mScorers = null;
        public Builder() {}
        public android.app.people.HeuristicInferrer.Builder addFilters(android.app.people.Expression... p0) { return null; }
        public android.app.people.HeuristicInferrer.Builder addScorers(android.app.people.Expression... p0) { return null; }
        public android.app.people.HeuristicInferrer build() { return null; }
    }
}
