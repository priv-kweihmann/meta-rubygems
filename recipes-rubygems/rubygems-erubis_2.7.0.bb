# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: erubis"
DESCRIPTION = "Erubis is an implementation of eRuby and has the following features:  * Very fast, almost three times faster than ERB and about 10% faster than eruby.  * Multi-language support (Ruby/PHP/C/Java/Scheme/Perl/Javascript)  * Auto escaping support  * Auto trimming spaces around '<% %>'  * Embedded pattern changeable (default '<% %>')  * Enable to handle Processing Instructions (PI) as embedded pattern (ex"
HOMEPAGE = "http://www.kuwata-lab.com/erubis/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=f2371f979587e069c8f69be911f717bd"

SRC_URI[md5sum] = "cca3cf13ef951d1fc8c124d2fde52565"
SRC_URI[sha256sum] = "63653f5174a7997f6f1d6f465fbe1494dcc4bdab1fb8e635f6216989fb1148ba"

GEM_NAME = "erubis"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
