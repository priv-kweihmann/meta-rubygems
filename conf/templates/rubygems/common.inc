DISTRO = "poky"
EXTRA_IMAGE_FEATURES = "\
    allow-empty-password \
    allow-root-login \
    empty-root-password \
    post-install-logging \
"
PACKAGECONFIG:append:pn-qemu-system-native = " sdl"
PACKAGE_CLASSES = "package_rpm"
PATCHRESOLVE = "noop"

DISTRO_FEATURES_DEFAULT = "acl argp ext2 ipv4 ipv6 largefile xattr nfs vfat"
# Remove all audio and graphics related distro backfills
# we do not need them for our purposes
DISTRO_FEATURES_BACKFILL:remove = "opengl ptest wayland vulkan pulseaudio"

INHERIT += "rm_work rubygemsdebug"
