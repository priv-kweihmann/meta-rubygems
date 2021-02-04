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
                    rubygems-ffi \
                    rubygems-i18n \
                    rubygems-jmespath \
                    rubygems-json \
                    rubygems-mime-types \
                    rubygems-mime-types-data \
                    rubygems-mini-portile2 \
                    rubygems-minitest \
                    rubygems-multi-json \
                    rubygems-multipart-post \
                    rubygems-nokogiri \
                    rubygems-public-suffix \
                    rubygems-rack \
                    rubygems-rspec \
                    rubygems-rspec-core \
                    rubygems-rspec-expectations \
                    rubygems-rspec-its \
                    rubygems-rspec-junit-formatter \
                    rubygems-rspec-mocks \
                    rubygems-rspec-support \
                    rubygems-ruby2-keywords \
                    rubygems-thor \
                    rubygems-thread-safe \
                    rubygems-tilt \
                    rubygems-tzinfo \
                    rubygems-zeitwerk \
                  "
