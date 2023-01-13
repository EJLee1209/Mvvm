package com.dldmswo1209.mvvmpattern

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dldmswo1209.mvvmpattern.model.Todo

object MyBindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun setItem(recyclerView: RecyclerView, todoList: List<Todo>?){
        if(recyclerView.adapter == null){
            val adapter = RecyclerAdapter()
            recyclerView.adapter = adapter
        }

        todoList?.let{
            val myAdapter = recyclerView.adapter as RecyclerAdapter
            myAdapter.submitList(it)
            myAdapter.notifyDataSetChanged()
        }
    }
}