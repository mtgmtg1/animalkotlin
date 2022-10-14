package com.mtgmtgsapplication.app.modules.reservationtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowLists1Binding
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Lists1RowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<Lists1RowModel>
) : RecyclerView.Adapter<ListsAdapter.RowLists1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLists1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists1,parent,false)
    return RowLists1VH(view)
  }

  override fun onBindViewHolder(holder: RowLists1VH, position: Int) {
    val lists1RowModel = Lists1RowModel()
    // TODO uncomment following line after integration with data source
    // val lists1RowModel = list[position]
    holder.binding.lists1RowModel = lists1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lists1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Lists1RowModel
    ) {
    }
  }

  inner class RowLists1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLists1Binding = RowLists1Binding.bind(itemView)
  }
}
