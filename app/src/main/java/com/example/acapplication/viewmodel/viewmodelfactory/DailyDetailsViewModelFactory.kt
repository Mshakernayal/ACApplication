package com.example.acapplication.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.acapplication.repository.*
import com.example.acapplication.viewmodel.DailyDetailsViewModel

class DailyDetailsViewModelFactory(val dailyDetailsRepository: DailyDetailsRepository,
                                    val clientRepository: ClientRepository,
                                    val invoiceRepository: InvoiceRepository,
                                    val paymentRepository: PaymentRepository,
                                    val spendRepository: SpendRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return DailyDetailsViewModel(dailyDetailsRepository,clientRepository,invoiceRepository,paymentRepository,spendRepository) as T
    }
}