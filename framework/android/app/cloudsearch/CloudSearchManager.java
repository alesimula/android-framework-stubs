package android.app.cloudsearch;

@android.annotation.SystemApi
public class CloudSearchManager {
    public CloudSearchManager() {}
    @android.annotation.SystemApi
    public void search(android.app.cloudsearch.SearchRequest p0, java.util.concurrent.Executor p1, android.app.cloudsearch.CloudSearchManager.CallBack p2) {}

    public static interface CallBack {
        public void onSearchFailed(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.SearchResponse p1);
        public void onSearchSucceeded(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.SearchResponse p1);
    }
}
