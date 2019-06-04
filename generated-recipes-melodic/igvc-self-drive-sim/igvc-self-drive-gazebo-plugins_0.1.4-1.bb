# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Gazebo plugins for IGVC Self-Drive simulator"
AUTHOR = "Micho Radovnikovich <mtradovn@oakland.edu>"
ROS_AUTHOR = "Micho Radovnikovich <mtradovn@oakland.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6c4b0dfc2c040991f7798d2c24b8fc03"

ROS_CN = "igvc_self_drive_sim"
ROS_BPN = "igvc_self_drive_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    gazebo-ros \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    gazebo-ros \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    gazebo-ros \
    gazebo-ros-pkgs \
    hector-gazebo-plugins \
    hector-models \
    robot-state-publisher \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_gazebo_plugins/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0454dcd78785eb5e1c29b7f1da50e8fe"
SRC_URI[sha256sum] = "b05458848d4831c3a1dda0396285a2380bca48743fd980319fcacd645e1c26bd"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_gazebo_plugins-0.1.4-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('igvc-self-drive-sim', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('igvc-self-drive-sim', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/igvc-self-drive-sim/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}