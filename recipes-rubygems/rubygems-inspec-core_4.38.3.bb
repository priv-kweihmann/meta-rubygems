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

SRC_URI[md5sum] = "7342d86c9302431ce405abf9683e74e9"
SRC_URI[sha256sum] = "fe525c1b33168c1cdeec31bebbe98aafedaaf87fc32068a638827ef710104898"

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
