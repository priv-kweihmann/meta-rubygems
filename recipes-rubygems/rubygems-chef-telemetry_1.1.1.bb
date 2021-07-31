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

SRC_URI[md5sum] = "f36634eb90ad4f480c9726e2935eac02"
SRC_URI[sha256sum] = "bd004fd20cd0677936d3ada881b1d318185a76186e1774634542366707633151"

GEM_NAME = "chef-telemetry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-chef-config \
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
