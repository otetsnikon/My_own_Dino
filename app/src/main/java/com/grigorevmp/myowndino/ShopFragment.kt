package com.grigorevmp.myowndino

import android.os.Bundle
import android.view.View
import com.grigorevmp.myowndino.databinding.NavigationShopFragmentBinding

class ShopFragment :
    BaseFragment<NavigationShopFragmentBinding>(NavigationShopFragmentBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.testTextView.text = "Test"
    }

    override fun initViewModule() {
        // TODO
    }
}
