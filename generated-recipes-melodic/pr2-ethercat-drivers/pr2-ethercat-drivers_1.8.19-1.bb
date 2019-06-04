# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This stack contains drivers for the ethercat system and the peripherals     that connect to it: motor control boards, fingertip sensors, texture     projector, hand accelerometer."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Derek King"
HOMEPAGE = "http://ros.org/wiki/pr2_ethercat_drivers"
SECTION = "devel"
LICENSE = "BSD & GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_ethercat_drivers"
ROS_BPN = "pr2_ethercat_drivers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ethercat-hardware \
    fingertip-pressure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ethercat-hardware \
    fingertip-pressure \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/pr2_ethercat_drivers/1.8.19-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cbf36fd116e731784278b301def202d3"
SRC_URI[sha256sum] = "e28b1bb1eb08c709820f7a571ca092a5ccf5035f877019f105ef2f3f485ff049"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-pr2_ethercat_drivers-1.8.19-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-ethercat-drivers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-ethercat-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-ethercat-drivers/pr2-ethercat-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-ethercat-drivers/pr2-ethercat-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-ethercat-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-ethercat-drivers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}