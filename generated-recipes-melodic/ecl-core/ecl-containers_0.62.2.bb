# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The containers included here are intended to extend the stl containers.     In all cases, these implementations are designed to implement     c++ conveniences and safety where speed is not sacrificed.       Also includes techniques for memory debugging of common problems such     as buffer overruns."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_containers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_containers"

ROS_BUILD_DEPENDS = " \
    ecl-config \
    ecl-converters \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-mpl \
    ecl-type-traits \
    ecl-utilities \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-config \
    ecl-converters \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-mpl \
    ecl-type-traits \
    ecl-utilities \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-config \
    ecl-converters \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-license \
    ecl-mpl \
    ecl-type-traits \
    ecl-utilities \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_containers/0.62.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ccbe02d6f7e55f7b87a9918913ce548b"
SRC_URI[sha256sum] = "754395eafaca8f39801e1b53e4abc321787bbb47341aa82a767b507651114126"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_containers-0.62.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ecl-core', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ecl-core', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}