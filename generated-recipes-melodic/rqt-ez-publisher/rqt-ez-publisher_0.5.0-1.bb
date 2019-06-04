# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The rqt_ez_publisher package"
AUTHOR = "Takashi Ogura <t.ogura@gmail.com>"
ROS_AUTHOR = "Takashi Ogura <t.ogura@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_ez_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_ez_publisher"
ROS_BPN = "rqt_ez_publisher"

ROS_BUILD_DEPENDS = " \
    python-catkin-pkg \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    sensor-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OTL/rqt_ez_publisher-release/archive/release/melodic/rqt_ez_publisher/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a07654fd42b267f948864c982145e0f"
SRC_URI[sha256sum] = "0ddd9a4715365473360ac5443887e7da747eb8280c7c9f90894f304131582f7a"
S = "${WORKDIR}/rqt_ez_publisher-release-release-melodic-rqt_ez_publisher-0.5.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-ez-publisher', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-ez-publisher', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-ez-publisher/rqt-ez-publisher_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-ez-publisher/rqt-ez-publisher-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-ez-publisher/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-ez-publisher/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}