package com.tripujiindriyani.uts_mobile1;

import java.util.ArrayList;


public class DataHandphone {
        private static String[] NamesHp = {
                "Samsung Galaxy A50",
                "Samsung Galaxy A10",
                "Samsung Galaxy A20",
                "Samsung Galaxy A70",
                "Samsung Galaxy S9",
                "Samsung J2 Prime",
                "Samsung Galaxy A30",
                "Samsung Galaxy A9",
                "Samsung Galaxy S10",
                "Samsung Galaxy S8"
        };

        private static String[] DetailsHp = {
                "Samsung Galaxy A50 merupakan handphone HP dengan kapasitas 4000mAh dan layar 6.4\" yang dilengkapi dengan kamera belakang 25 + 8 + 5MP dengan tingkat densitas piksel sebesar 403ppi dan tampilan resolusi sebesar 1080 x 2340pixels. Dengan berat sebesar 166g, handphone HP ini memiliki prosesor Octa Core. Tanggal rilis untuk Samsung Galaxy A50: Maret 2019.",
                "Samsung Galaxy A10 telah mendarat di Indonesia, dimana pertama kali di perkenalkan pada ajang MWC 2019 akhir Februari lalu. Pada acara tersebut Samsung juga secara resmi mengumumkan kehadiran smartphone generasi terbaru dari keluarga Galaxy A series.",
                "Samsung Galaxy A20 merupakan handphone HP dengan kapasitas 3000mAh dan layar 6.4\" yang dilengkapi dengan kamera belakang 13MP dengan tingkat densitas piksel sebesar 268ppi dan tampilan resolusi sebesar 720 x 1560pixels. Dengan berat sebesar 169g, handphone HP ini memiliki prosesor Octa Core. Tanggal rilis untuk Samsung Galaxy A20: April 2019.",
                "Samsung Galaxy A70 telah resmi meluncur di Indonesia. Setelah sukses dengan seri Galaxy A50, produsen smartphone asal Korea Selatan ini secara resmi kembali memberi kejutan dengan memperkenalkan ponsel terbaru dari keluarga Galaxy A yaitu Samsung A70",
                "Samsung Galaxy S9 merupakan handphone HP dengan kapasitas 3000mAh dan layar 5.8\" yang dilengkapi dengan kamera belakang 12MP dengan tingkat densitas piksel sebesar 570ppi dan tampilan resolusi sebesar 1440 x 2960pixels. Dengan berat sebesar 163g, handphone HP ini memiliki prosesor Octa Core. Tanggal rilis untuk Samsung Galaxy S9: Februari 2018.",
                "Samsung Galaxy J2 Prime telah resmi mendarat di Indonesia, yang mana smartphone ini pertama kali diluncurkan pada November 2016 lalu. Meski terbilang produk lawas, namun hingga saat ini Samsung J2 Prime tidak pernah sepi peminat.",
                "Samsung Galaxy A30 merupakan handphone HP dengan kapasitas 4000mAh dan layar 6.4\" yang dilengkapi dengan kamera belakang 16 + 5MP dengan tingkat densitas piksel sebesar 403ppi dan tampilan resolusi sebesar 1080 x 2340pixels. Dengan berat sebesar 165g, handphone HP ini memiliki prosesor Octa Core. Tanggal rilis untuk Samsung Galaxy A30: Maret 2019",
                "Smsung Galaxy A9 dipersenjatai prosesor Snapdragon 660 octa-core 2,2 Ghz quad dan 1,8 GHz Quad. Ada dua model kapasitas yang ditawarkan yakni RAM 6 dan 8 GB dan memori internal 128 GB. ... Perangkat ini akan dijalankan dengan sitem operasi Android 8.0 Oreo. Belum ada banderol harga yang dipatok.",
                "Samsung S10 Selain berbeda dari ukuran layar, perbedaan lainnya terletak di kapasitas baterai, di mana Galaxy S8 punya baterai berkapasitas 3.000 mAh dan Galaxy S8+ hadir dengan baterai 3.500 mAh",
                "Samsung S8Duo produk tersebut hadir dengan desain layar yang disebut infinite display yang nyaris tidak memiliki bingkai (bezel) di sisi atas dan bawah. Bagian muka Galaxy S8 terlihat nyaris didominasi oleh layar. Galaxy S8 sendiri dibekali dengan layar 5,8 inci dengan dukungan resolusi 2.960 x 1.440. Sementara, Galaxy S8+ punya layar 6,2 inci dengan resolusi yang sama dengan Galaxy S8"
        };
        private static int[] ImagesHp = {
                R.drawable.samsung50,
                R.drawable.samsung10,
                R.drawable.samsung20,
                R.drawable.samsung70,
                R.drawable.samsungs9,
                R.drawable.j2prime,
                R.drawable.samsung30,
                R.drawable.samsunga9,
                R.drawable.samsungss10,
                R.drawable.samsung8
        };

        private static String[] HargaHp={
                "Rp. 4.999.000,00",
                "Rp. 2.500.000,00",
                "Rp. 2.299.000,00",
                "Rp. 4.233.000,00",
                "Rp. 21.498.000,00",
                "Rp.  2.875.000,00",
                "Rp. 6.100.000,00,",
                "Rp. 11.000.000,00",
                "Rp. 6.100.000,00,",
                "Rp. 11.000.000,00"
        };

        private static String[] fiturHp={
                "Fitur samsung galaxy A50 Triple Camera, On-screen Fingerprint, Infinity-U Design ,Long-lasting Battery & Fast Charging",
                "Fitur samsung galaxy A10Prosesor. CPU Speed 1.6GHz, 1.35GHz. CPU Type Octa-Core, Kamera. Main Camera - Resolution 13.0 MP, Memori. RAM Size (GB), Jaringan. Number of SIM Dual-SIM, Konektivitas. ANT+ Tidak, Sistem Operasi Android, Informasi Umum. Warna Black.",
                "Fitur samsung galaxy A20",
                "Fitur samsung galaxy A70",
                "Fitur samsung galaxy S9",
                "Fitur samsung galaxy J2 prime",
                "Fitur samsung galaxy A30",
                "Fitur samsung galaxy A30",
                "Fitur samsung galaxy s10Prosesor. CPU Speed 1.6GHz, 1.35GHz. CPU Type Octa-Core, Kamera. Main Camera - Resolution 13.",
                "Fitur samsung galaxy s8Prosesor. CPU Speed 1.6GHz, 1.35GHz. CPU Type Octa-Core, Kamera. Main Camera - Resolution 13."

        };

        static ArrayList<Handphone> getListData() {
            ArrayList<Handphone> list = new ArrayList<>();
            for (int position = 0; position < NamesHp.length; position++) {
                Handphone handphone = new Handphone();
                handphone.setName(NamesHp[position]);
                handphone.setDetail(DetailsHp[position]);
                handphone.setPhoto(ImagesHp[position]);
                handphone.setHarga(HargaHp[position]);
                handphone.setFitur(fiturHp[position]);
                list.add(handphone);
            }
            return list;
        }
}
