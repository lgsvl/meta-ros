# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D models of the TurtleBot3 for simulation and visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "urdf xacro"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_description/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2f9c5146205a04b0ed0cd1919cdf39a"
SRC_URI[sha256sum] = "19764caf10fcafed040b71b207a8e3ee5ee0348bdb024cdf4a73d00a7b10af2b"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_description-1.0.0-0"

inherit catkin
