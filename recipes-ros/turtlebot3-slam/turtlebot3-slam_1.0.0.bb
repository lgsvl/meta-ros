# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The turtlebot3_slam package provides roslaunch scripts for starting the SLAM"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gmapping roscpp sensor-msgs turtlebot3-bringup"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_slam/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a833f32e134fd8945f5280e803d226c7"
SRC_URI[sha256sum] = "08f975985dd24425b081919e8f163c8bcb7254ff9b99f36a56f52ae30403dc5d"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_slam-1.0.0-0"

inherit catkin
