package com.mtgmtgsapplication.app.modules.joinfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.joinfour.`data`.model.JoinfourModel
import org.koin.core.KoinComponent

class JoinfourVM : ViewModel(), KoinComponent {
  val joinfourModel: MutableLiveData<JoinfourModel> = MutableLiveData(JoinfourModel())

  var navArguments: Bundle? = null
}
