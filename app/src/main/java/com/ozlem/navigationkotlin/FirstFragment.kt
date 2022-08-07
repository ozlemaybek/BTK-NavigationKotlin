package com.ozlem.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
// Fragment ve XML arasındaki senkronizasyonu sağlamak için:
import kotlinx.android.synthetic.main.fragment_first.button1ID


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    // Bu fonksiyon; bütün görünümler oluşturulduktan sonra çağrılıyor:
    // Bu yüzden fragment'taki buton işlemini burada yapacağız.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1ID.setOnClickListener {
            // Şimdi bir action (aksiyon) oluşturacağız:
            // Bu iki satır sayesinde artık butona bastığımızda ikinci fragment'a geçiş yapılacak:
            // parantez içinde ikinci fragment'a veri yolladık
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("aybek")
            Navigation.findNavController(it).navigate(action)
        }
    }

}