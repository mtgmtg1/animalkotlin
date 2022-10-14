package com.mtgmtgsapplication.app.modules.reservation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListfRowModel
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListsRowModel
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ReservationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReservationVM : ViewModel(), KoinComponent {
  val reservationModel: MutableLiveData<ReservationModel> = MutableLiveData(ReservationModel())

  var navArguments: Bundle? = null

  val listsList: MutableLiveData<MutableList<ListsRowModel>> = MutableLiveData(mutableListOf())

  val listfList: MutableLiveData<MutableList<ListfRowModel>> = MutableLiveData(mutableListOf())
}
