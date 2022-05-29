package uz.project.qaraqalpaqfolklori.presenter.screens.salt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.project.qaraqalpaqfolklori.R
import uz.project.qaraqalpaqfolklori.databinding.ScreenInfoBinding

class InfoSaltScreen : Fragment(R.layout.screen_info) {

    private val binding by viewBinding(ScreenInfoBinding::bind)
    private val args: InfoSaltScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pdfView = binding.pdfViewer


        when (args.clickedItemPosition) {
            0 -> pdfView.fromAsset("salt_0.pdf").show()
            1 -> pdfView.fromAsset("salt_1.pdf").show()
            2 -> pdfView.fromAsset("salt_2.pdf").show()
            3 -> pdfView.fromAsset("salt_3.pdf").show()
            4 -> pdfView.fromAsset("salt_4.pdf").show()
        }

    }
}