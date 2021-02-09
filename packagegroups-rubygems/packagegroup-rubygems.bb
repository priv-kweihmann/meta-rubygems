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
    rubygems-erubis \
    rubygems-facter \
    rubygems-faraday \
    rubygems-faraday-middleware \
    rubygems-faraday-net-http \
    rubygems-fast-gettext \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-fuzzyurl \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-hashie \
    rubygems-hiera \
    rubygems-highline \
    rubygems-hocon \
"
