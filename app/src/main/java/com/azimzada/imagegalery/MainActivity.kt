package com.azimzada.imagegalery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimzada.imagegalery.data.ImageDTO
import com.azimzada.imagegalery.databinding.ActivityMainBinding
 //  esas
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // lateint ile val ola bilmez
    var imageList = mutableListOf<ImageDTO>(
        ImageDTO(R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background),
        ImageDTO(R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background),
        ImageDTO(R.drawable.ic_launcher_foreground , R.drawable.ic_launcher_background)

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()
    }

    fun setUpRecyclerView() {
        var adapter = MyCustomAdapter(imageList)
        /*
      *
      * Sondaki false gelen melumati ters cevirmeyin qarsini alir
      *
      *
       */
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val layoutHor = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false)
        binding.recycleView.layoutManager = layoutManager
        binding.recycleView.adapter = adapter
//

        binding.recycleView2.layoutManager = layoutHor
        binding.recycleView2.adapter = adapter


    }

}