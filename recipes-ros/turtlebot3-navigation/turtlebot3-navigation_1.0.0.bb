# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The turtlebot3_navigation provides roslaunch scripts for starting the navigation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "amcl map-server move-base turtlebot3-bringup"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_navigation/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d5e59ce2df5977067da9e2a6bcaf23a"
SRC_URI[sha256sum] = "1d18623de2f998a2dd750282474e4ed69acfb542bfca84f2a442de582b1aa25e"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_navigation-1.0.0-0"

inherit catkin
