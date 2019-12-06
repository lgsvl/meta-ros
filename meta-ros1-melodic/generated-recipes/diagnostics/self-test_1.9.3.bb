# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "self_test"
AUTHOR = "Brice Rebsamen <brice.rebsamen@gmail.com>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://www.ros.org/wiki/self_test"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "diagnostics"
ROS_BPN = "self_test"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    roscpp \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/self_test/1.9.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/self_test"
SRC_URI = "git://github.com/ros-gbp/diagnostics-release;${ROS_BRANCH};protocol=https"
SRCREV = "1373e8689ae1ce6a9a00480932bb6c79e87023e9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
