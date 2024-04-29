package com.shadrackkipruto.expressmall.auth

import android.app.ProgressDialog
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth
import android.content.Context
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.shadrackkipruto.expressmall.model.User
import com.shadrackkipruto.expressmall.navigation.ROUT_HOME
import com.shadrackkipruto.expressmall.navigation.ROUT_LOGIN

class AuthViewModel(var navController: NavHostController, var context:Context) {
    val mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }
    fun login(context: Context, email: String, password: String) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Login successful, navigate to next screen or perform desired action
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()

                    navController.navigate(ROUT_HOME)
                } else {
                    // Login failed, display error message
                    Toast.makeText(this.context, task.exception?.message, Toast.LENGTH_SHORT).show()

                }
            }

    }
    private val firebaseAuth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    fun signUp(context: Context, email: String, password: String) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful) {
                     // Sign up successful
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUT_HOME)
                } else {
                     // Sign up failed with error message
                    Toast.makeText(this.context, task.exception?.message, Toast.LENGTH_SHORT).show()
                }
            }
    }
}