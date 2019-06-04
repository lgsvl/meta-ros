# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The RxROS package"
AUTHOR = "Andrzej Wasowski <wasowski@itu.dk>"
ROS_AUTHOR = "Henrik Larsen"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rxros"
ROS_BPN = "rxros"

ROS_BUILD_DEPENDS = " \
    roscpp \
    rxcpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rxcpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/rosin-project/rxros-release/archive/release/melodic/rxros/0.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8189a955c82fa3ef98bc83c02142efa5"
SRC_URI[sha256sum] = "ac6bf266d3f1bfbe7be43f5870ba29469fffb094fe4c4bdc8241a128187c6dde"
S = "${WORKDIR}/rxros-release-release-melodic-rxros-0.1.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rxros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rxros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/rxros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/rxros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}