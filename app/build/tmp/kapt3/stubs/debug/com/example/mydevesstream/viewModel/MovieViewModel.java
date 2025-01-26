package com.example.mydevesstream.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mydevesstream/viewModel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/mydevesstream/repository/MovieRepository;", "(Lcom/example/mydevesstream/repository/MovieRepository;)V", "movieResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/mydevesstream/utils/Resource;", "", "Lcom/example/mydevesstream/model/movieList/Search;", "getMovieResponseLiveData", "()Landroidx/lifecycle/LiveData;", "movieResponseMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "loadMovies", "", "page", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.mydevesstream.repository.MovieRepository movieRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.mydevesstream.utils.Resource<java.util.List<com.example.mydevesstream.model.movieList.Search>>> movieResponseMutableLiveData;
    
    @javax.inject.Inject
    public MovieViewModel(@org.jetbrains.annotations.NotNull
    com.example.mydevesstream.repository.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mydevesstream.utils.Resource<java.util.List<com.example.mydevesstream.model.movieList.Search>>> getMovieResponseLiveData() {
        return null;
    }
    
    public final void loadMovies(int page) {
    }
}