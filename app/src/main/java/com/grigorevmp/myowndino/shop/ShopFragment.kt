package com.grigorevmp.myowndino.shop

import android.os.Bundle
import android.view.View
import com.grigorevmp.myowndino.common.ui.BaseFragment
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
