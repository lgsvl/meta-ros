# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Face detection in images."
AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
ROS_AUTHOR = "Caroline Pantofaru"
HOMEPAGE = "http://ros.org/wiki/face_detector"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "face_detector"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    message-filters \
    message-generation \
    people-msgs \
    rosbag \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    message-filters \
    message-runtime \
    people-msgs \
    rosbag \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    image-transport \
    message-filters \
    message-runtime \
    people-msgs \
    rosbag \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    stereo-image-proc \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OSUrobotics/people-release/archive/release/melodic/face_detector/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/face_detector"
SRC_URI = "git://github.com/OSUrobotics/people-release;${ROS_BRANCH};protocol=https"
SRCREV = "7459a260b40c99dc7fd966dd353d384edf68859c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
