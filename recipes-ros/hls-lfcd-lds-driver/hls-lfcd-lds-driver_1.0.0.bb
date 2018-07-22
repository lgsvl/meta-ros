# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS package for LDS(HLS-LFCD2).     The LDS (Laser Distance Sensor) is a sensor sending the data to Host for the simultaneous localization and mapping (SLAM). Simultaneously the detecting obstacle data can also be sent to Host. HLDS(Hitachi-LG Data Storage) is developing the technology for the moving platform sensor such as Robot Vacuum Cleaners, Home Robot, Robotics Lawn Mower Sensor, etc."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/hls_lfcd_lds_driver/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0b575d10f58a05682cbd49afb13ad9b"
SRC_URI[sha256sum] = "ccb7753ff2624f16cbc679cd8b9a541e4d1a2915c69b7cc7c54faa56325d2473"
S = "${WORKDIR}/${PN}-release-release-kinetic-hls_lfcd_lds_driver-1.0.0-0"

inherit catkin
