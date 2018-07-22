# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service types: custom messages and services for TurtleBot3 packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_msgs-release/archive/release/kinetic/turtlebot3_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac701153ce4535231464c42b442cae15"
SRC_URI[sha256sum] = "d1784363fbd5e87c349d45d09b25f7c59f02d603d8fab5739d06dfd94197c589"
S = "${WORKDIR}/turtlebot3_msgs-release-release-kinetic-turtlebot3_msgs-1.0.0-0"

inherit catkin
