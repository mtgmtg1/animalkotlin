package com.mtgmtgsapplication.app.modules.jointwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.jointwo.`data`.model.JointwoModel
import org.koin.core.KoinComponent

class JointwoVM : ViewModel(), KoinComponent {
  val jointwoModel: MutableLiveData<JointwoModel> = MutableLiveData(JointwoModel())

  var navArguments: Bundle? = null
}
