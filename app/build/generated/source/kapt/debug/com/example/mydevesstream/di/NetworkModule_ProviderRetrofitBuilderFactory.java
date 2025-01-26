package com.example.mydevesstream.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class NetworkModule_ProviderRetrofitBuilderFactory implements Factory<Retrofit.Builder> {
  private final NetworkModule module;

  public NetworkModule_ProviderRetrofitBuilderFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Retrofit.Builder get() {
    return providerRetrofitBuilder(module);
  }

  public static NetworkModule_ProviderRetrofitBuilderFactory create(NetworkModule module) {
    return new NetworkModule_ProviderRetrofitBuilderFactory(module);
  }

  public static Retrofit.Builder providerRetrofitBuilder(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providerRetrofitBuilder());
  }
}
