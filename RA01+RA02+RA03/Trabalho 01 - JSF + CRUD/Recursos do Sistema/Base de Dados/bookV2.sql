-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 16-Nov-2020 às 03:58
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bookv2`
--

CREATE TABLE `bookv2` (
  `ID` int(11) NOT NULL,
  `name` varchar(254) NOT NULL,
  `author` varchar(254) NOT NULL,
  `coAuthor` varchar(100) DEFAULT NULL,
  `isbn` varchar(100) DEFAULT NULL,
  `category` varchar(254) NOT NULL,
  `year` int(11) DEFAULT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `bookv2`
--

INSERT INTO `bookv2` (`ID`, `name`, `author`, `coAuthor`, `isbn`, `category`, `year`, `price`) VALUES
(1, 'Livro 1', 'Autor 1', NULL, NULL, 'Categoria 1', 2017, 10),
(2, 'Livro 2', 'Autor 2', 'CoAutor 2', 'ISBN 2', 'Categoria 2', 2018, 20),
(4, 'Livro 3', 'Autor 3', NULL, NULL, 'Categoria 3', 2016, 20.5),
(5, 'Livro 4', 'Autor 4', 'CoAutor 4', 'ISBN 4', 'Categoria 4', 2015, 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookv2`
--
ALTER TABLE `bookv2`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookv2`
--
ALTER TABLE `bookv2`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
