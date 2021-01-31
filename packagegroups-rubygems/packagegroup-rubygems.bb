SUMMARY = "Packagegroup all rubygems inspec profiles"

inherit packagegroup

RDEPENDS_${PN} += "\
                    rubygems-activemodel \
                    rubygems-activesupport \
                    rubygems-addressable \
                    rubygems-aws-eventstream \
                    rubygems-aws-partitions \
                    rubygems-aws-sdk-core \
                    rubygems-aws-sigv4 \
                    rubygems-builder \
                    rubygems-concurrent-ruby \
                    rubygems-diff-lcs \
                    rubygems-faraday \
                    rubygems-faraday-net-http \
                    rubygems-i18n \
                    rubygems-jmespath \
                    rubygems-minitest \
                    rubygems-multipart-post \
                    rubygems-public-suffix \
                    rubygems-rspec \
                    rubygems-rspec-core \
                    rubygems-rspec-expectations \
                    rubygems-rspec-mocks \
                    rubygems-rspec-support \
                    rubygems-ruby2-keywords \
                    rubygems-thor \
                    rubygems-thread-safe \
                    rubygems-tilt \
                    rubygems-tzinfo \
                    rubygems-zeitwerk \
                  "
