package com.example.yoshizawarei.countrybook


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val countryTV = activity!!.findViewById<TextView>(R.id.country_name)
        countryTV.setText("Canada")

//        val countryName = intent.getStringExtra("name")
//        val titleTV = findViewById<TextView>(R.id.country_name)
//        titleTV.setText(countryName)
//        val descriptionTV = findViewById<TextView>(R.id.country_description)
//        descriptionTV.setText("")
    }

    fun setDetails(country: String) {
        val countryTV = activity!!.findViewById<TextView>(R.id.country_name)
        countryTV.setText(country)
    }

} // Required
