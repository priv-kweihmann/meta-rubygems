# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bundler"
DESCRIPTION = "Bundler manages an application's dependencies through its entire life, across many machines, systematically and repeatably"
HOMEPAGE = "https://bundler.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=2da2850a649eee420c5eb08072a3cc95"

SRC_URI[md5sum] = "cfcf6a945fbfe9cfb75ee581bc12f816"
SRC_URI[sha256sum] = "b7aa885d7c90c34552488b83fa1b8f3ee75a813395d3548840270c4f5ad46198"

GEM_NAME = "bundler"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
