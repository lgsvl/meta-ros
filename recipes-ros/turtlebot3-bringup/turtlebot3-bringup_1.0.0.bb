# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslaunch scripts for starting the TurtleBot3"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "diagnostic-msgs hls-lfcd-lds-driver robot-state-publisher roscpp rosserial-python sensor-msgs std-msgs turtlebot3-description turtlebot3-msgs turtlebot3-teleop"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_bringup/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "801c04a1dfeeb06b92a99142c1ab359f"
SRC_URI[sha256sum] = "2f2995dd73dca7c700142b4f424fc81ecbf522cf067da804a4bc3afb13031254"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_bringup-1.0.0-0"

inherit catkin
