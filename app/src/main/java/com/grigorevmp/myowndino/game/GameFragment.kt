package com.grigorevmp.myowndino.game

import android.os.Bundle
import android.view.View
import com.grigorevmp.myowndino.common.ui.BaseFragment
import com.grigorevmp.myowndino.databinding.NavigationGameFragmentBinding

class GameFragment :
    BaseFragment<NavigationGameFragmentBinding>(NavigationGameFragmentBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.testTextView.text = "Test"
    }

    override fun initViewModule() {
        // TODO
    }
}
