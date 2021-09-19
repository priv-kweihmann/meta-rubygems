BB_DISKMON_DIRS = ""
BB_GENERATE_SHALLOW_TARBALLS = "1"
BB_GIT_SHALLOW = "1"

QB_MEM = "-m 1024"
QEMU_USE_KVM ?= "0"
QEMU_USE_SLIRP = "1"
TEST_SERVER_IP = "192.168.7.1"
TEST_TARGET_IP = "192.168.7.2"
TEST_RUNQEMUPARAMS = "nographic slirp"

# Use yocto upstream sstate mirror, which should speed our builds in CI
SSTATE_MIRRORS ?= "file://.* http://sstate.yoctoproject.org/dev/PATH;downloadfilename=PATH"
BB_HASHSERVE_UPSTREAM = "typhoon.yocto.io:8687"
