DESCRIPTION = "tf2_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs"
S = "${WORKDIR}/${ROS_SP}/tf2_msgs"
require geometry2.inc
