package uz.project.qaraqalpaqfolklori.presenter.screens.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.navigation.NavigationView
import org.koin.androidx.viewmodel.ext.android.viewModel
import uz.project.qaraqalpaqfolklori.NavGraphDirections
import uz.project.qaraqalpaqfolklori.R
import uz.project.qaraqalpaqfolklori.databinding.MainNavBinding
import uz.project.qaraqalpaqfolklori.presenter.main.MainViewModel

class MainFragment : Fragment(R.layout.main_nav),
    NavigationView.OnNavigationItemSelectedListener {
    private val bindingNav by viewBinding(MainNavBinding::bind)
    private val viewModel by viewModel<MainViewModel>()
    private lateinit var navDrawer: DrawerLayout


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navDrawer = bindingNav.navDrawer
        bindingNav.navView.setNavigationItemSelectedListener(this)
        bindingNav.layoutMain.btnMenu.setOnClickListener {
            navDrawer.openDrawer(GravityCompat.START)
        }


        bindingNav.layoutMain.button1.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainScreenToJumbaqMenuScreen("Jumbaqlar"))
        }
        bindingNav.layoutMain.button2.setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainScreenToJanltpashMenuScreen(
                    "Jan'ltpashlar"
                )
            )
        }
        bindingNav.layoutMain.button3.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainScreenToNaqilMenuScreen("Naqillar"))
        }
        bindingNav.layoutMain.button4.setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToAytisMenuScreen(
                    "Aytislar"
                )
            )
        }
        bindingNav.layoutMain.button5.setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToErteklerMenuScreen(
                    "Ertekler"
                )
            )
        }
        bindingNav.layoutMain.button6.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainScreenToSaltMenuScreen("Salt da'stu'r jirlari"))
        }
        bindingNav.layoutMain.button7.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainScreenToXaliqMenuScreen("Xaliq qosiqlari"))
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search_menu -> {
                navDrawer.closeDrawer(GravityCompat.START)
                findNavController().navigate(NavGraphDirections.actionGlobalSearchFragment())
            }
            R.id.share -> {
                shareApp()
            }

            R.id.rate -> {
                rateApp()
            }

            R.id.about -> {
                navDrawer.closeDrawer(GravityCompat.START)
            }
            R.id.exit -> {
                activity?.finish()
            }
        }
        return true
    }

    private fun shareApp() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        val text = """
             https://play.google.com/store/apps/details?id=${requireActivity().packageName}
             """.trimIndent()
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Share:"))
    }

    private fun rateApp() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("market://details?id=${requireActivity().packageName}")
        startActivity(intent)
    }

}
