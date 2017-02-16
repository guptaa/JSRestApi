CREATE DATABASE `jagjit_singh` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tittle` varchar(100) DEFAULT NULL,
  `year` varchar(4) DEFAULT NULL,
  `singer` varchar(100) DEFAULT NULL,
  `lyricist` varchar(100) DEFAULT NULL,
  `picture` int(11) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `album_ghazal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album` int(11) DEFAULT NULL,
  `ghazal` int(11) DEFAULT NULL,
  `pcture` int(11) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL,
  `born_on` date DEFAULT NULL,
  `died_on` date DEFAULT NULL,
  `other_names` varchar(500) DEFAULT NULL,
  `picture` int(10) DEFAULT NULL,
  `occupation` varchar(500) DEFAULT NULL,
  `activity_years` varchar(100) DEFAULT NULL,
  `introduction` varchar(500) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ghazal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tittle` varchar(100) DEFAULT NULL,
  `singer` varchar(100) DEFAULT NULL,
  `composer` varchar(100) DEFAULT NULL,
  `picture` int(11) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ghazal_sher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sher` int(11) DEFAULT NULL,
  `ghazal` int(11) DEFAULT NULL,
  `pcture` int(11) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `picture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tittle` varchar(100) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(500) DEFAULT NULL,
  `more_info` varchar(1000) DEFAULT NULL,
  `lyricist` int(11) DEFAULT NULL,
  `singer` int(11) DEFAULT NULL,
  `pcture` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
