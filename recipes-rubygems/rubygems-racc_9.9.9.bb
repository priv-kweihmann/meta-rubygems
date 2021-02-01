# SPDX-License-Identifier: MIT
SUMMARY = "Meta package for racc"
DESCRIPTION = "As racc is provided by ruby, this recipe is just here to provide a reference"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

PACKAGES = "${PN}"

RDEPENDS_${PN} += "ruby"

BBCLASSEXTEND = "native"
