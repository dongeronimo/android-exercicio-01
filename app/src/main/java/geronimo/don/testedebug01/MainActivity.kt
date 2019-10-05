package geronimo.don.testedebug01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//Esse programa pega dois textos e os combina, colocando o 2o texto depois do primeiro.
//Você deve descobrir porque não está funcionando e corrigir
//O funcionamento esperado do programa é o usuário infomar o texto 1 e o texto2, clicar no botão e os textos serem concatenados.
class MainActivity : AppCompatActivity() {
    val texto2:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.btnCombinar.setOnClickListener(::clickNoBotão)
    }

    fun clickNoBotão(v:String){
        this.texto1 = this.edtTexto1.text
        this.texto2 = this.edtTexto1.text
        val resultado = this.texto1 + this.edtTexto2
        tvSaida.setText(resultado)
    }
}
