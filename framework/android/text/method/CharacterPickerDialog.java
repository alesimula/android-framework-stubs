package android.text.method;

public class CharacterPickerDialog extends android.app.Dialog implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener {
    private android.widget.Button mCancelButton;
    private android.view.LayoutInflater mInflater;
    private boolean mInsert;
    private java.lang.String mOptions;
    private android.text.Editable mText;
    private android.view.View mView;
    public CharacterPickerDialog(android.content.Context p0, android.view.View p1, android.text.Editable p2, java.lang.String p3, boolean p4) { super((android.content.Context)null); }
    private void replaceCharacterAndClose(java.lang.CharSequence p0) {}
    public void onClick(android.view.View p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}

    private class OptionsAdapter extends android.widget.BaseAdapter {
        public OptionsAdapter(android.text.method.CharacterPickerDialog p0, android.content.Context p1) { super(); }
        public final int getCount() { return 0; }
        public final java.lang.Object getItem(int p0) { return null; }
        public final long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }
}
