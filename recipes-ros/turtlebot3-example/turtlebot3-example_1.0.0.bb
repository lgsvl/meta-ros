# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides four TurtleBot3 basic example include move using interactive marker, move and stop using LDS, move to goal position, move to custom routes. The interactions node is that you can control the TurtleBot3 front and back side or rotate to goal position. The obstacle node is that when the robot meets an obstacle, it stops. The patrol node is that TurtleBot3 move to custom route. There are 3 route(square, triangle, circle) in this package. You can add your route and move the TurtleBot3. The pointop node is that you can insert goal position include distance x-axis, y-axis and angluar z-axis."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs interactive-markers message-generation message-runtime nav-msgs rospy sensor-msgs std-msgs turtlebot3-bringup turtlebot3-msgs visualization-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_example/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6169bb13a9d8fb886d53e1469508067a"
SRC_URI[sha256sum] = "9ca7fc6ac3b985f96d8ed832c5419b977f686490ab6634ee4eae66dc532bf3cc"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_example-1.0.0-0"

inherit catkin
