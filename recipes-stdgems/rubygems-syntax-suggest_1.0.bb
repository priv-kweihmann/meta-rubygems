# SPDX-License-Identifier: MIT
SUMMARY = "Meta package for syntax_suggest"
DESCRIPTION = "As syntax_suggest is provided by ruby, this recipe is just here to provide a reference"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

PACKAGES = "${PN}"

RDEPENDS:${PN} = "ruby"
ALLOW_EMPTY:${PN} = "1"
FILES:${PN} = ""

BBCLASSEXTEND = "native"
