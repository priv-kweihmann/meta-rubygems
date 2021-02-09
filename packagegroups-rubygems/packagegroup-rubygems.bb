SUMMARY = "package group for all rubygems"

inherit packagegroup

RDEPENDS_${PN} += "\
    rubygems-activemodel \
    rubygems-activesupport \
    rubygems-addressable \
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
    rubygems-bcrypt-pbkdf \
    rubygems-builder \
"
