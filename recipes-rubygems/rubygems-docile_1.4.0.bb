# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: docile"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific language) within a given block"
HOMEPAGE = "https://ms-ati.github.io/docile/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e74ce31842082484e7525142a0cae01f"

SRC_URI[md5sum] = "346d8ca3988c5e5dab44d50545e9b239"
SRC_URI[sha256sum] = "5f1734bde23721245c20c3d723e76c104208e1aa01277a69901ce770f0ebb8d3"

GEM_NAME = "docile"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
