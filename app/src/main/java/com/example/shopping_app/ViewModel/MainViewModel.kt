package com.example.shopping_app.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.shopping_app.Domain.BannerModel
import com.example.shopping_app.Domain.CategoryModel
import com.example.shopping_app.Domain.ItemsModel
import com.example.shopping_app.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository= MainRepository()

    fun loadBanner():LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()

    }


    fun loadCategory():LiveData<MutableList<CategoryModel>> {

        return repository.loadCategory()
    }

    fun loadPopular():LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()

    }


}