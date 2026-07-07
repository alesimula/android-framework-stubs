package android.window;

public class TaskConstants {
    public static final int TASK_CHILD_LAYER_COMPAT_UI = 10000;
    public static final int TASK_CHILD_LAYER_FLOATING_MENU = 80000;
    public static final int TASK_CHILD_LAYER_LETTERBOX_BACKGROUND = -20000;
    public static final int TASK_CHILD_LAYER_RECENTS_ANIMATION_PIP_OVERLAY = 50000;
    public static final int TASK_CHILD_LAYER_REGION_SIZE = 10000;
    public static final int TASK_CHILD_LAYER_RESIZE_VEIL = 70000;
    public static final int TASK_CHILD_LAYER_SETTINGS_DIALOG = 20000;
    public static final int TASK_CHILD_LAYER_STARTING_WINDOW = 30000;
    public static final int TASK_CHILD_LAYER_TASK_BACKGROUND = -30000;
    public static final int TASK_CHILD_LAYER_TASK_OVERLAY = 60000;
    public static final int TASK_CHILD_LAYER_WINDOW_DECORATIONS = 40000;
    public static final int TASK_CHILD_SHELL_LAYER_LETTERBOX_BACKGROUND = -10000;
    public static final int TASK_CHILD_SHELL_LAYER_LETTERBOX_ROUNDED_CORNERS = 2000;
    public static final int TASK_CHILD_SHELL_LAYER_LETTERBOX_SPY = 1000;
    public TaskConstants() {}

    public static @interface TaskChildLayer {
    }
}
