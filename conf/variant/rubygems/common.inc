DISTRO = "poky"
EXTRA_IMAGE_FEATURES = "debug-tweaks"
PACKAGECONFIG_append_pn-qemu-system-native = " sdl"
PACKAGE_CLASSES = "package_rpm"
PATCHRESOLVE = "noop"
USER_CLASSES = "image-prelink"

DISTRO_FEATURES_DEFAULT = "acl argp ext2 ipv4 ipv6 largefile xattr nfs vfat"

INHERIT += "rm_work rubygemsdebug"
