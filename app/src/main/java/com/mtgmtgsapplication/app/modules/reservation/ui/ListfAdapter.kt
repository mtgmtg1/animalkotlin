package com.mtgmtgsapplication.app.modules.reservation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowListfBinding
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListfRowModel
import kotlin.Int
import kotlin.collections.List

class ListfAdapter(
  var list: List<ListfRowModel>
) : RecyclerView.Adapter<ListfAdapter.RowListfVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listf,parent,false)
    return RowListfVH(view)
  }

  override fun onBindViewHolder(holder: RowListfVH, position: Int) {
    val listfRowModel = ListfRowModel()
    // TODO uncomment following line after integration with data source
    // val listfRowModel = list[position]
    holder.binding.listfRowModel = listfRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfRowModel>) {
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
      item: ListfRowModel
    ) {
    }
  }

  inner class RowListfVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfBinding = RowListfBinding.bind(itemView)
  }
}
