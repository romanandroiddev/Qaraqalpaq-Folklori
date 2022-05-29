package uz.project.qaraqalpaqfolklori

import uz.project.qaraqalpaqfolklori.local.data.MenuData
import java.util.*

class Controller private constructor() {
    companion object {
        var instance: Controller = Controller()
    }

    private val erteklerList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val jumbaqlarList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val saltList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val naqilList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val janltpashList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val aytisList: ArrayList<MenuData> = ArrayList<MenuData>()
    private val xaliqQosiqList: ArrayList<MenuData> = ArrayList<MenuData>()

    fun loadErtekData() {
        erteklerList.add(MenuData("Tıyın"))
        erteklerList.add(MenuData("Sheshen bala"))
        erteklerList.add(MenuData("Túlki, tasbaqa hám taskene"))
        erteklerList.add(MenuData("Miynet penen tabılǵan aqsha"))
        erteklerList.add(MenuData("Aldar kóse, Muxtar kóse, Duxtar kóse"))
        erteklerList.add(MenuData("Sumlıǵı basına jetken túlki"))
    }


    fun loadSaltData() {
        saltList.add(MenuData("Bádik"))
        saltList.add(MenuData("Bet ashar 1"))
        saltList.add(MenuData("Bet ashar 2"))
        saltList.add(MenuData("Báyit"))
        saltList.add(MenuData("Gúlapsan"))
    }

    fun loadJumbaqData() {
        jumbaqlarList.add(MenuData("1 - bólim"))
        jumbaqlarList.add(MenuData("2 - bólim"))
        jumbaqlarList.add(MenuData("3 - bólim"))
        jumbaqlarList.add(MenuData("4 - bólim"))
        jumbaqlarList.add(MenuData("5 - bólim"))
    }

    fun loadNaqilData() {
        naqilList.add(MenuData("Miynet haqqında"))
        naqilList.add(MenuData("Diyqanshılıq haqqında"))
        naqilList.add(MenuData("Sharwashılıq haqqında"))
        naqilList.add(MenuData("Balıqshılıq haqqında"))
        naqilList.add(MenuData("Ańshılıq haqqında"))
    }

    fun loadJanltpashData() {
        janltpashList.add(MenuData("1 - bólim"))
        janltpashList.add(MenuData("2 - bólim"))
        janltpashList.add(MenuData("3 - bólim"))
    }

    fun loadAytisData() {
        aytisList.add(MenuData("Qız jigitler aytısı"))
        aytisList.add(MenuData("Otırıspa aytısları"))
        aytisList.add(MenuData("Juwap aytısları"))
        aytisList.add(MenuData("Kel tanıs"))
    }

    fun loadXaliqQosiqData() {
        xaliqQosiqList.add(MenuData("Intizarimsan"))
        xaliqQosiqList.add(MenuData("Qızlar úyge kir 1"))
        xaliqQosiqList.add(MenuData("Qızlar úyge kir 1"))
        xaliqQosiqList.add(MenuData("Jengejan"))
        xaliqQosiqList.add(MenuData("Kel kewlim"))
        xaliqQosiqList.add(MenuData("Dártińnen"))
    }

    fun loadData() {
        loadXaliqQosiqData()
        loadAytisData()
        loadJanltpashData()
        loadSaltData()
        loadErtekData()
        loadNaqilData()
        loadJumbaqData()
    }

    fun getErtekList(): ArrayList<MenuData> = erteklerList
    fun getJumbaqList(): ArrayList<MenuData> = jumbaqlarList
    fun getSaltList(): ArrayList<MenuData> = saltList
    fun getNaqilList(): ArrayList<MenuData> = naqilList
    fun getJanltpashList(): ArrayList<MenuData> = janltpashList
    fun getAytisList(): ArrayList<MenuData> = aytisList
    fun getXaliqQosiqList(): ArrayList<MenuData> = xaliqQosiqList


}