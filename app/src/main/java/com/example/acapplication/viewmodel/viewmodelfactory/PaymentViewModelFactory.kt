package com.example.acapplication.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import com.example.acapplication.repository.PaymentRepository
import com.example.acapplication.viewmodel.PaymentViewModel

class PaymentViewModelFactory(val paymentRepository: PaymentRepository,
                                val clientRepository: ClientRepository,
                                val dailyDetailsRepository: DailyDetailsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return PaymentViewModel(paymentRepository,clientRepository,dailyDetailsRepository) as T
    }
}