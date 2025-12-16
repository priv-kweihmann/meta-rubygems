BB_DISKMON_DIRS = "\
    STOPTASKS,${TMPDIR},300M,100K \
    STOPTASKS,${DL_DIR},300M,100K \
    STOPTASKS,${SSTATE_DIR},300M,100K \
    STOPTASKS,/tmp,100M,100K \
    HALT,${TMPDIR},100M,1K \
    HALT,${DL_DIR},100M,1K \
    HALT,${SSTATE_DIR},100M,1K"
BB_GENERATE_SHALLOW_TARBALLS = "1"
BB_GIT_SHALLOW = "1"

QB_MEM = "-m 1024"
QEMU_USE_KVM ?= "0"
QEMU_USE_SLIRP = "1"
TEST_SERVER_IP = "192.168.7.1"
TEST_TARGET_IP = "192.168.7.2"
TEST_RUNQEMUPARAMS = "nographic slirp"

# Disable heavy llvm build, we really don't need for a headless qemu
PACKAGECONFIG:remove:pn-mesa-native = "gallium-llvm"
PACKAGECONFIG:remove:pn-mesa-native = "libclc"
PACKAGECONFIG:remove:pn-mesa-native = "amd"
PACKAGECONFIG:remove:pn-mesa-native = "intel"
PACKAGECONFIG:remove:pn-mesa-gl-native = "gallium-llvm"
PACKAGECONFIG:remove:pn-mesa-gl-native = "libclc"
PACKAGECONFIG:remove:pn-mesa-gl-native = "amd"
PACKAGECONFIG:remove:pn-mesa-gl-native = "intel"

# We don't care about ptests, all testing is done with oeqa
DISTRO_FEATURES:remove = "ptest"

INHERIT += "no-spdx"

QEMU_TARGETS = "aarch64"

MIRRORS:append = " https://gmplib.org/download/gmp/ https://ftp.gnu.org/gnu/gmp/"
