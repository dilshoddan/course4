
# create databases
CREATE DATABASE IF NOT EXISTS `course4_course-serv_db`;
CREATE DATABASE IF NOT EXISTS `course4_user-serv_db`;

# create root user and grant rights
CREATE USER 'root'@'localhost' IDENTIFIED BY 'nE5kMc7JCGNqwDQM';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';