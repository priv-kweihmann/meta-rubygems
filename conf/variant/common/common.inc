DISTRO = "poky"
EXTRA_IMAGE_FEATURES ?= "debug-tweaks"
PACKAGECONFIG_append_pn-qemu-system-native = " sdl"
PACKAGE_CLASSES ?= "package_rpm"
