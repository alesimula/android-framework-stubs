package android.content;

public abstract class UndoOperation<DATA extends java.lang.Object> implements android.os.Parcelable {
    android.content.UndoOwner mOwner;
    public UndoOperation(android.content.UndoOwner p0) {}
    protected UndoOperation(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    public boolean allowMerge() { return false; }
    public abstract void commit();
    public int describeContents() { return 0; }
    public android.content.UndoOwner getOwner() { return null; }
    public DATA getOwnerData() { return null; }
    public boolean hasData() { return false; }
    public boolean matchOwner(android.content.UndoOwner p0) { return false; }
    public abstract void redo();
    public abstract void undo();
}
