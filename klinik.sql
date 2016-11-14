-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2016 at 09:44 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `kd_dokter` varchar(4) NOT NULL,
  `nm_dokter` varchar(40) NOT NULL,
  `jeniskelamin` varchar(12) NOT NULL,
  `specialist` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `tlp` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `nm_dokter`, `jeniskelamin`, `specialist`, `alamat`, `tlp`, `password`) VALUES
('d2', 'susan', 'Laki-Laki', 'aa', 'jln bambu', '222', 'salammerah'),
('d4', 'kupak', 'Laki-Laki', 'ac', 'ddd', '222', 'aaa'),
('d5', 'aa', 'Laki-Laki', 'aa', 'aa', 'aaa', 'cccc'),
('D50', 'Suparman', 'Laki-Laki', 'Jantung', 'JL sd Inpres', '0813', 'salambambu'),
('d8', 'aa', 'Laki-Laki', 'cc', 'ccc', '3333', 'ccc'),
('d88', 'aa', 'Laki-Laki', 'aaa', 'aa', '222', 'aaa'),
('d90', 'aceng', 'Laki-Laki', 'bbb', 'aaa', '444', '666');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kd_obat` varchar(10) NOT NULL,
  `nm_obat` varchar(25) DEFAULT NULL,
  `jenisobat` enum('kapsul','cair','tablet') NOT NULL,
  `tglkadaluarsa` varchar(14) NOT NULL,
  `harga` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kd_obat`, `nm_obat`, `jenisobat`, `tglkadaluarsa`, `harga`) VALUES
('b1', 'insana', 'kapsul', '2016-11-03', '20000');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `kd_pasien` varchar(4) NOT NULL,
  `nm_pasien` varchar(20) NOT NULL,
  `jeniskelamin` varchar(12) NOT NULL,
  `up` varchar(22) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tlp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nm_pasien`, `jeniskelamin`, `up`, `alamat`, `tlp`) VALUES
('p1', 'Andien', 'Perempuan', '22', 'jl Sd inpres', '222');

-- --------------------------------------------------------

--
-- Table structure for table `resep`
--

CREATE TABLE `resep` (
  `index` int(11) NOT NULL,
  `kd_resep` varchar(4) NOT NULL,
  `kd_dokter` varchar(4) NOT NULL,
  `kd_pasien` varchar(4) NOT NULL,
  `jp` varchar(22) NOT NULL,
  `tglresep` varchar(14) NOT NULL,
  `kd_obat` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resep`
--

INSERT INTO `resep` (`index`, `kd_resep`, `kd_dokter`, `kd_pasien`, `jp`, `tglresep`, `kd_obat`) VALUES
(7, 'r5', 'd4', 'p1', 'aaa', '2016-11-19', 'b1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kd_dokter`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kd_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kd_pasien`);

--
-- Indexes for table `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`index`),
  ADD KEY `kd_obat` (`kd_obat`),
  ADD KEY `kd_obat_2` (`kd_obat`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kd_pasien` (`kd_pasien`),
  ADD KEY `kd_obat_3` (`kd_obat`),
  ADD KEY `kd_dokter_2` (`kd_dokter`),
  ADD KEY `kd_pasien_2` (`kd_pasien`),
  ADD KEY `kd_obat_4` (`kd_obat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `resep`
--
ALTER TABLE `resep`
  MODIFY `index` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
