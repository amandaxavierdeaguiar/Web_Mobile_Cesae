package com.example.apigooglemaps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apigooglemaps.databinding.ActivityPosicaoMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class PosicaoMaps : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPosicaoMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPosicaoMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val serralves = LatLng(41.157780, -8.652710)
        val casaDaMusica = LatLng(38.957958, -8.528630)
        val estadioDragao = LatLng(-12.146620, -44.999512)
        val mercadoBolhao = LatLng(41.151112, -8.607390)
        mMap.addMarker(MarkerOptions().position(serralves).title("Cidade do Porto"))
        mMap.addMarker(MarkerOptions().position(casaDaMusica).title("Casa da Musica"))
        mMap.addMarker(MarkerOptions().position(estadioDragao).title("Estádio do Dragão"))
        mMap.addMarker(MarkerOptions().position(mercadoBolhao).title("Mercado do Boilhão"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(serralves))
    }
}