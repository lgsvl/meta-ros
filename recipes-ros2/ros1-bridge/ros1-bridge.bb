SUMMARY = "The ROS1 bridge"
HOMEPAGE = "https://github.com/ros2/ros1_bridge"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRCREV = "75f0392e1e0089cf6f5e7acfeb1e5b6c8c7a78f2"
SRC_URI = "git://github.com/ros2/ros1_bridge.git;protocol=git;"

ROS_BPN = "ros1_bridge"

inherit ament
inherit python3native

DEPENDS = " \
    ament-index-python \
    boost \
    catkin-native \
    example-interfaces \
    python-rospkg \
    rcl \
    rclcpp \
    rcl-interfaces \
    rmw \
    rmw-implementation \
    rosbag \
    roscpp \
    rosgraph \
    rosidl-parser \
    roslaunch \
    roslib \
    rosmsg \
    rospy \
    ros2-actionlib-msgs \
    ros2-diagnostic-msgs \
    ros2-geometry-msgs \
    ros2-nav-msgs \
    ros2-sensor-msgs \
    ros2-shape-msgs \
    ros2-std-msgs \
    ros2-stereo-msgs \
    ros2-trajectory-msgs \
    ros2-visualization-msgs \
"

RDEPENDS_${PN} = "\
    actionlib-msgs \
    cpp-common \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    rcl \
    rclcpp \
	rcutils \
    roscpp \
    roscpp-serialization \
    rosconsole \
    rostime \
    xmlrpcpp \
"
#    ros2-std-msgs \
#    ros2-actionlib-msgs \
#    ros2-diagnostic-msgs \
#    ros2-geometry-msgs \
#    ros2-nav-msgs \
#    ros2-sensor-msgs \
#    ros2-shape-msgs \
#    ros2-std-msgs \
#    ros2-stereo-msgs \
#    ros2-trajectory-msgs \
#    ros2-visualization-msgs \
#    sensor-msgs \
#    shape-msgs \
#    std-msgs \
#    stereo-msgs \
#    trajectory-msgs \
#    visualization-msgs \
#    xmlrpcpp \
#"

S = "${WORKDIR}/git/"

ros_libdir = "${base_prefix}/opt/ros/${ROSDISTRO}/${baselib}"

PKG_CONFIG_PATH .= ":${PKG_CONFIG_DIR}:${STAGING_DIR_HOST}/${ros_libdir}/pkgconfig:${STAGING_DATADIR}/pkgconfig"
PYTHON_SITEPACKAGES_DIR = "${libdir}/${PYTHON_DIR}/site-packages"
PYTHONPATH_class-native = "${PYTHON_SITEPACKAGES_DIR}"

export PYTHONPATH="${STAGING_DIR_HOST}${ros_libdir}/python2.7/site-packages:${STAGING_DIR_HOST}/${libdir}/python3.5/site-packages:${STAGING_DIR_NATIVE}${ros_libdir}/python2.7/site-packages"

export ROS_ROOT="${STAGING_DIR_HOST}/opt/ros/${ROSDISTRO}"
export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}/usr"
