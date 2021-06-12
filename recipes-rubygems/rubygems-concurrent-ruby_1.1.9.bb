# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: concurrent-ruby"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, actors, supervisors, and more.Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency patterns."
HOMEPAGE = "http://www.concurrent-ruby.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e319104fe1435b64fc0a67032db44f02"

SRC_URI[md5sum] = "417a23cac840f6ea8bdd0841429c3c19"
SRC_URI[sha256sum] = "0ec0846d991c38f355b4228ad8ea77aa69c3fdaa320cd574dafedc10c4688a5b"

GEM_NAME = "concurrent-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
