# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: racc"
DESCRIPTION = "Racc is a LALR(1) parser generator.  It is written in Ruby itself, and generates Ruby program.  NOTE: Ruby 1.8.x comes with Racc runtime module"
HOMEPAGE = "http://i.loveruby.net/en/projects/racc/"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=db0e9ea60df3917f67640933f40c6318"

SRC_URI[md5sum] = "f7fc958dcf2de465779c776d3f466f91"
SRC_URI[sha256sum] = "2f48a44974ebc6b724f763f546a57706bbbeff571b7e1cf7d50919db413e139d"

EXTRA_DEPENDS += "libxcrypt"

GEM_NAME = "racc"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
INSANE_SKIP_${PN} += "ldflags"
