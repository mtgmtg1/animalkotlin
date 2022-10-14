package com.mtgmtgsapplication.app.modules.reservationtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowListf1Binding
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Listf1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfAdapter(
  var list: List<Listf1RowModel>
) : RecyclerView.Adapter<ListfAdapter.RowListf1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListf1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listf1,parent,false)
    return RowListf1VH(view)
  }

  override fun onBindViewHolder(holder: RowListf1VH, position: Int) {
    val listf1RowModel = Listf1RowModel()
    // TODO uncomment following line after integration with data source
    // val listf1RowModel = list[position]
    holder.binding.listf1RowModel = listf1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listf1RowModel>) {
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
      item: Listf1RowModel
    ) {
    }
  }

  inner class RowListf1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListf1Binding = RowListf1Binding.bind(itemView)
  }
}
