package com.example.mydevesstream.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CheckInternetConnection_Factory implements Factory<CheckInternetConnection> {
  @Override
  public CheckInternetConnection get() {
    return newInstance();
  }

  public static CheckInternetConnection_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CheckInternetConnection newInstance() {
    return new CheckInternetConnection();
  }

  private static final class InstanceHolder {
    private static final CheckInternetConnection_Factory INSTANCE = new CheckInternetConnection_Factory();
  }
}
