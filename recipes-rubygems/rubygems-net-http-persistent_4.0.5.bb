# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-http-persistent"
DESCRIPTION = "Manages persistent connections using Net::HTTP including a thread pool forconnecting to multiple hosts.Using persistent HTTP connections can dramatically increase the speed of HTTP.Creating a new HTTP connection for every request involves an extra TCPround-trip and causes TCP congestion avoidance negotiation to start over.Net::HTTP supports persistent connections with some API methods but does notmake setting up a single persistent connection or managing multipleconnections easy"
HOMEPAGE = "https://github.com/drbrain/net-http-persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=59;endline=82;md5=e3fe655d8a232a8b4e8bde0439a4518f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-connection-pool-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "389b8ebcb6cb0550aad4c3b5dfa5c362"
SRC_URI[sha256sum] = "6e42880b347e650ffeaf679ae59c9d5a6ed8a22cda6e1b959d9c270050aefa8e"

GEM_NAME = "net-http-persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-connection-pool \
"

BBCLASSEXTEND = "native"
