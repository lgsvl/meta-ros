DESCRIPTION = "yaml-cpp is a YAML parser and emitter in C++ matching the YAML 1.2 spec"
HOMEPAGE = "https://github.com/jbeder/yaml-cpp/"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a8aaf0595c2efc1a9c2e0913e9c1a2c"

DEPENDS = "boost"

PR = "r0"

S = "${WORKDIR}/yaml-cpp-release-${PV}"

SRC_URI = "https://github.com/jbeder/yaml-cpp/archive/release-${PV}.tar.gz"
SRC_URI[md5sum] = "e2507c3645fc2bec29ba9a1838fb3951"
SRC_URI[sha256sum] = "3492d9c1f4319dfd5588f60caed7cec3f030f7984386c11ed4b39f8e3316d763"

EXTRA_OECMAKE = "-DBUILD_SHARED_LIBS=ON"

inherit cmake
