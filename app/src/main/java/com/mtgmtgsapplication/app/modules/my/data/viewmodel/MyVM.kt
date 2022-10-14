package com.mtgmtgsapplication.app.modules.my.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.my.`data`.model.MyModel
import org.koin.core.KoinComponent

class MyVM : ViewModel(), KoinComponent {
  val myModel: MutableLiveData<MyModel> = MutableLiveData(MyModel())

  var navArguments: Bundle? = null
}
