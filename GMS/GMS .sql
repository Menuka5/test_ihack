-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 05, 2015 at 07:20 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `GMS`
--

-- --------------------------------------------------------

--
-- Table structure for table `group_details`
--

CREATE TABLE IF NOT EXISTS `group_details` (
  `group_id` int(25) NOT NULL,
  `group_name` text NOT NULL,
  `create_member_id` int(25) NOT NULL,
  `date` text NOT NULL,
  `time` text NOT NULL,
  `privacy` int(5) NOT NULL,
  `group_description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `group_member_details`
--

CREATE TABLE IF NOT EXISTS `group_member_details` (
  `group_member_details_id` int(25) NOT NULL,
  `group_id` int(25) NOT NULL,
  `group_name` text NOT NULL,
  `member_id` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `note_id` int(25) NOT NULL,
  `group_id` int(25) NOT NULL,
  `create_member_id` int(25) NOT NULL,
  `note` text NOT NULL,
  `date` text NOT NULL,
  `time` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `note_member_details`
--

CREATE TABLE IF NOT EXISTS `note_member_details` (
  `note_member_details_id` int(25) NOT NULL,
  `note_id` int(25) NOT NULL,
  `member_id` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `person_details`
--

CREATE TABLE IF NOT EXISTS `person_details` (
  `person_id` int(25) NOT NULL,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `email` text NOT NULL,
  `phone` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person_details`
--

INSERT INTO `person_details` (`person_id`, `first_name`, `last_name`, `email`, `phone`, `password`) VALUES
(1, '', 'null', 'null', 'null', 'null'),
(2, 'sda', 'null', 'null', 'null', 'null'),
(3, 'asds', 'fsdfs', 'asd@dsf.asf', '213122121', '2131'),
(4, 'dfsad', 'sdsdv', 'asd@dsf.asf', '43232', ' cv'),
(5, 'asdasd', 'das', 'asd@dsf.asf', 'dasd', 'sad'),
(6, 'janaka', 'rath', 'asd@gm.com', '1234567890', 'eb0a191797624dd3a48fa681d3061212'),
(7, 'dfsad', 'sda', 'asd@dsf.asf', '3212312131', '8af7bec30dcf9ce40205a8e4d297037d');

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `task_id` int(25) NOT NULL,
  `group_id` int(25) NOT NULL,
  `create_member_id` int(25) NOT NULL,
  `date` text NOT NULL,
  `time` text NOT NULL,
  `task` text NOT NULL,
  `task_name` text NOT NULL,
  `task_description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `task_details`
--

CREATE TABLE IF NOT EXISTS `task_details` (
  `task_details_id` int(25) NOT NULL,
  `task_id` int(25) NOT NULL,
  `member_id` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `group_details`
--
ALTER TABLE `group_details`
  ADD PRIMARY KEY (`group_id`),
  ADD KEY `create_member_id` (`create_member_id`);

--
-- Indexes for table `group_member_details`
--
ALTER TABLE `group_member_details`
  ADD PRIMARY KEY (`group_member_details_id`),
  ADD KEY `group_id` (`group_id`),
  ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `notes`
--
ALTER TABLE `notes`
  ADD PRIMARY KEY (`note_id`),
  ADD KEY `create_member_id` (`create_member_id`),
  ADD KEY `group_id` (`group_id`);

--
-- Indexes for table `note_member_details`
--
ALTER TABLE `note_member_details`
  ADD PRIMARY KEY (`note_member_details_id`),
  ADD KEY `note_id` (`note_id`),
  ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `person_details`
--
ALTER TABLE `person_details`
  ADD PRIMARY KEY (`person_id`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`task_id`),
  ADD KEY `group_id` (`group_id`),
  ADD KEY `create_member_id` (`create_member_id`);

--
-- Indexes for table `task_details`
--
ALTER TABLE `task_details`
  ADD PRIMARY KEY (`task_details_id`),
  ADD KEY `task_id` (`task_id`),
  ADD KEY `member_id` (`member_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `group_details`
--
ALTER TABLE `group_details`
  MODIFY `group_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `group_member_details`
--
ALTER TABLE `group_member_details`
  MODIFY `group_member_details_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `notes`
--
ALTER TABLE `notes`
  MODIFY `note_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `note_member_details`
--
ALTER TABLE `note_member_details`
  MODIFY `note_member_details_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `person_details`
--
ALTER TABLE `person_details`
  MODIFY `person_id` int(25) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
  MODIFY `task_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `task_details`
--
ALTER TABLE `task_details`
  MODIFY `task_details_id` int(25) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `group_details`
--
ALTER TABLE `group_details`
  ADD CONSTRAINT `group_details_ibfk_1` FOREIGN KEY (`create_member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `group_member_details`
--
ALTER TABLE `group_member_details`
  ADD CONSTRAINT `group_member_details_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `group_details` (`group_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `group_member_details_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `notes`
--
ALTER TABLE `notes`
  ADD CONSTRAINT `notes_ibfk_1` FOREIGN KEY (`create_member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `notes_ibfk_2` FOREIGN KEY (`group_id`) REFERENCES `group_details` (`group_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `note_member_details`
--
ALTER TABLE `note_member_details`
  ADD CONSTRAINT `note_member_details_ibfk_1` FOREIGN KEY (`note_id`) REFERENCES `notes` (`note_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `note_member_details_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `task_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `group_details` (`group_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `task_ibfk_2` FOREIGN KEY (`create_member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `task_details`
--
ALTER TABLE `task_details`
  ADD CONSTRAINT `task_details_ibfk_1` FOREIGN KEY (`task_id`) REFERENCES `task` (`task_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `task_details_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `person_details` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
