# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: fuzzyurl"
DESCRIPTION = "A library for non-strict parsing, construction, and wildcard-matching of URLs."
HOMEPAGE = "https://github.com/gamache/fuzzyurl.rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "d3cb6665072bf5f5e74af3f9be31b496"
SRC_URI[sha256sum] = "542efa80f2bcaadbdc402c2f0b572f2e335a1d53e375aecad68bbb3d86860c0f"

GEM_NAME = "fuzzyurl"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
