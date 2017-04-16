-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 15, 2016 at 08:11 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `deliverysystemdb`
--
CREATE DATABASE IF NOT EXISTS `deliverysystemdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `deliverysystemdb`;

-- --------------------------------------------------------

--
-- Table structure for table `admintable`
--

DROP TABLE IF EXISTS `admintable`;
CREATE TABLE IF NOT EXISTS `admintable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admintable`
--

INSERT INTO `admintable` (`username`, `password`) VALUES
('admin', '2611');

-- --------------------------------------------------------

--
-- Table structure for table `areatable`
--

DROP TABLE IF EXISTS `areatable`;
CREATE TABLE IF NOT EXISTS `areatable` (
  `countryname` varchar(100) NOT NULL,
  `statename` varchar(100) NOT NULL,
  `cityname` varchar(100) NOT NULL,
  `area` varchar(200) NOT NULL,
  `shipcharges` int(100) NOT NULL,
  `mincharges` int(100) NOT NULL,
  PRIMARY KEY (`area`),
  KEY `countryname` (`countryname`,`statename`,`cityname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `areatable`
--

INSERT INTO `areatable` (`countryname`, `statename`, `cityname`, `area`, `shipcharges`, `mincharges`) VALUES
('India', 'Punjab', 'Ludhiana', 'model town', 55, 0),
('India', 'Punjab', 'Jalandhar', 'ue', 55, 0),
('India', 'Punjab', 'Jalandhar', 'ue1', 35, 0);

-- --------------------------------------------------------

--
-- Table structure for table `boyeducation`
--

DROP TABLE IF EXISTS `boyeducation`;
CREATE TABLE IF NOT EXISTS `boyeducation` (
  `empid` int(100) NOT NULL,
  `tenmarks` double NOT NULL,
  `twelvemarks` double NOT NULL,
  `gradmarks` double NOT NULL,
  `tenyear` int(100) NOT NULL,
  `twelveyear` int(100) NOT NULL,
  `gradyear` int(100) NOT NULL,
  `teninst` varchar(100) NOT NULL,
  `twelveinst` varchar(100) NOT NULL,
  `gradinst` varchar(100) NOT NULL,
  KEY `empid` (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boyeducation`
--

INSERT INTO `boyeducation` (`empid`, `tenmarks`, `twelvemarks`, `gradmarks`, `tenyear`, `twelveyear`, `gradyear`, `teninst`, `twelveinst`, `gradinst`) VALUES
(2394, 91.4, 91.2, 70, 2009, 2011, 2017, 'KV', 'MGN', 'GMC ');

-- --------------------------------------------------------

--
-- Table structure for table `boypersonal`
--

DROP TABLE IF EXISTS `boypersonal`;
CREATE TABLE IF NOT EXISTS `boypersonal` (
  `empid` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `fathername` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(500) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `age` int(100) NOT NULL,
  `bgroup` varchar(100) NOT NULL,
  `photo` varchar(100) NOT NULL,
  `qualification` varchar(100) NOT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boypersonal`
--

INSERT INTO `boypersonal` (`empid`, `name`, `fathername`, `phone`, `address`, `gender`, `dob`, `age`, `bgroup`, `photo`, `qualification`) VALUES
(2394, 'ASHMITA', 'RAJPAUL SIKKA', '9876209825', 'PATIALA', 'Female', '1994-03-02', 22, 'B+', 'image\\default.jpg', 'MBBS');

-- --------------------------------------------------------

--
-- Table structure for table `boyprof`
--

DROP TABLE IF EXISTS `boyprof`;
CREATE TABLE IF NOT EXISTS `boyprof` (
  `empid` int(100) NOT NULL,
  `doj` date NOT NULL,
  `salary` double NOT NULL,
  `exp` varchar(100) NOT NULL,
  `cname` varchar(300) NOT NULL,
  `yexp` double NOT NULL,
  KEY `empid` (`empid`),
  KEY `empid_2` (`empid`),
  KEY `empid_3` (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boyprof`
--

INSERT INTO `boyprof` (`empid`, `doj`, `salary`, `exp`, `cname`, `yexp`) VALUES
(2394, '2016-07-12', 100000, 'Yes', 'AMAZON', 2);

-- --------------------------------------------------------

--
-- Table structure for table `categorytable`
--

DROP TABLE IF EXISTS `categorytable`;
CREATE TABLE IF NOT EXISTS `categorytable` (
  `categoryname` varchar(100) NOT NULL,
  PRIMARY KEY (`categoryname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categorytable`
--

INSERT INTO `categorytable` (`categoryname`) VALUES
('Education'),
('Others'),
('Sports');

-- --------------------------------------------------------

--
-- Table structure for table `citytable`
--

DROP TABLE IF EXISTS `citytable`;
CREATE TABLE IF NOT EXISTS `citytable` (
  `countryname` varchar(100) NOT NULL,
  `statename` varchar(100) NOT NULL,
  `cityname` varchar(100) NOT NULL,
  KEY `countryname` (`countryname`),
  KEY `statename` (`statename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `citytable`
--

INSERT INTO `citytable` (`countryname`, `statename`, `cityname`) VALUES
('India', 'Punjab', 'Jalandhar'),
('India', 'Punjab', 'Ludhiana');

-- --------------------------------------------------------

--
-- Table structure for table `countrytable`
--

DROP TABLE IF EXISTS `countrytable`;
CREATE TABLE IF NOT EXISTS `countrytable` (
  `countryname` varchar(100) NOT NULL,
  PRIMARY KEY (`countryname`),
  KEY `countryname` (`countryname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `countrytable`
--

INSERT INTO `countrytable` (`countryname`) VALUES
('America'),
('China'),
('India'),
('Pakistan');

-- --------------------------------------------------------

--
-- Table structure for table `emplogin`
--

DROP TABLE IF EXISTS `emplogin`;
CREATE TABLE IF NOT EXISTS `emplogin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emplogin`
--

INSERT INTO `emplogin` (`username`, `password`) VALUES
('ankit', '0181'),
('ashmita', '0181'),
('rajpaul', '1159'),
('suresh', '1159');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `empid` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `qual` varchar(100) NOT NULL,
  `doj` date NOT NULL,
  `photo` varchar(100) NOT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ordertable`
--

DROP TABLE IF EXISTS `ordertable`;
CREATE TABLE IF NOT EXISTS `ordertable` (
  `orderno` int(100) NOT NULL,
  `orderdate` date NOT NULL,
  `countryname` varchar(100) NOT NULL,
  `statename` varchar(100) NOT NULL,
  `cityname` varchar(100) NOT NULL,
  `areaname` varchar(100) NOT NULL,
  `categoryname` varchar(100) NOT NULL,
  `goodsname` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `houseno` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `weight` double NOT NULL,
  PRIMARY KEY (`orderno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ordertable`
--

INSERT INTO `ordertable` (`orderno`, `orderdate`, `countryname`, `statename`, `cityname`, `areaname`, `categoryname`, `goodsname`, `price`, `status`, `houseno`, `phone`, `cname`, `weight`) VALUES
(1, '2016-07-07', 'India', 'Punjab', 'Jalandhar', 'ue', 'Sports', 'Bat', 55, 'Pending', '', '', '', 0),
(3, '2016-07-11', 'India', 'Punjab', 'Jalandhar', 'ue', 'Sports', 'Bat', 55, 'Completed', '1159', '987', '', 0),
(245, '2016-07-13', 'India', 'Punjab', 'Ludhiana', 'model town', 'Others', 'refe', 55, 'Pending', '45', '5454', '', 0),
(2293488, '2016-07-15', 'India', 'Punjab', 'Jalandhar', 'ue', 'Education', 'book', 27, 'Completed', '1159', '8559', 'ankit', 1);

-- --------------------------------------------------------

--
-- Table structure for table `statetable`
--

DROP TABLE IF EXISTS `statetable`;
CREATE TABLE IF NOT EXISTS `statetable` (
  `countryname` varchar(100) NOT NULL,
  `statename` varchar(100) NOT NULL,
  PRIMARY KEY (`statename`),
  KEY `countryname` (`countryname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `statetable`
--

INSERT INTO `statetable` (`countryname`, `statename`) VALUES
('China', 'Beijing'),
('India', 'Gujrat'),
('India', 'Haryana'),
('India', 'Punjab');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
CREATE TABLE IF NOT EXISTS `vehicle` (
  `no` varchar(100) NOT NULL,
  `comp` varchar(100) NOT NULL,
  `eng` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `wheeler` varchar(100) NOT NULL,
  `dor` date NOT NULL,
  `chasis` varchar(100) NOT NULL,
  `col` varchar(100) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `boyeducation`
--
ALTER TABLE `boyeducation`
  ADD CONSTRAINT `myconstraint` FOREIGN KEY (`empid`) REFERENCES `boypersonal` (`empid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `boyprof`
--
ALTER TABLE `boyprof`
  ADD CONSTRAINT `myconstraint1` FOREIGN KEY (`empid`) REFERENCES `boypersonal` (`empid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `citytable`
--
ALTER TABLE `citytable`
  ADD CONSTRAINT `cons2` FOREIGN KEY (`countryname`) REFERENCES `countrytable` (`countryname`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cons3` FOREIGN KEY (`statename`) REFERENCES `statetable` (`statename`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `statetable`
--
ALTER TABLE `statetable`
  ADD CONSTRAINT `cons1` FOREIGN KEY (`countryname`) REFERENCES `countrytable` (`countryname`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
