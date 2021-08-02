# ruby internally links against libcrypto.so.1
do_install:append() {
    cd ${D}${libdir}
    ln -sf libcrypto.so.1.1 libcrypto.so.1
    cd -
}

FILES:libcrypto += "${libdir}/libcrypto.so.1"
