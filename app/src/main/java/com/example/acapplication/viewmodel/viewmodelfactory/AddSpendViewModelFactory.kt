package com.example.acapplication.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.acapplication.repository.ClientRepository
import com.example.acapplication.repository.DailyDetailsRepository
import com.example.acapplication.repository.SpendRepository
import com.example.acapplication.viewmodel.AddSpendViewModel

class AddSpendViewModelFactory(val spendRepository: SpendRepository,
                               val dailyDetailsRepository: DailyDetailsRepository,
                               val clientRepository: ClientRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return AddSpendViewModel(spendRepository,dailyDetailsRepository,clientRepository) as T
    }
}