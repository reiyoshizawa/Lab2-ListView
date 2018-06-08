package com.example.yoshizawarei.countrybook


import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val gridLayout = activity!!.findViewById<GridLayout>(R.id.country_grid)
        for (i in 0 until gridLayout.childCount) {
            val imageButton = gridLayout.getChildAt(i)
            imageButton.setOnClickListener { view ->

                // portrait
                if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    val intent = Intent(activity, DetailActivity::class.java)
                    intent.putExtra("name", imageButton.tag.toString())
                    startActivity(intent)
                } else {
                    // landscape
                    // 1. get ref of detail frag
                    val detailFrag = activity!!.fragmentManager.findFragmentById(R.id.frag_detail) as DetailFragment
                    // 2. set
                    detailFrag.setDetails(imageButton.tag.toString())

                }
            }
        }
    }


}
