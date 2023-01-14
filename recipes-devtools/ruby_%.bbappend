# SPDX-License-Identifier: MIT
PACKAGECONFIG:append = " rdoc"

EXTRA_OECONF += "--with-ruby-version=${PV}"
