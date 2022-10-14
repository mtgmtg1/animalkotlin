package com.mtgmtgsapplication.app.modules.reservation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowListsBinding
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListsRowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<ListsRowModel>
) : RecyclerView.Adapter<ListsAdapter.RowListsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists,parent,false)
    return RowListsVH(view)
  }

  override fun onBindViewHolder(holder: RowListsVH, position: Int) {
    val listsRowModel = ListsRowModel()
    // TODO uncomment following line after integration with data source
    // val listsRowModel = list[position]
    holder.binding.listsRowModel = listsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsRowModel>) {
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
      item: ListsRowModel
    ) {
    }
  }

  inner class RowListsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsBinding = RowListsBinding.bind(itemView)
  }
}
