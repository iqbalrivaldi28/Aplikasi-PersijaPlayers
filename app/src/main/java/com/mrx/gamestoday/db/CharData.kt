package com.mrx.gamestoday.db

import com.mrx.gamestoday.R
import com.mrx.gamestoday.model.GenshinChar

object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Andritany Ardiansyah",
                    "Main: 26",
                    "Menit Main: 2340",
                    "Andritany adalah kiper nomor satu persija yang sudan memperkuat persija lebih dari 10 tahun. Kiper berusia 31 tahun ini selalu menjadi andalan persija dalam beberapa waktu tahun terakhir. Dan dia sudah mempersembahkan piala kepada persija seperti juara liga 1 tahun 2018 dan jjuara piala presiden 2021",
                    "0",
                    "0",
                    R.drawable.albedo,
                    R.drawable.albedobg,
                    R.drawable.geo,
                    "https://persija.id/tim-persija/andritany-ardhiyasa"
            ),
            arrayOf(
                    "Abdulla Yusuf Helal",
                    "Main: 17",
                    "Menit Main: 1247",
                    "Abdulla yusuf adalah pemain asal negara bahrain yang berposisi sebagai pemain penyerang atau striker, pemain ini memiliki kecapatan dan akuran tembakan yang cukup akurat. Hal itu terbuktu dia telah mencetak gol sebanyak 9 gol dalam 17 kali penampilannya musim ini bersama persija jakarta",
                    "9",
                    "1",
                    R.drawable.childe,
                    R.drawable.childebg,
                    R.drawable.hydro,
                    "https://persija.id/tim-persija/abdulla-yusuf-helal"
            ),
            arrayOf(
                    "Hansamu Yama Pranata",
                    "Main: 18",
                    "Menit Main: 1491",
                    "Hansamu Yama Pranata adalah pemain jebolan timnas u19 yang seangkatan dengan evan dimas. Dia dikenal sebagai pemain defender yang kokoh dan memiliki pertahan yang baik. Selain bertahan dia kerap mencetak gol melalui sundulan tendangan sudut ataupun tendangan bebas",
                    "2",
                    "0",
                    R.drawable.diluc,
                    R.drawable.dilucbg,
                    R.drawable.pyro,
                    "https://persija.id/tim-persija/hansamu-yama-pranata"
            ),
            arrayOf(
                    "Witan Sulaiman",
                    "Main: 4",
                    "Menit Main: 182",
                    "Witan adalah pemain rekutran teranyar persija jakarta bulan januari kemarin, dia di beli dari salah satu klub di polandia. Sejauh ini dia sudah di mainkan sebanyak 4 ppertandingan oleh pelatih namum belum berhasil mencatak gol perdananya bersama persija. Namun kehadiran witan menambah daya serang persija saat ini",
                    "0",
                    "0",
                    R.drawable.ganyu,
                    R.drawable.ganyubg,
                    R.drawable.cryo,
                    "https://persija.id/tim-persija/witan-sulaeman"
            ),
            arrayOf(
                    "Hanno Behrens",
                    "Main: 18",
                    "Menit Main: 1414",
                    "Pemain asal jerman ini memiliki skill bermaiin dan cukup efektive, meskipun kelincahan dalam berlari sedikit kurang baik. Namun akurasi tembakan dan skill individunya sangat baik, hal ini trebukti dia telah mencetak 5 gol dan 1 assist bersama persija musim ini",
                    "5",
                    "1",
                    R.drawable.hutao,
                    R.drawable.hutaobg,
                    R.drawable.pyro,
                    "https://persija.id/tim-persija/hanno-behrens"
            ),
            arrayOf(
                    "Syahrian Abimanyu",
                    "Main: 12",
                    "Menit Main: 955",
                    "Pemain ini terkenal dengan kelincahan dan kecepatannya serta penetrasinya yang baik dalam membangun serangan. Untuk musim ini dia belum berhasil mencetak gol tetapi berhasil memberikan 2 assit untuk perija jakarta. Dan kehadiran abimanyu memberikan warna tersendiri kepada persija",
                    "0",
                    "2",
                    R.drawable.jean,
                    R.drawable.jeanbg,
                    R.drawable.anemo,
                    "https://persija.id/tim-persija/syahrian-abimanyu"
            ),
            arrayOf(
                    "Hanif Sjahbandi",
                    "Main: 22",
                    "Menit Main: 1370",
                    "Pemain tengah satu ini memiliki akurasi umpan yang baik dan ini lah yang membuat dia selalu diberikan kesempatan bermain. Pada musim ini hanif sudah mengoleksi 1 gol san satu assist untuk persija.",
                    "1",
                    "1",
                    R.drawable.keqing,
                    R.drawable.keqingbg,
                    R.drawable.electro,
                    "https://persija.id/tim-persija/hanif-abdurauf-sjahbandi"
            ),
            arrayOf(
                    "Firza Andika",
                    "Main: 24",
                    "Menit Main: 1866",
                    "Pemain bertahan satu ini memiliki keceptan yang cukup baik, selain pandai dalam bertahan firza andika juga kerap membantu penyerangan persija dari sisi sayap. Pada musim ini dia telah mencetak 1 gol dan satu assist",
                    "1",
                    "1",
                    R.drawable.klee,
                    R.drawable.kleebg,
                    R.drawable.pyro,
                    "https://persija.id/tim-persija/firza-andika"
            ),
            arrayOf(
                    "Michael Krmenchik",
                    "Main: 18",
                    "Menit Main: 1220",
                    "Pemain asal Republik Ceko ini memiliki kemampuan yang baik dan effisien ketika menyerang. Hal ini terbukti dia telah berhasil mencetak 6 gol dan 1 assit pada musim ini, dia juga memiliki akurasi tembakan yang baik dalam bola mati",
                    "6",
                    "1",
                    R.drawable.mona,
                    R.drawable.monabg,
                    R.drawable.hydro,
                    "https://persija.id/tim-persija/michael-krmencik"
            ),
            arrayOf(
                    "Ondrej Kudela",
                    "Main: 24",
                    "Menit Main: 2115",
                    "Onrek Kudela berasal dari negara Republik Ceko sama seperti  Krmenchik, pemain bertahan ini merupakan pemain yang sudah cukup senior di persija saat ini. Mengingat banyak pemain persija sekarang berusia di bawah 25 tahun. Pemain  ini terkenal dengan pertahanannya yang kokoh",
                    "2",
                    "0",
                    R.drawable.qiqi,
                    R.drawable.qiqibg,
                    R.drawable.cryo,
                    "https://persija.id/tim-persija/ondrej-kudela"
            ),
            arrayOf(
                    "Adre Arido Geovani",
                    "Main: 0",
                    "Menit Main: 0",
                    "Kiper muda ini baru berusia 18 tahun, dia merupakan kiper lapis persija yang merupakan hasil dari akademi sepak bola persija jakarta. Dia berhasil masuk ke tim senior persija namun belum di berikan menit bermain oleh sang pelatih",
                    "0",
                    "0",
                    R.drawable.venti,
                    R.drawable.ventibg,
                    R.drawable.anemo,
                    "https://persija.id/tim-persija/adre-arido-geovani"
            ),
            arrayOf(
                    "Muhammad Ferari",
                    "Main: 13",
                    "Menit Main: 1095",
                    "Pemain defender satu ini kerap masuk ke dalam jajaran squad timnas indonesia. Dia dikenal dengan kdecepatan dan jejalahnya yang luas. Ferari musim ini belum mencetak gol namun sudah memberikan satu assit musim ini",
                    "0",
                    "1",
                    R.drawable.xiao,
                    R.drawable.xiaobg,
                    R.drawable.anemo,
                    "https://persija.id/tim-persija/muhammad-ferarri"
            ),
            arrayOf(
                    "Ilham Rio Fahmi",
                    "Main: 16",
                    "Menit Main: 903",
                    "Perija memiliki beberapa defender muda yang lincah, dan salah satunya adalah rio fahmi. Musim ini dia telah berhasil mencetak gol perdananya bersama persija jakarta",
                    "1",
                    "0",
                    R.drawable.zhongli,
                    R.drawable.zhonglibg,
                    R.drawable.geo,
                    "https://persija.id/tim-persija/ilham-rio-fahmi"
            )
    )

    val listData: ArrayList<GenshinChar>
        get(){
                val list = ArrayList<GenshinChar>()
                for (data in database) {
                        val genshinChar = GenshinChar()
                        genshinChar.name = data[0] as String
                        genshinChar.visions = data[1] as String
                        genshinChar.affiliation = data[2] as String
                        genshinChar.bio = data[3] as String
                        genshinChar.birth = data[4] as String
                        genshinChar.weapon = data[5] as String
                        genshinChar.pic = data[6] as Int
                        genshinChar.background = data[7] as Int
                        genshinChar.element = data[8] as Int
                        genshinChar.charlink = data[9] as String

                        list.add(genshinChar)
                }
                return list
        }
}