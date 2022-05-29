package uz.project.qaraqalpaqfolklori.domain

import com.google.firebase.firestore.FirebaseFirestore
import uz.project.qaraqalpaqfolklori.local.sharepref.SharePref

class MainRepositoryImpl(
    private val pref: SharePref,
    private var db: FirebaseFirestore
) : MainRepository {

//    override fun isSignUp(): Boolean = pref.getIsSignUp
//
//    override fun saveSignUpState(state: Boolean) {
//        pref.getIsSignUp = state
//    }
}