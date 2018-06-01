package com.tistory.dayglo.navermapstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nhn.android.maps.NMapActivity
import com.nhn.android.maps.NMapView
import com.nhn.android.maps.overlay.NMapPOIitem
import com.nhn.android.mapviewer.overlay.NMapPOIdataOverlay

class MainActivity : NMapActivity() {
    lateinit var mNMapView: NMapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mNMapView = NMapView(this)
        mNMapView.setApiKey("YceZxb6koyCy9QBiDPMh")

        setContentView(mNMapView)
        mNMapView.setClickable(true)
    }
}
