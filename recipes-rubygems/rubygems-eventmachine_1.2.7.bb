# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: eventmachine"
DESCRIPTION = "EventMachine implements a fast, single-threaded engine for arbitrary networkcommunications"
HOMEPAGE = "http://rubyeventmachine.com"

LICENSE = "Ruby & GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=270149a18e664d261350cfe727055898"

SRC_URI[md5sum] = "c9c775bac51d47404fa1cb27a704117b"
SRC_URI[sha256sum] = "994016e42aa041477ba9cff45cbe50de2047f25dd418eba003e84f0d16560972"

SRC_URI:append = " file://remove-ruby-1.8-1.9-comp.patch"

GEM_NAME = "eventmachine"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # avoid unwanted dependencies: we do not support java
    rm -f ${D}/${libdir}/ruby/gems/3.0.0/gems/eventmachine-${PV}/lib/jeventmachine.rb
}

BBCLASSEXTEND = "native"
