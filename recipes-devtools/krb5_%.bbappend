# SPDX-License-Identifier: MIT
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append = " file://0001-code-fix-discarded-qualifiers-errors.patch"

