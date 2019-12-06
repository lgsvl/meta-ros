# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A Python-based implementation of the rosserial protocol."
AUTHOR = "Paul Bouchier <paul.bouchier@gmail.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/rosserial_python"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosserial"
ROS_BPN = "rosserial_python"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    python-pyserial \
    rospy \
    rosserial-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    python-pyserial \
    rospy \
    rosserial-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_python/0.8.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosserial_python"
SRC_URI = "git://github.com/ros-gbp/rosserial-release;${ROS_BRANCH};protocol=https"
SRCREV = "80c4217944b85a0c01e46ff3b85c5569c9c03596"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
