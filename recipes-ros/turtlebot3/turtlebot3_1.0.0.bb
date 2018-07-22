# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the Turtlebot3 (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "turtlebot3-bringup turtlebot3-description turtlebot3-navigation turtlebot3-slam turtlebot3-teleop"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/${PN}/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ee50b919fa06aa5b7223fcf5de044c7"
SRC_URI[sha256sum] = "b20d5793baea8b55f6766cdd4b6ce5687a4fb0e3cf8ea74a879d725e351c5215"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.0-0"

inherit catkin
