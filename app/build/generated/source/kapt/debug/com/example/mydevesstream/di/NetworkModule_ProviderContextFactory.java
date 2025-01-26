package com.example.mydevesstream.di;

import android.app.Application;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class NetworkModule_ProviderContextFactory implements Factory<Context> {
  private final NetworkModule module;

  private final Provider<Application> applicationProvider;

  public NetworkModule_ProviderContextFactory(NetworkModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return providerContext(module, applicationProvider.get());
  }

  public static NetworkModule_ProviderContextFactory create(NetworkModule module,
      Provider<Application> applicationProvider) {
    return new NetworkModule_ProviderContextFactory(module, applicationProvider);
  }

  public static Context providerContext(NetworkModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providerContext(application));
  }
}
