# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: semantic_puppet"
DESCRIPTION = "Tools used by Puppet to parse, validate, and compare Semantic Versions and Version Ranges and to query and resolve module dependencies."
HOMEPAGE = "https://github.com/puppetlabs/semantic_puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8737b067d16e724769a2968ed8d6373f"

SRC_URI[md5sum] = "bf36de9dffe6bc035a862bf0c3dc034b"
SRC_URI[sha256sum] = "5d8380bf733c1552ef77e06a7c44a6d5b48def7d390ecf3bd71cad477f5ce13d"

GEM_NAME = "semantic_puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
