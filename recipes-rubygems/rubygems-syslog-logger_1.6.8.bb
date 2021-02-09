# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: syslog-logger"
DESCRIPTION = "An improved Logger replacement that logs to syslog"
HOMEPAGE = "http://github.com/ngmoco/syslog_logger"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=96;endline=113;md5=49c91bbba5c1debb2d759adcc829d5c1"

SRC_URI[md5sum] = "5f85ed5fd152e5bafafad0923391296b"
SRC_URI[sha256sum] = "7541f34681c7d10ed63e8ee82733b0a60f79264a6ef3f489a20dce80e105c293"

GEM_NAME = "syslog-logger"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
