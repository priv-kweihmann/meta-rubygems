# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: wmi-lite"
DESCRIPTION = "A lightweight utility over win32ole for accessing basic WMI (Windows Management Instrumentation) functionality in the Microsoft Windows operating system"
HOMEPAGE = "https://github.com/chef/wmi-lite"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "5c7be12e7d81c6f442ca4dfabeb61788"
SRC_URI[sha256sum] = "14efa710be3226e281a66ab93f7ebc92f5e0807029e02b9cf1d3f39d15d90d84"

GEM_NAME = "wmi-lite"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
