package com.example.mydevesstream.viewModel;

import com.example.mydevesstream.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MovieViewModel_Factory implements Factory<MovieViewModel> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public MovieViewModel_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public MovieViewModel get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static MovieViewModel_Factory create(Provider<MovieRepository> movieRepositoryProvider) {
    return new MovieViewModel_Factory(movieRepositoryProvider);
  }

  public static MovieViewModel newInstance(MovieRepository movieRepository) {
    return new MovieViewModel(movieRepository);
  }
}
