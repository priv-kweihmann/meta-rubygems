# SPDX-License-Identifier: MIT
SUMMARY = "proxifier meta package"
DESCRIPTION = "Proxifier adds support for HTTP or SOCKS proxies and lets you force TCPSocket to use proxies."

DEPENDS:class-native += "rubygems-proxifier2"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

PACKAGES = "${PN}"
RDEPENDS:${PN} = "ruby rubygems-proxifier2"
ALLOW_EMPTY:${PN} = "1"
FILES:${PN} = ""

BBCLASSEXTEND = "native"
