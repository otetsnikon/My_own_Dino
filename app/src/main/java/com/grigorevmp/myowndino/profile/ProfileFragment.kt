package com.grigorevmp.myowndino.profile

import android.os.Bundle
import android.view.View
import com.grigorevmp.myowndino.common.ui.BaseFragment
import com.grigorevmp.myowndino.databinding.NavigationProfileFragmentBinding

class ProfileFragment :
    BaseFragment<NavigationProfileFragmentBinding>(NavigationProfileFragmentBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.testTextView.text = "Test"
    }

    override fun initViewModule() {
        // TODO
    }
}
