# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-telemetry"
DESCRIPTION = "Send user actions to the Chef telemetry system"
HOMEPAGE = "https://github.com/chef/chef-telemetry"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-chef-config-native \
    rubygems-concurrent-ruby-native \
"

SRC_URI[md5sum] = "972ecbac8182c4116c6789b38d157f4e"
SRC_URI[sha256sum] = "8ba5064939789122ee2afffcd4dda4112507a8b129a4440dec7ba4ef5b470b53"

GEM_NAME = "chef-telemetry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-chef-config \
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
