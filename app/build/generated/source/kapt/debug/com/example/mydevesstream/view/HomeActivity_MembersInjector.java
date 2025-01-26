package com.example.mydevesstream.view;

import com.example.mydevesstream.utils.CheckInternetConnection;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<CheckInternetConnection> checkInternetConnectionProvider;

  public HomeActivity_MembersInjector(
      Provider<CheckInternetConnection> checkInternetConnectionProvider) {
    this.checkInternetConnectionProvider = checkInternetConnectionProvider;
  }

  public static MembersInjector<HomeActivity> create(
      Provider<CheckInternetConnection> checkInternetConnectionProvider) {
    return new HomeActivity_MembersInjector(checkInternetConnectionProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectCheckInternetConnection(instance, checkInternetConnectionProvider.get());
  }

  @InjectedFieldSignature("com.example.mydevesstream.view.HomeActivity.checkInternetConnection")
  public static void injectCheckInternetConnection(HomeActivity instance,
      CheckInternetConnection checkInternetConnection) {
    instance.checkInternetConnection = checkInternetConnection;
  }
}
