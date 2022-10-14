package com.mtgmtgsapplication.app.modules.hometwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowListrectangletwentytwoBinding
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListrectangletwentytwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangletwentytwoAdapter(
  var list: List<ListrectangletwentytwoRowModel>
) : RecyclerView.Adapter<ListrectangletwentytwoAdapter.RowListrectangletwentytwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangletwentytwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangletwentytwo,parent,false)
    return RowListrectangletwentytwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangletwentytwoVH, position: Int) {
    val listrectangletwentytwoRowModel = ListrectangletwentytwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangletwentytwoRowModel = list[position]
    holder.binding.listrectangletwentytwoRowModel = listrectangletwentytwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangletwentytwoRowModel>) {
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
      item: ListrectangletwentytwoRowModel
    ) {
    }
  }

  inner class RowListrectangletwentytwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangletwentytwoBinding = RowListrectangletwentytwoBinding.bind(itemView)
    init {
      binding.linearRowrectangletwentytwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangletwentytwoRowModel())
      }
    }
  }
}
