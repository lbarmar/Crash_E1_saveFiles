package dam.pmdm.gestionficheroscrash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dam.pmdm.gestionficheroscrash.databinding.FragmentPlayerBinding
import java.io.File

class PlayerFragment : Fragment() {

    private lateinit var binding: FragmentPlayerBinding
    private lateinit var jsonFile: File
    private  var first = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayerBinding.inflate(inflater, container, false)

//        Crea un archivo 'player_data.json' en el directorio de archivos internos de la aplicación
        jsonFile = File(requireContext().filesDir, "player_data.json")

        binding.player = readPlayerFromFile()

        binding.saveButton.setOnClickListener { saveData() }

        return binding.root
    }

//        Convierte el objeto 'binding.player' en un JSON
//        Guardalo en un archivo
//        Muestra un mensaje de éxito o error
    private fun saveData() {
    }

//    Verifica si existe el archivo 'player_data.json' en el sistema de archivos
//    Si el archivo no existe, crea un archivo con datos predeterminados llamando a 'createFile()'
//    Devuelve el objeto
    private fun readPlayerFromFile(): Player {
    }

//    Crea un objeto 'Player' con datos iniciales predeterminados
//    Asigna ese objeto a tu binding.player
//    Llama a la función saveData
    private fun createFile() {
    }

}