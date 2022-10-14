package com.mtgmtgsapplication.app.modules.hometwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.databinding.RowListnameBinding
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListnameRowModel
import kotlin.Int
import kotlin.collections.List

class ListnameAdapter(
  var list: List<ListnameRowModel>
) : RecyclerView.Adapter<ListnameAdapter.RowListnameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listname,parent,false)
    return RowListnameVH(view)
  }

  override fun onBindViewHolder(holder: RowListnameVH, position: Int) {
    val listnameRowModel = ListnameRowModel()
    // TODO uncomment following line after integration with data source
    // val listnameRowModel = list[position]
    holder.binding.listnameRowModel = listnameRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnameRowModel>) {
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
      item: ListnameRowModel
    ) {
    }
  }

  inner class RowListnameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnameBinding = RowListnameBinding.bind(itemView)
    init {
      binding.btn.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListnameRowModel())
      }
      binding.linearColumnthirteen.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListnameRowModel())
      }
    }
  }
}
