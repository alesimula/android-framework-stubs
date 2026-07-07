package android.util.jar;

class StrictJarManifestReader {
    private final java.util.HashMap<java.lang.String, java.util.jar.Attributes.Name> attributeNameCache = null;
    private final byte[] buf = null;
    private int consecutiveLineBreaks;
    private final int endOfMainSection = 0;
    private java.util.jar.Attributes.Name name;
    private int pos;
    private java.lang.String value;
    private final java.io.ByteArrayOutputStream valueBuffer = null;
    public StrictJarManifestReader(byte[] p0, java.util.jar.Attributes p1) throws java.io.IOException {}
    private boolean readHeader() throws java.io.IOException { return false; }
    private void readName() throws java.io.IOException {}
    private void readValue() throws java.io.IOException {}
    public int getEndOfMainSection() { return 0; }
    public void readEntries(java.util.Map<java.lang.String, java.util.jar.Attributes> p0, java.util.Map<java.lang.String, android.util.jar.StrictJarManifest.Chunk> p1) throws java.io.IOException {}
}
