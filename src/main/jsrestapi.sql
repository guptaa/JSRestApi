CREATE TABLE album (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  release_year int(11) DEFAULT NULL,
  pics varchar(500) DEFAULT NULL,
  more_info varchar(1000) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;


CREATE TABLE artist (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(500) NOT NULL,
  born_on date DEFAULT NULL,
  died_on date DEFAULT NULL,
  other_names varchar(500) DEFAULT NULL,
  pics varchar(100) DEFAULT NULL,
  occupation varchar(500) DEFAULT NULL,
  activity_years varchar(100) DEFAULT NULL,
  introduction varchar(500) DEFAULT NULL,
  more_info varchar(1000) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE couplet (
  id int(11) NOT NULL AUTO_INCREMENT,
  description varchar(500) NOT NULL,
  poet int(11) DEFAULT NULL,
  singer int(11) NOT NULL,
  other_singer int(11) DEFAULT NULL,
  composer int(11) DEFAULT NULL,
  poem int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE pics (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  path varchar(100) NOT NULL,
  more_info varchar(500) DEFAULT NULL,
  album int(11) DEFAULT NULL,
  artist int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE poem (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  more_info varchar(500) DEFAULT NULL,
  album_id int(11) DEFAULT NULL,
  other_albums varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
