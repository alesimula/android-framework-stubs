package android.service.personalcontext.hint.autofill;

public interface AugmentedAutofillProxy {
    public android.os.IBinder asBinder();
    public android.app.assist.AssistStructure.ViewNode fetchFocusedViewNode(android.view.autofill.AutofillId p0);
    public android.graphics.Rect fetchViewCoordinates(android.view.autofill.AutofillId p0);
}
