package com.tistory.dayglo.navermapstest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nhn.android.maps.NMapView
import com.nhn.android.maps.maplib.NGeoPoint
import com.nhn.android.maps.nmapmodel.NMapError
import kotlinx.android.synthetic.main.fragment_naver_map.view.*

class NaverMapFragment: NMapFragment() {
    lateinit var mNMapView: NMapView

    val NAVER_CLIENT_ID = "YceZxb6koyCy9QBiDPMh"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val mView = inflater.inflate(R.layout.fragment_naver_map, container, false)

        mNMapView = mView.naver_map_view as NMapView
        mNMapView.setClientId(NAVER_CLIENT_ID)

        return mView
    }
}
