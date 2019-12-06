# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Extensible Optimization Toolset (EXOTica) is a library for defining problems for robot motion planning."
AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
ROS_AUTHOR = "Michael Camilleri"
HOMEPAGE = "https://github.com/ipab-slmc/exotica"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_core"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_core/5.0.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/exotica_core"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "ce0af4910b4c5abf1054861745fd7a7f93880f39"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
