# FruitFresh: Aplikasi Mobile untuk Mendeteksi Kesegaran Buah

FruitFresh adalah aplikasi mobile yang dirancang untuk mendeteksi kesegaran buah menggunakan teknologi object detection YOLOv8. Proyek ini terdiri dari tiga komponen utama: aplikasi Android, model deteksi, dan skrip pelatihan model.

## Daftar Isi

- [Deskripsi Proyek](#deskripsi-proyek)
- [Struktur Proyek](#struktur-proyek)
- [Instalasi](#instalasi)
- [Penggunaan](#penggunaan)
- [Kontributor](#kontributor)
- [Lisensi](#lisensi)

## Deskripsi Proyek

FruitFresh memanfaatkan teknologi YOLOv8 untuk mendeteksi kesegaran buah melalui gambar yang diambil menggunakan aplikasi mobile. Model ini telah dilatih untuk mengenali berbagai tingkat kesegaran buah, sehingga dapat membantu pengguna dalam menentukan kualitas buah yang mereka miliki.

## Struktur Proyek

Proyek ini terdiri dari tiga folder utama:

1. **android_app**: Berisi file aplikasi Android.
2. **model**: Berisi model deteksi yang terdiri dari file `best_float32.tflite` dan `best.pt`.
3. **model_training**: Berisi skrip pelatihan model YOLOv8 dalam file `train_yolov8_object_detection_on_custom_dataset.ipynb`.

## Instalasi

### Aplikasi Android

1. Clone repository ini:
   ```bash
   git clone https://github.com/fathanshani/project-kompress15.git
   ```
2. Buka folder `android_app` menggunakan Android Studio.
3. Bangun dan jalankan aplikasi pada emulator atau perangkat Android Anda.

### Model

Model deteksi sudah tersedia dalam folder `model`. Anda bisa menggunakan file `best_float32.tflite` untuk integrasi dengan aplikasi Android.

### Pelatihan Model

Jika Anda ingin melatih ulang model, buka file Jupyter Notebook di `model_training/train_yolov8_object_detection_on_custom_dataset.ipynb` dan ikuti instruksinya.

## Penggunaan

1. Buka aplikasi FruitFresh di perangkat Android Anda.
2. Ambil foto buah yang ingin Anda deteksi.
3. Aplikasi akan menampilkan tingkat kesegaran buah berdasarkan model YOLOv8.

## Kontributor

- [fathanshani](https://github.com/fathanshani)
- [SryoAjii](https://github.com/SryoAjii)
- [abizarhaikal](https://github.com/abizarhaikal)
- [WardiansyahF](https://github.com/WardiansyahF)

## Lisensi

Proyek ini dilisensikan di bawah lisensi .... Lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.

