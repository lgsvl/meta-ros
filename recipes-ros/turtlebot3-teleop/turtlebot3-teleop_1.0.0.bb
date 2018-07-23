# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides teleoperation using keyboard for TurtleBot3."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs rospy"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_teleop/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2c1a27119b391c30893a356ad70ca0e"
SRC_URI[sha256sum] = "2d68d1b24b1c70ddde427bfad42da15ea2a83a3e1bb27e6ae0f8d9c4c31540e6"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_teleop-1.0.0-0"

inherit catkin
