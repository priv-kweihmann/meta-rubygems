# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: forwardable-extended"
DESCRIPTION = "Forwardable with hash, and instance variable extensions."
HOMEPAGE = "http://github.com/envygeeks/forwardable-extended"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=923993a758a91936eb181a9eadb12dd3"

SRC_URI[md5sum] = "37cb8b939ad6d29b6b51b7e8c93de0b2"
SRC_URI[sha256sum] = "1bec948c469bbddfadeb3bd90eb8c85f6e627a412a3e852acfd7eaedbac3ec97"

GEM_NAME = "forwardable-extended"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
