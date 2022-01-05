package com.example.demoviewpager.onbording

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.demoviewpager.R
import com.example.demoviewpager.onbording.screen.firstFragment
import com.example.demoviewpager.onbording.screen.secondFragment
import com.example.demoviewpager.onbording.screen.thirdFragment




class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager,container,false)

        val fragmentList = arrayListOf<Fragment>(
            firstFragment(),
            secondFragment(),
            thirdFragment()

        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle

        )



        return view
    }

}