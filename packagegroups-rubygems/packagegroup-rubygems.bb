SUMMARY = "package group for all rubygems"

inherit packagegroup

RDEPENDS:${PN} += "\
    rubygems-activemodel \
    rubygems-activesupport \
    rubygems-addressable \
    rubygems-ast \
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sdk-alexaforbusiness \
    rubygems-aws-sdk-amplify \
    rubygems-aws-sdk-apigateway \
    rubygems-aws-sdk-apigatewayv2 \
    rubygems-aws-sdk-applicationautoscaling \
    rubygems-aws-sdk-athena \
    rubygems-aws-sdk-autoscaling \
    rubygems-aws-sdk-batch \
    rubygems-aws-sdk-budgets \
    rubygems-aws-sdk-cloudformation \
    rubygems-aws-sdk-cloudfront \
    rubygems-aws-sdk-cloudhsm \
    rubygems-aws-sdk-cloudhsmv2 \
    rubygems-aws-sdk-cloudtrail \
    rubygems-aws-sdk-cloudwatch \
    rubygems-aws-sdk-cloudwatchevents \
    rubygems-aws-sdk-cloudwatchlogs \
    rubygems-aws-sdk-codecommit \
    rubygems-aws-sdk-codedeploy \
    rubygems-aws-sdk-codepipeline \
    rubygems-aws-sdk-cognitoidentity \
    rubygems-aws-sdk-cognitoidentityprovider \
    rubygems-aws-sdk-configservice \
    rubygems-aws-sdk-core \
    rubygems-aws-sdk-costandusagereportservice \
    rubygems-aws-sdk-databasemigrationservice \
    rubygems-aws-sdk-dynamodb \
    rubygems-aws-sdk-ec2 \
    rubygems-aws-sdk-ecr \
    rubygems-aws-sdk-ecrpublic \
    rubygems-aws-sdk-ecs \
    rubygems-aws-sdk-efs \
    rubygems-aws-sdk-eks \
    rubygems-aws-sdk-elasticache \
    rubygems-aws-sdk-elasticbeanstalk \
    rubygems-aws-sdk-elasticloadbalancing \
    rubygems-aws-sdk-elasticloadbalancingv2 \
    rubygems-aws-sdk-elasticsearchservice \
    rubygems-aws-sdk-emr \
    rubygems-aws-sdk-eventbridge \
    rubygems-aws-sdk-firehose \
    rubygems-aws-sdk-glue \
    rubygems-aws-sdk-guardduty \
    rubygems-aws-sdk-iam \
    rubygems-aws-sdk-kafka \
    rubygems-aws-sdk-kinesis \
    rubygems-aws-sdk-kms \
    rubygems-aws-sdk-lambda \
    rubygems-aws-sdk-mq \
    rubygems-aws-sdk-networkfirewall \
    rubygems-aws-sdk-networkmanager \
    rubygems-aws-sdk-organizations \
    rubygems-aws-sdk-ram \
    rubygems-aws-sdk-rds \
    rubygems-aws-sdk-redshift \
    rubygems-aws-sdk-route53 \
    rubygems-aws-sdk-route53domains \
    rubygems-aws-sdk-route53resolver \
    rubygems-aws-sdk-s3 \
    rubygems-aws-sdk-secretsmanager \
    rubygems-aws-sdk-securityhub \
    rubygems-aws-sdk-servicecatalog \
    rubygems-aws-sdk-ses \
    rubygems-aws-sdk-shield \
    rubygems-aws-sdk-signer \
    rubygems-aws-sdk-simpledb \
    rubygems-aws-sdk-sms \
    rubygems-aws-sdk-sns \
    rubygems-aws-sdk-sqs \
    rubygems-aws-sdk-ssm \
    rubygems-aws-sdk-states \
    rubygems-aws-sdk-synthetics \
    rubygems-aws-sdk-transfer \
    rubygems-aws-sigv2 \
    rubygems-aws-sigv4 \
    rubygems-axiom-types \
    rubygems-azure-graph-rbac \
    rubygems-azure-mgmt-key-vault \
    rubygems-azure-mgmt-resources \
    rubygems-azure-mgmt-security \
    rubygems-azure-mgmt-storage \
    rubygems-bcrypt-pbkdf \
    rubygems-bson \
    rubygems-builder \
    rubygems-chef \
    rubygems-chef-config \
    rubygems-chef-telemetry \
    rubygems-chef-utils \
    rubygems-chef-vault \
    rubygems-chef-zero \
    rubygems-codeclimate-engine-rb \
    rubygems-coderay \
    rubygems-coercible \
    rubygems-colorator \
    rubygems-concurrent-ruby \
    rubygems-connection-pool \
    rubygems-cookstyle \
    rubygems-corefoundation \
    rubygems-declarative \
    rubygems-declarative-option \
    rubygems-deep-merge \
    rubygems-descendants-tracker \
    rubygems-diff-lcs \
    rubygems-docile \
    rubygems-docker-api \
    rubygems-domain-name \
    rubygems-ed25519 \
    rubygems-em-websocket \
    rubygems-equalizer \
    rubygems-erubi \
    rubygems-erubis \
    rubygems-eventmachine \
    rubygems-excon \
    rubygems-facter \
    rubygems-faraday \
    rubygems-faraday-cookie-jar \
    rubygems-faraday-em-http \
    rubygems-faraday-em-synchrony \
    rubygems-faraday-excon \
    rubygems-faraday-httpclient \
    rubygems-faraday-middleware \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-faraday-patron \
    rubygems-faraday-rack \
    rubygems-fast-gettext \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-flay \
    rubygems-flog \
    rubygems-forwardable-extended \
    rubygems-fuzzyurl \
    rubygems-gauntlet \
    rubygems-gems \
    rubygems-google-api-client \
    rubygems-google-apis-core \
    rubygems-google-apis-discovery-v1 \
    rubygems-google-apis-generator \
    rubygems-googleauth \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-hashie \
    rubygems-hiera \
    rubygems-highline \
    rubygems-hocon \
    rubygems-http-cookie \
    rubygems-http-parser.rb \
    rubygems-httpclient \
    rubygems-i18n \
    rubygems-ice-nine \
    rubygems-inifile \
    rubygems-iniparse \
    rubygems-inspec \
    rubygems-inspec-bin \
    rubygems-inspec-core \
    rubygems-ipaddress \
    rubygems-jekyll \
    rubygems-jekyll-sass-converter \
    rubygems-jekyll-watch \
    rubygems-jmespath \
    rubygems-json \
    rubygems-jwt \
    rubygems-kramdown \
    rubygems-kramdown-parser-gfm \
    rubygems-kwalify \
    rubygems-launchy \
    rubygems-libyajl2 \
    rubygems-license-acceptance \
    rubygems-liquid \
    rubygems-listen \
    rubygems-little-plugger \
    rubygems-locale \
    rubygems-logging \
    rubygems-memoist \
    rubygems-mercenary \
    rubygems-method-source \
    rubygems-mime-types \
    rubygems-mime-types-data \
    rubygems-mini-mime \
    rubygems-mini-portile2 \
    rubygems-minitest \
    rubygems-mixlib-archive \
    rubygems-mixlib-authentication \
    rubygems-mixlib-cli \
    rubygems-mixlib-config \
    rubygems-mixlib-log \
    rubygems-mixlib-shellout \
    rubygems-mongo \
    rubygems-ms-rest \
    rubygems-ms-rest-azure \
    rubygems-multi-json \
    rubygems-multipart-post \
    rubygems-net-http-persistent \
    rubygems-net-netconf \
    rubygems-net-scp \
    rubygems-net-sftp \
    rubygems-net-ssh \
    rubygems-net-ssh-gateway \
    rubygems-net-ssh-multi \
    rubygems-net-telnet \
    rubygems-nokogiri \
    rubygems-nori \
    rubygems-ohai \
    rubygems-os \
    rubygems-parallel \
    rubygems-parser \
    rubygems-parslet \
    rubygems-pastel \
    rubygems-path-expander \
    rubygems-pathutil \
    rubygems-plist \
    rubygems-proxifier \
    rubygems-pry \
    rubygems-public-suffix \
    rubygems-puppet \
    rubygems-puppet-resource-api \
    rubygems-puppetmodule-netdev-stdlib \
    rubygems-rack \
    rubygems-rainbow \
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
    rubygems-reek \
    rubygems-regexp-parser \
    rubygems-representable \
    rubygems-retriable \
    rubygems-rouge \
    rubygems-rspec \
    rubygems-rspec-core \
    rubygems-rspec-expectations \
    rubygems-rspec-its \
    rubygems-rspec-junit-formatter \
    rubygems-rspec-mocks \
    rubygems-rspec-support \
    rubygems-rubocop \
    rubygems-rubocop-ast \
    rubygems-ruby-parser \
    rubygems-ruby-progressbar \
    rubygems-ruby2-keywords \
    rubygems-rubycritic \
    rubygems-rubyntlm \
    rubygems-rubyzip \
    rubygems-safe-yaml \
    rubygems-sassc \
    rubygems-scanf \
    rubygems-semantic-puppet \
    rubygems-semverse \
    rubygems-serverspec \
    rubygems-sexp-processor \
    rubygems-sfl \
    rubygems-signet \
    rubygems-simplecov \
    rubygems-simplecov-html \
    rubygems-simplecov-json-formatter \
    rubygems-slop \
    rubygems-specinfra \
    rubygems-sslshake \
    rubygems-strings \
    rubygems-strings-ansi \
    rubygems-syslog-logger \
    rubygems-systemu \
    rubygems-terminal-table \
    rubygems-thor \
    rubygems-thread-safe \
    rubygems-tilt \
    rubygems-timeliness \
    rubygems-tomlrb \
    rubygems-trailblazer-option \
    rubygems-train \
    rubygems-train-aws \
    rubygems-train-core \
    rubygems-train-habitat \
    rubygems-train-winrm \
    rubygems-tty-box \
    rubygems-tty-color \
    rubygems-tty-cursor \
    rubygems-tty-prompt \
    rubygems-tty-reader \
    rubygems-tty-screen \
    rubygems-tty-table \
    rubygems-tty-which \
    rubygems-tzinfo \
    rubygems-uber \
    rubygems-unf \
    rubygems-unf-ext \
    rubygems-unicode-display-width \
    rubygems-unicode-utils \
    rubygems-uuidtools \
    rubygems-vault \
    rubygems-virtus \
    rubygems-webrick \
    rubygems-winrm \
    rubygems-winrm-elevated \
    rubygems-winrm-fs \
    rubygems-wisper \
    rubygems-wmi-lite \
    rubygems-yajl-ruby \
    rubygems-yard \
    rubygems-zeitwerk \
"
