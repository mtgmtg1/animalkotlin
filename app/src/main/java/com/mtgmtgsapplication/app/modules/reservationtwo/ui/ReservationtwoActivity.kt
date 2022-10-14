package com.mtgmtgsapplication.app.modules.reservationtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityReservationtwoBinding
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Listf1RowModel
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Lists1RowModel
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.viewmodel.ReservationtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReservationtwoActivity :
    BaseActivity<ActivityReservationtwoBinding>(R.layout.activity_reservationtwo) {
  private val viewModel: ReservationtwoVM by viewModels<ReservationtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists1RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(this) {
      listsAdapter.updateData(it)
    }
    val listfAdapter = ListfAdapter(viewModel.listfList.value?:mutableListOf())
    binding.recyclerListf.adapter = listfAdapter
    listfAdapter.setOnItemClickListener(
    object : ListfAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listf1RowModel) {
        onClickRecyclerListf(view, position, item)
      }
    }
    )
    viewModel.listfList.observe(this) {
      listfAdapter.updateData(it)
    }
    binding.reservationtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListf(
    view: View,
    position: Int,
    item: Listf1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RESERVATIONTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReservationtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
