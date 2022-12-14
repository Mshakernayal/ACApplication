// Generated by Dagger (https://dagger.dev).
package com.example.acapplication.data.di;

import android.content.Context;
import com.example.acapplication.model.database.AcDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddSpendApplicationModule_ProvideAcDataBaseFactory implements Factory<AcDataBase> {
  private final Provider<Context> contextProvider;

  public AddSpendApplicationModule_ProvideAcDataBaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AcDataBase get() {
    return provideAcDataBase(contextProvider.get());
  }

  public static AddSpendApplicationModule_ProvideAcDataBaseFactory create(
      Provider<Context> contextProvider) {
    return new AddSpendApplicationModule_ProvideAcDataBaseFactory(contextProvider);
  }

  public static AcDataBase provideAcDataBase(Context context) {
    return Preconditions.checkNotNullFromProvides(AddSpendApplicationModule.INSTANCE.provideAcDataBase(context));
  }
}
