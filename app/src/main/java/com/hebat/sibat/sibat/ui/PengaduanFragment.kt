package com.hebat.sibat.sibat.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hebat.sibat.sibat.R


class PengaduanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_pengaduan)
        val view = inflater.inflate(R.layout.pengaduan_fragment, container, false)
        return view
    }

}
