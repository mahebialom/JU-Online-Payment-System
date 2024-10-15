-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2024 at 04:02 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `signup`
--

-- --------------------------------------------------------

--
-- Table structure for table `bkash`
--

CREATE TABLE `bkash` (
  `id` int(222) NOT NULL,
  `name` varchar(333) NOT NULL,
  `roll` varchar(333) NOT NULL,
  `course` varchar(333) NOT NULL,
  `phone` varchar(333) NOT NULL,
  `session` varchar(333) NOT NULL,
  `amount` varchar(333) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bkash`
--

INSERT INTO `bkash` (`id`, `name`, `roll`, `course`, `phone`, `session`, `amount`) VALUES
(4, 'MD. Mahebi Alom Dipu', '210925', 'CSE Second Year First Semester', '01797343460', '2020-21', '2000'),
(5, 'Md. Tarikul Islam', '210916', 'CSE-2-1', '01786736192', '2020-21', '1412'),
(6, 'sagor purkayastha', '386', 'CSE 2-1', '01777897654', '2020-21', '2000'),
(8, 'AUnonno', '403', 'CSE', '01676997401', '2020-2021', '0.0001'),
(9, 'hridoy', '390', 'cse', '0388484', '20-21', '1200'),
(10, 'imon', '384', 'CSE 212', '0193843090', '2022-21', '890'),
(11, 'Dipu', '210925', 'CSE', '01797343460', '2020-21', '10000'),
(12, 'Addin', '1', 'CSE', '01712597368', '2020-21', '4000'),
(13, 'alvi', '14', 'CSE', '018724828114', '2021', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(222) NOT NULL,
  `firstname` varchar(333) NOT NULL,
  `roll` varchar(333) NOT NULL,
  `username` varchar(333) NOT NULL,
  `phone` varchar(333) NOT NULL,
  `password` varchar(333) NOT NULL,
  `confirmpassword` varchar(333) NOT NULL,
  `department` varchar(333) NOT NULL,
  `dob` varchar(333) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `firstname`, `roll`, `username`, `phone`, `password`, `confirmpassword`, `department`, `dob`) VALUES
(8, 'mahi', '210921', 'mahi', '0736283633', 'jPasswordField1', 'jPasswordField1', 'cse', '20-06-2002'),
(10, 'Md. Tarikul islam', '210916', 'tarikul', '01786836192', '4321', '4321', 'CSE', '05-08-2002'),
(11, 'sagor purkayastha', '210906', 'sagor', '017777897654', '9999', '9999', 'cse', '08-06-2002'),
(12, 'Aunonno Farhan', '210923', 'Aunonno', '01676997401', '1234', '1234', 'CSE', '14/03/2002'),
(13, 'hridoy', '210910', 'hr', '1234', '123', '123', 'cse', '233445'),
(14, 'MD. IMON JAHAN', '210904', 'imon', '0198993489', 'imon', 'imon', 'CSE', '9/04/2002'),
(15, 'Md. Mahebi AlomDipu', '210925', 'mahebialom', '01797343460', '1234', '1234', 'CSE', '08-06-2000'),
(16, 'Nahian Islam Addin', '8112023027', 'nahianaddin', '017813612735', '1234', '1234', 'Cricket', '05-10-08'),
(17, 'Alvi', '14', 'alvi', '01934658908', '1234', '1234', 'SChool', '1314');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bkash`
--
ALTER TABLE `bkash`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bkash`
--
ALTER TABLE `bkash`
  MODIFY `id` int(222) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(222) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
