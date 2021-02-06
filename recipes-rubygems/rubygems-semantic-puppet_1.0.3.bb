# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: semantic_puppet"
DESCRIPTION = "Tools used by Puppet to parse, validate, and compare Semantic Versions and Version Ranges and to query and resolve module dependencies."
HOMEPAGE = "https://github.com/puppetlabs/semantic_puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8737b067d16e724769a2968ed8d6373f"

SRC_URI[md5sum] = "36e4e7d0f0fb4d8f93e005ba6e330528"
SRC_URI[sha256sum] = "3b83bff3bed1188d603947184c0e3ee4443543e3e832edccc7127b6209bb292b"

GEM_NAME = "semantic_puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
