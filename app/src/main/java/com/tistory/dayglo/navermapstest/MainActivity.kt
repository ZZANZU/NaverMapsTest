package com.tistory.dayglo.navermapstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.nhn.android.maps.NMapActivity
import com.nhn.android.maps.NMapView
import com.nhn.android.maps.overlay.NMapPOIitem
import com.nhn.android.mapviewer.overlay.NMapPOIdataOverlay

class MainActivity : AppCompatActivity() {
    lateinit var mNMapView: NMapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(NaverMapFragment())
    }

    fun addFragment(mFragment: Fragment) {  // Unit == void, 생략 가능
        val fm = supportFragmentManager
        val mTransaction = fm.beginTransaction()

        mTransaction.add(R.id.naver_map_fragment, mFragment)
        mTransaction.addToBackStack(null)
        mTransaction.commit()
    }
}
