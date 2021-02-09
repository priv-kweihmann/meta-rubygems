# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: scanf"
DESCRIPTION = "scanf is an implementation of the C function scanf(3)."
HOMEPAGE = "https://github.com/ruby/scanf"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://lib/scanf.rb;beginline=200;endline=229;md5=b0f9bb13759419112e9a04e3b240dcda"

SRC_URI[md5sum] = "6a48b02b5d7109331afa8bd9d55a802e"
SRC_URI[sha256sum] = "533db7f7e5acafea1a145d6c5329cef667a58fbcb7d64379a808ff1199ee1b00"

GEM_NAME = "scanf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
