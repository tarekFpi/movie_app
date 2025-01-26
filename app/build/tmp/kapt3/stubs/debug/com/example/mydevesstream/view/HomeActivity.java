package com.example.mydevesstream.view;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\b\u0010!\u001a\u00020\u001dH\u0014J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/mydevesstream/view/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "checkInternetConnection", "Lcom/example/mydevesstream/utils/CheckInternetConnection;", "getCheckInternetConnection", "()Lcom/example/mydevesstream/utils/CheckInternetConnection;", "setCheckInternetConnection", "(Lcom/example/mydevesstream/utils/CheckInternetConnection;)V", "currentPage", "", "editText_TaskSearch", "Landroid/widget/EditText;", "isLoading", "", "movieAdapter", "Lcom/example/mydevesstream/adapter/MovieListAdapter;", "movieList", "Ljava/util/ArrayList;", "Lcom/example/mydevesstream/model/movieList/Search;", "Lkotlin/collections/ArrayList;", "movieListViewModel", "Lcom/example/mydevesstream/viewModel/MovieViewModel;", "progressDialog", "Landroid/app/ProgressDialog;", "recyclerMovieList", "Landroidx/recyclerview/widget/RecyclerView;", "totalPages", "internetConnection", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "searchTaskList", "textData", "", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.mydevesstream.adapter.MovieListAdapter movieAdapter;
    private androidx.recyclerview.widget.RecyclerView recyclerMovieList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.mydevesstream.model.movieList.Search> movieList;
    private com.example.mydevesstream.viewModel.MovieViewModel movieListViewModel;
    private android.app.ProgressDialog progressDialog;
    @javax.inject.Inject
    public com.example.mydevesstream.utils.CheckInternetConnection checkInternetConnection;
    private android.widget.EditText editText_TaskSearch;
    private boolean isLoading = false;
    private int currentPage = 1;
    private int totalPages = 100;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mydevesstream.utils.CheckInternetConnection getCheckInternetConnection() {
        return null;
    }
    
    public final void setCheckInternetConnection(@org.jetbrains.annotations.NotNull
    com.example.mydevesstream.utils.CheckInternetConnection p0) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchTaskList(java.lang.String textData) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void internetConnection() {
    }
}