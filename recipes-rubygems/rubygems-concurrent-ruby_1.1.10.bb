# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: concurrent-ruby"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, actors, supervisors, and more.Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency patterns."
HOMEPAGE = "http://www.concurrent-ruby.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e319104fe1435b64fc0a67032db44f02"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4588a61d5af26e9ee12e9b8babc1b755"
SRC_URI[sha256sum] = "244cb1ca0d91ec2c15ca2209507c39fb163336994428e16fbd3f465c87bd8e68"

GEM_NAME = "concurrent-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
