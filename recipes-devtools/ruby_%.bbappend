# SPDX-License-Identifier: MIT
PACKAGECONFIG:append = " rdoc"

# oe-core packaging is broken
# apparently people do not test their stuff before posting
do_install:append() {
    mv ${D}/share/* ${D}${datadir} || true
    rm -rf ${D}/share/
}

# yet another proof that oe-core testing is broken
# nooelint: oelint.vars.insaneskip
INSANE_SKIP:${PN}-ri-docs += "buildpaths"
