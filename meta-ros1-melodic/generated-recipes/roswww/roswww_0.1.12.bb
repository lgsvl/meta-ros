# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Feathery lightweight web server for ROS, that is based on <a href="http://www.tornadoweb.org/en/stable">Tornado</a> web server module."
AUTHOR = "Isaac I.Y. Saito <iisaito@kinugarage.com>"
ROS_AUTHOR = "Jonathan Mace"
HOMEPAGE = "http://wiki.ros.org/roswww"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roswww"
ROS_BPN = "roswww"

ROS_BUILD_DEPENDS = " \
    python-catkin-pkg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosbridge-server \
    rosgraph \
    rospack \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosbridge-server \
    rosgraph \
    rospack \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_phantomjs} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-selenium-pip} \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/roswww-release/archive/release/melodic/roswww/0.1.12-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roswww"
SRC_URI = "git://github.com/ros-gbp/roswww-release;${ROS_BRANCH};protocol=https"
SRCREV = "1a7edc96082bb6766c4c950f51f6592079cc5086"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
