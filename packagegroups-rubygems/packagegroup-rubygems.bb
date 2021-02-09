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
    rubygems-chef \
    rubygems-chef-config \
    rubygems-chef-telemetry \
    rubygems-chef-utils \
    rubygems-chef-vault \
    rubygems-chef-zero \
    rubygems-coderay \
    rubygems-concurrent-ruby \
    rubygems-deep-merge \
    rubygems-diff-lcs \
    rubygems-ed25519 \
    rubygems-erubi \
"
