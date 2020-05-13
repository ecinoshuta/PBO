-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Bulan Mei 2020 pada 10.34
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_pegawai` int(11) NOT NULL,
  `nama_a` varchar(255) NOT NULL,
  `alamat_a` varchar(255) NOT NULL,
  `hp_a` varchar(255) NOT NULL,
  `posisi_a` varchar(255) NOT NULL,
  `gaji_a` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_pegawai`, `nama_a`, `alamat_a`, `hp_a`, `posisi_a`, `gaji_a`) VALUES
(123123123, 'Ahmad Kamaludin', 'Garut Sumenep', '08977654321', 'Manajer', 10000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nama_p` varchar(255) NOT NULL,
  `posisi_p` varchar(255) NOT NULL,
  `alamat_p` varchar(255) NOT NULL,
  `hp_p` varchar(255) NOT NULL,
  `gaji_p` int(11) NOT NULL,
  `jam` int(11) NOT NULL,
  `tunjakan` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_p`, `posisi_p`, `alamat_p`, `hp_p`, `gaji_p`, `jam`, `tunjakan`, `pajak`, `total`) VALUES
(123123124, 'Reza Arap', 'Office Boy', 'Bogor JAwa Barat', '085320002001', 1000000, 8, 200000, 120000, 1180000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
