package com.example.acapplication.data.di

import android.content.Context
import androidx.room.Room
import com.example.acapplication.model.database.AcDataBase
import com.example.acapplication.repository.*
import com.example.acapplication.viewmodel.viewmodelfactory.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.annotation.Signed
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AddSpendApplicationModule {

    @Singleton
    @Provides
    fun provideAcDataBase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context,AcDataBase::class.java,"AcDataBase").build()

    @Singleton
    @Provides
    fun provideDailyDetailsRepository(dataBase : AcDataBase) = DailyDetailsRepository(dataBase)

    @Singleton
    @Provides
    fun provideInvoiceRepository(dataBase: AcDataBase) = InvoiceRepository(dataBase)

    @Singleton
    @Provides
    fun providePaymentRepository(dataBase: AcDataBase) = PaymentRepository(dataBase)

    @Singleton
    @Provides
    fun provideSpendRepository(dataBase: AcDataBase) = SpendRepository(dataBase)

    @Singleton
    @Provides
    fun provideClientRepository(dataBase: AcDataBase) = ClientRepository(dataBase)

    @Singleton
    @Provides
    fun provideDailyDetailsViewModelFactory(dailyDetailsRepository: DailyDetailsRepository,clientRepository: ClientRepository,invoiceRepository: InvoiceRepository,paymentRepository: PaymentRepository,spendRepository: SpendRepository)
    = DailyDetailsViewModelFactory(dailyDetailsRepository,clientRepository,invoiceRepository,paymentRepository,spendRepository)

    @Singleton
    @Provides
    fun provideInvoiceViewModelFactory(invoiceRepository: InvoiceRepository,dailyDetailsRepository: DailyDetailsRepository,clientRepository: ClientRepository)
    = InvoiceViewModelFactory(invoiceRepository,dailyDetailsRepository,clientRepository)

    @Singleton
    @Provides
    fun providePaymentViewModelFactory(paymentRepository: PaymentRepository,clientRepository: ClientRepository,dailyDetailsRepository: DailyDetailsRepository)
    = PaymentViewModelFactory(paymentRepository,clientRepository,dailyDetailsRepository)

    @Singleton
    @Provides
    fun provideAddSpendViewModelFactory(spendRepository: SpendRepository,dailyDetailsRepository: DailyDetailsRepository,clientRepository: ClientRepository)
    = AddSpendViewModelFactory(spendRepository,dailyDetailsRepository,clientRepository)

    @Singleton
    @Provides
    fun provideClientViewModelFactory(clientRepository: ClientRepository,dailyDetailsRepository: DailyDetailsRepository)
    = ClientViewModelFactory(clientRepository,dailyDetailsRepository)
}