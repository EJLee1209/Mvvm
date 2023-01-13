package com.dldmswo1209.mvvmpattern.viewModel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dldmswo1209.mvvmpattern.model.Todo

class MainViewModel: ViewModel() {
    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList : LiveData<List<Todo>>
        get() = _todoList

    private var items = mutableListOf<Todo>()
    init {
        items = arrayListOf(
            Todo("테스트1"),
            Todo("테스트2")
        )
        _todoList.postValue(items)
    }


    fun addTodo(content: String){
        if(content == ""){
            return
        }
        val todo = Todo(content)
        items.add(todo)
        _todoList.postValue(items)
    }
}