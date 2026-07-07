package android.ddm;

public class DdmHandleNativeHeap extends android.ddm.DdmHandle {
    public static final int CHUNK_NHGT = Integer.valueOf(0);
    private static android.ddm.DdmHandleNativeHeap mInstance;
    private DdmHandleNativeHeap() { super(); }
    private native byte[] getLeakInfo();
    private org.apache.harmony.dalvik.ddmc.Chunk handleNHGT(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void register() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public void onConnected() {}
    public void onDisconnected() {}
}
