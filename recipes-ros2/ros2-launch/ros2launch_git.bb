LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

include ros2-launch.inc

S = "${WORKDIR}/git/ros2launch"

DEPENDS = "ros2cli"

RDEPENDS_${PN} += "ros2-launch ros2-launch-extentions ros2cli ros2pkg"
