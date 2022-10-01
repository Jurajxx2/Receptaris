package com.trasim.utils.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.trasim.utils.databinding.ViewComponentRecipeBinding

class RecipeViewComponent @kotlin.jvm.JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var binding = ViewComponentRecipeBinding.inflate(LayoutInflater.from(context), this, true)
}