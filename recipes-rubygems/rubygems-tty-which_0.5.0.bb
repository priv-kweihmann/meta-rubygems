# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tty-which"
DESCRIPTION = "Platform independent implementation of Unix which command."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ccb3f6c9399ae36f003ef2debf871be1"

SRC_URI[md5sum] = "77e756ed899c6cf83a6e7fc66c5a626b"
SRC_URI[sha256sum] = "5824055f0d6744c97e7c4426544f01d519c40d1806ef2ef47d9854477993f466"

GEM_NAME = "tty-which"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
