package uz.project.qaraqalpaqfolklori.presenter.screens.ertek

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.project.qaraqalpaqfolklori.R
import uz.project.qaraqalpaqfolklori.databinding.ScreenInfoBinding

class InfoErtekScreen : Fragment(R.layout.screen_info) {

    private val binding by viewBinding(ScreenInfoBinding::bind)
    private val args: InfoErtekScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val pdfView = binding.pdfViewer

        when (args.clickedItemPosition) {
            0 -> pdfView.fromAsset("ertek_3.pdf").show()
            1 -> pdfView.fromAsset("ertek_4.pdf").show()
            2 -> pdfView.fromAsset("ertek_5.pdf").show()
            3 -> pdfView.fromAsset("ertek_6.pdf").show()
            4 -> pdfView.fromAsset("ertek_7.pdf").show()
            5 -> pdfView.fromAsset("ertek_8.pdf").show()


        }

    }
}