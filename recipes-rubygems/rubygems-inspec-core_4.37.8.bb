# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-chef-telemetry-native \
    rubygems-faraday-middleware-native \
    rubygems-faraday-native \
    rubygems-hashie-native \
    rubygems-license-acceptance-native \
    rubygems-method-source-native \
    rubygems-mixlib-log-native \
    rubygems-multipart-post-native \
    rubygems-parallel-native \
    rubygems-parslet-native \
    rubygems-pry-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-rubyzip-native \
    rubygems-semverse-native \
    rubygems-sslshake-native \
    rubygems-thor-native \
    rubygems-tomlrb-native \
    rubygems-train-core-native \
    rubygems-tty-prompt-native \
    rubygems-tty-table-native \
"

SRC_URI[md5sum] = "58d9bb382ae56d3ef5de9a12a7e4002f"
SRC_URI[sha256sum] = "1377d7fbda2fa8a55d3ed8e302c5f16539a285e22bb9e4c751284a87dcaa202a"

GEM_NAME = "inspec-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-chef-telemetry \
    rubygems-faraday \
    rubygems-faraday-middleware \
    rubygems-hashie \
    rubygems-license-acceptance \
    rubygems-method-source \
    rubygems-mixlib-log \
    rubygems-multipart-post \
    rubygems-parallel \
    rubygems-parslet \
    rubygems-pry \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-rubyzip \
    rubygems-semverse \
    rubygems-sslshake \
    rubygems-thor \
    rubygems-tomlrb \
    rubygems-train-core \
    rubygems-tty-prompt \
    rubygems-tty-table \
"

BBCLASSEXTEND = "native"
