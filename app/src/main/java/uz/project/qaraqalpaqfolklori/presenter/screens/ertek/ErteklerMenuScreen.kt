package uz.project.qaraqalpaqfolklori.presenter.screens.ertek

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.project.qaraqalpaqfolklori.Controller
import uz.project.qaraqalpaqfolklori.R
import uz.project.qaraqalpaqfolklori.databinding.ScreenMenuBinding
import uz.project.qaraqalpaqfolklori.presenter.adapter.MenuAdapter

class ErteklerMenuScreen : Fragment(R.layout.screen_menu) {
    private val binding by viewBinding(ScreenMenuBinding::bind)
    private lateinit var menuAdapter: MenuAdapter
    private val args: ErteklerMenuScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleMenu.text = args.title

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        menuAdapter = MenuAdapter(Controller.instance.getErtekList())


        val rv: RecyclerView = binding.recyclerList
        rv.adapter = menuAdapter
        rv.layoutManager = LinearLayoutManager(requireContext())


        menuAdapter.setListener {
            findNavController().navigate(
                ErteklerMenuScreenDirections.actionErteklerMenuScreenToInfoErtekScreen(
                    it,
                    args.title
                )
            )
        }

    }
}