package com.mtgmtgsapplication.app.modules.jointhree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.jointhree.`data`.model.JointhreeModel
import org.koin.core.KoinComponent

class JointhreeVM : ViewModel(), KoinComponent {
  val jointhreeModel: MutableLiveData<JointhreeModel> = MutableLiveData(JointhreeModel())

  var navArguments: Bundle? = null
}
