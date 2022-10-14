package com.mtgmtgsapplication.app.modules.join.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.join.`data`.model.JoinModel
import org.koin.core.KoinComponent

class JoinVM : ViewModel(), KoinComponent {
  val joinModel: MutableLiveData<JoinModel> = MutableLiveData(JoinModel())

  var navArguments: Bundle? = null
}
