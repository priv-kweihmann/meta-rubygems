# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-http-persistent"
DESCRIPTION = "Manages persistent connections using Net::HTTP including a thread pool forconnecting to multiple hosts.Using persistent HTTP connections can dramatically increase the speed of HTTP.Creating a new HTTP connection for every request involves an extra TCPround-trip and causes TCP congestion avoidance negotiation to start over.Net::HTTP supports persistent connections with some API methods but does notmake setting up a single persistent connection or managing multipleconnections easy"
HOMEPAGE = "https://github.com/drbrain/net-http-persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://README.rdoc;beginline=59;endline=82;md5=e3fe655d8a232a8b4e8bde0439a4518f \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-connection-pool-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e089737972f6c306fc3f0adf3d2399a1"
SRC_URI[sha256sum] = "ef3de8319d691537b329053fae3a33195f8b070bbbfae8bf1a58c796081960e6"

GEM_NAME = "net-http-persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-connection-pool \
"

BBCLASSEXTEND = "native"
