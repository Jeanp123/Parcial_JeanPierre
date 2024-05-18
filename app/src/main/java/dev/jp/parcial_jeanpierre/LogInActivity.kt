package dev.jp.parcial_jeanpierre

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dev.jp.parcial_jeanpierre.R
import java.util.logging.Handler

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //val loginLayout = findViewById<View>(R.id.main)
        //loginLayout.visibility = View.GONE

        // Mostrar la splash screen durante 3 segundos
        //android.os.Handler().postDelayed({
            // Ocultar la splash screen y mostrar la vista de login
        //    val splashLayout = findViewById<View>(R.id.splash_layout)
        //    splashLayout.visibility = View.GONE
        //    loginLayout.visibility = View.VISIBLE
        //}, 3000)

        //val user : EditText = findViewById(R.id.user)
        //val password : EditText = findViewById(R.id.password)
        //val btnIngresar : Button = findViewById(R.id.btnIngresar)

        //btnIngresar.setOnClickListener {
         //   val user : String = user.text.toString()
        //    val password : String = password.text.toString()

        //    if (user == "123" && password == "123"){
        //        val intent = Intent(this, MainActivity::class.java)
         //       startActivity(intent)
        //    }
        //    Toast.makeText(this
        //        ,"Credenciales invalidas"
        //        , Toast.LENGTH_LONG).show()
        }
    }
//}

//<RelativeLayout
//android:id="@+id/splash_layout"
//android:layout_width="match_parent"
//android:layout_height="match_parent"
//tools:layout_editor_absoluteX="174dp"
//tools:layout_editor_absoluteY="0dp">

//<ImageView
//android:id="@+id/logo"
//android:layout_width="wrap_content"
//android:layout_height="wrap_content"
//android:layout_centerInParent="true" />
//</RelativeLayout>