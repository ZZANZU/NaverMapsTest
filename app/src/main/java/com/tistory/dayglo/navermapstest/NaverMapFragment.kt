package com.tistory.dayglo.navermapstest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nhn.android.maps.NMapController
import com.nhn.android.maps.NMapView
import com.nhn.android.maps.maplib.NGeoPoint
import com.nhn.android.maps.nmapmodel.NMapError
import kotlinx.android.synthetic.main.fragment_naver_map.view.*

class NaverMapFragment: NMapFragment(), NMapView.OnMapStateChangeListener {
    lateinit var mNMapView: NMapView
    lateinit var mNMapController: NMapController

    val NAVER_CLIENT_ID = "YceZxb6koyCy9QBiDPMh"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val mView = inflater.inflate(R.layout.fragment_naver_map, container, false)

//        mNMapView = mView.naver_map_view as NMapView
        mNMapView = NMapView(activity)
        mNMapView.setClientId(NAVER_CLIENT_ID)
        mNMapView.setClickable(true)

        return mNMapView
    }

    override fun onStart() {
        super.onStart()
        mNMapView.setOnMapStateChangeListener(this)
        mNMapView.setBuiltInZoomControls(true, null)
        mNMapController = mNMapView.mapController
    }

    override fun onMapCenterChangeFine(p0: NMapView?) {
    }

    override fun onAnimationStateChange(p0: NMapView?, p1: Int, p2: Int) {
    }

    override fun onMapInitHandler(nMapView: NMapView?, nMapError: NMapError?) {
        if(nMapError == null) {
            nMapView!!.setBuiltInZoomControls(true, null)
            mNMapController.setMapCenter(NGeoPoint(126.978371, 37.5666091), 11)

        } else { // fail
            Log.e("ZZANZU", "onMapInitHandler: error=" + nMapError.toString());
        }
    }

    override fun onZoomLevelChange(p0: NMapView?, p1: Int) {
    }

    override fun onMapCenterChange(p0: NMapView?, p1: NGeoPoint?) {
    }
}
