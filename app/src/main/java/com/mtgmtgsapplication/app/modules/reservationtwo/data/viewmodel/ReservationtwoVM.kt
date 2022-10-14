package com.mtgmtgsapplication.app.modules.reservationtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Listf1RowModel
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.Lists1RowModel
import com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model.ReservationtwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReservationtwoVM : ViewModel(), KoinComponent {
  val reservationtwoModel: MutableLiveData<ReservationtwoModel> =
      MutableLiveData(ReservationtwoModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<Lists1RowModel>> = MutableLiveData(mutableListOf())

  val listfList: MutableLiveData<MutableList<Listf1RowModel>> = MutableLiveData(mutableListOf())
}
