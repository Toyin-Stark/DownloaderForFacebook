package ng.canon.downloaderforfacebook.Box


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ng.canon.downloaderforfacebook.R


class Home : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val v  = inflater.inflate(R.layout.home, container, false)

        return v
    }

}// Required empty public constructor
