package com.example.mydevesstream.di;

import com.example.mydevesstream.retrofit.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProviderApiServiceFactory implements Factory<ApiService> {
  private final NetworkModule module;

  private final Provider<Retrofit.Builder> retrofitProvider;

  public NetworkModule_ProviderApiServiceFactory(NetworkModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return providerApiService(module, retrofitProvider.get());
  }

  public static NetworkModule_ProviderApiServiceFactory create(NetworkModule module,
      Provider<Retrofit.Builder> retrofitProvider) {
    return new NetworkModule_ProviderApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService providerApiService(NetworkModule instance, Retrofit.Builder retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providerApiService(retrofit));
  }
}
