package com.example.objekwisatadisleman.data

import com.example.objekwisatasleman.R
import com.example.objekwisatasleman.model.ObjekWisataSleman

class Datasource {

    fun loadObjekWisataSleman(): List<ObjekWisataSleman> {
        return listOf<ObjekWisataSleman>(
            ObjekWisataSleman(R.string.Sendratari_ramayana, R.drawable.image1),
            ObjekWisataSleman(R.string.Tebing_Breksi, R.drawable.image2),
            ObjekWisataSleman(R.string.Museum_Gunung_merapi, R.drawable.image3),
            ObjekWisataSleman(R.string.The_lost_world_castle, R.drawable.image4),
            ObjekWisataSleman(R.string.Museum_Min_sisa_hartaku, R.drawable.image5),
            ObjekWisataSleman(R.string.Gardu_pandang_kaliurang, R.drawable.image6),
            ObjekWisataSleman(R.string.Taman_pelangi, R.drawable.image7)
        )
    }
}