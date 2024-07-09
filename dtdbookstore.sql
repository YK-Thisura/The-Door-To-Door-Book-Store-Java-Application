-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2024 at 07:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dtdbookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `id` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `name`, `author`, `quantity`) VALUES
(1, 'Beast Quest', 'Adam Blade', 25),
(2, 'To Kill a Mockingbird', 'Harper Lee', 36),
(5, 'Percy Jackson', 'Rick Riordan', 48),
(6, 'Sherlock Holmes', 'Sir Aurtor Con', 25),
(7, 'Famous Five', 'Peter Jackson', 35),
(12, 'Harry Potter', 'J.K Rollings', 56),
(13, 'Dracula Untold', 'Oliver Kane', 32),
(14, 'The Lord of the Rings', 'J.R.R. Tolkien', 42),
(15, 'The Great Gatsby', 'Scott Fitzgerald', 25),
(16, 'The Hobbit', 'J.R.R. Tolkien', 38),
(17, 'Moby Dick', ' Herman Melville', 22),
(18, 'Brave New World', 'Aldous Huxley', 28),
(19, 'Grapes of Wrath', 'John Steinbeck', 25),
(20, 'Oliver Twist', 'Jacob Franki', 56),
(21, 'The Kite Runner', 'Khaled Hosseini', 38),
(22, 'Animal Farm', 'George Orwell', 28),
(23, 'Blade Runner', 'chapmen Cris', 43),
(24, 'Blood Diamond', 'Jeniffer Lopes', 35),
(25, 'Little Women', 'Louisa May', 33),
(26, 'Life of Pi', 'Yann Martel', 10),
(27, 'Crime and Punishment', 'Fyodor Dostoevsky', 46),
(28, 'Da Vinci Code', 'Dan Brown', 13),
(29, 'Hunger Games', 'Suzanne Collins', 75),
(30, 'Anna Karenina', 'Leo Tolstoy', 52),
(31, 'Dune', 'Frank Herbert', 43),
(33, 'Titanic', 'James Cameron', 85),
(35, 'Sun Also Rises', 'Ernest Hemingway', 46),
(36, 'Rebecca', 'Daphne du Maurier', 50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
