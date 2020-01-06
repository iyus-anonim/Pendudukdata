package com.example.pendudukdata

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class Adapter_List(val mCtx: Context, val layoutResId: Int, val list: List<pendudukdata> )
    : ArrayAdapter<pendudukdata>(mCtx,layoutResId,list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(layoutResId,null)

        val RNama = view.findViewById<TextView>(R.id.LVNama)
        val RNik = view.findViewById<TextView>(R.id.LVNik)

        val user = list[position]

        RNama.text = user.nama
        RNik.text = user.nik

        return view

    }
}