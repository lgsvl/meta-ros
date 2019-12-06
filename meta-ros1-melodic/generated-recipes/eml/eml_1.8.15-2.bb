# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This is an implementation of the EtherCAT master protocol for the PR2       robot based on the work done at Flanders' Mechatronics Technology Centre."
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Austin Hendrix"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Binary-Only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=a99890d7e16071ac30156cdebd292056"

ROS_CN = "eml"
ROS_BPN = "eml"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/eml-release/archive/release/melodic/eml/1.8.15-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/eml"
SRC_URI = "git://github.com/ros-gbp/eml-release;${ROS_BRANCH};protocol=https"
SRCREV = "4ec7193b06f0c82c8ff271fdebd98088a85598a7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
