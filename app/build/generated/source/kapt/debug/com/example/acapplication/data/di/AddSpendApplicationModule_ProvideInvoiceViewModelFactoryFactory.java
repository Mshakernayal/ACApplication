// Generated by Dagger (https://dagger.dev).
package com.example.acapplication.data.di;

import com.example.acapplication.repository.ClientRepository;
import com.example.acapplication.repository.DailyDetailsRepository;
import com.example.acapplication.repository.InvoiceRepository;
import com.example.acapplication.viewmodel.viewmodelfactory.InvoiceViewModelFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddSpendApplicationModule_ProvideInvoiceViewModelFactoryFactory implements Factory<InvoiceViewModelFactory> {
  private final Provider<InvoiceRepository> invoiceRepositoryProvider;

  private final Provider<DailyDetailsRepository> dailyDetailsRepositoryProvider;

  private final Provider<ClientRepository> clientRepositoryProvider;

  public AddSpendApplicationModule_ProvideInvoiceViewModelFactoryFactory(
      Provider<InvoiceRepository> invoiceRepositoryProvider,
      Provider<DailyDetailsRepository> dailyDetailsRepositoryProvider,
      Provider<ClientRepository> clientRepositoryProvider) {
    this.invoiceRepositoryProvider = invoiceRepositoryProvider;
    this.dailyDetailsRepositoryProvider = dailyDetailsRepositoryProvider;
    this.clientRepositoryProvider = clientRepositoryProvider;
  }

  @Override
  public InvoiceViewModelFactory get() {
    return provideInvoiceViewModelFactory(invoiceRepositoryProvider.get(), dailyDetailsRepositoryProvider.get(), clientRepositoryProvider.get());
  }

  public static AddSpendApplicationModule_ProvideInvoiceViewModelFactoryFactory create(
      Provider<InvoiceRepository> invoiceRepositoryProvider,
      Provider<DailyDetailsRepository> dailyDetailsRepositoryProvider,
      Provider<ClientRepository> clientRepositoryProvider) {
    return new AddSpendApplicationModule_ProvideInvoiceViewModelFactoryFactory(invoiceRepositoryProvider, dailyDetailsRepositoryProvider, clientRepositoryProvider);
  }

  public static InvoiceViewModelFactory provideInvoiceViewModelFactory(
      InvoiceRepository invoiceRepository, DailyDetailsRepository dailyDetailsRepository,
      ClientRepository clientRepository) {
    return Preconditions.checkNotNullFromProvides(AddSpendApplicationModule.INSTANCE.provideInvoiceViewModelFactory(invoiceRepository, dailyDetailsRepository, clientRepository));
  }
}