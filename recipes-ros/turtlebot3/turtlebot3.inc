SRC_URI = "https://github.com/ROBOTIS-GIT/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "03c045f95aac9941115a5063a6415d72"
SRC_URI[sha256sum] = "5534069fc2487a27c67b208fd89833acdc6ef67d764da890ac0204c8caffa4ac"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "turtlebot3"
