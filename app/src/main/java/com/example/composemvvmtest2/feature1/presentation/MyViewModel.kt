package com.example.composemvvmtest2.feature1.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composemvvmtest2.feature1.domain.repository.iRepository
import kotlinx.coroutines.launch

class MyViewModel(
    repository: iRepository
): ViewModel() {
    init {
        viewModelScope.launch {
            repository.getData()
        }


    }
}