# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-aws"
DESCRIPTION = "Allows applications using Train to speak to AWS; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-aws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16f9b4dd2d3afd4d244ba4e5d9e715e"

DEPENDS:class-native += "\
    rubygems-aws-sdk-apigateway-native \
    rubygems-aws-sdk-apigatewayv2-native \
    rubygems-aws-sdk-applicationautoscaling-native \
    rubygems-aws-sdk-athena-native \
    rubygems-aws-sdk-autoscaling-native \
    rubygems-aws-sdk-batch-native \
    rubygems-aws-sdk-budgets-native \
    rubygems-aws-sdk-cloudformation-native \
    rubygems-aws-sdk-cloudfront-native \
    rubygems-aws-sdk-cloudhsm-native \
    rubygems-aws-sdk-cloudhsmv2-native \
    rubygems-aws-sdk-cloudtrail-native \
    rubygems-aws-sdk-cloudwatch-native \
    rubygems-aws-sdk-cloudwatchevents-native \
    rubygems-aws-sdk-cloudwatchlogs-native \
    rubygems-aws-sdk-codecommit-native \
    rubygems-aws-sdk-codedeploy-native \
    rubygems-aws-sdk-codepipeline-native \
    rubygems-aws-sdk-cognitoidentity-native \
    rubygems-aws-sdk-cognitoidentityprovider-native \
    rubygems-aws-sdk-configservice-native \
    rubygems-aws-sdk-core-native \
    rubygems-aws-sdk-costandusagereportservice-native \
    rubygems-aws-sdk-databasemigrationservice-native \
    rubygems-aws-sdk-dynamodb-native \
    rubygems-aws-sdk-ec2-native \
    rubygems-aws-sdk-ecr-native \
    rubygems-aws-sdk-ecrpublic-native \
    rubygems-aws-sdk-ecs-native \
    rubygems-aws-sdk-efs-native \
    rubygems-aws-sdk-eks-native \
    rubygems-aws-sdk-elasticache-native \
    rubygems-aws-sdk-elasticbeanstalk-native \
    rubygems-aws-sdk-elasticloadbalancing-native \
    rubygems-aws-sdk-elasticloadbalancingv2-native \
    rubygems-aws-sdk-elasticsearchservice-native \
    rubygems-aws-sdk-eventbridge-native \
    rubygems-aws-sdk-firehose-native \
    rubygems-aws-sdk-glue-native \
    rubygems-aws-sdk-guardduty-native \
    rubygems-aws-sdk-iam-native \
    rubygems-aws-sdk-kafka-native \
    rubygems-aws-sdk-kinesis-native \
    rubygems-aws-sdk-kms-native \
    rubygems-aws-sdk-lambda-native \
    rubygems-aws-sdk-organizations-native \
    rubygems-aws-sdk-ram-native \
    rubygems-aws-sdk-rds-native \
    rubygems-aws-sdk-redshift-native \
    rubygems-aws-sdk-route53-native \
    rubygems-aws-sdk-route53domains-native \
    rubygems-aws-sdk-route53resolver-native \
    rubygems-aws-sdk-s3-native \
    rubygems-aws-sdk-secretsmanager-native \
    rubygems-aws-sdk-securityhub-native \
    rubygems-aws-sdk-servicecatalog-native \
    rubygems-aws-sdk-ses-native \
    rubygems-aws-sdk-shield-native \
    rubygems-aws-sdk-sms-native \
    rubygems-aws-sdk-sns-native \
    rubygems-aws-sdk-sqs-native \
    rubygems-aws-sdk-ssm-native \
    rubygems-aws-sdk-states-native \
    rubygems-aws-sdk-transfer-native \
"

SRC_URI[md5sum] = "926844e704452e5d55bb825606a06686"
SRC_URI[sha256sum] = "ceb60c4fffd7b5be7e53ed1970d4bcd3d05e998efe8c44097588ccc5742eff14"

GEM_NAME = "train-aws"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
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
    rubygems-aws-sdk-eventbridge \
    rubygems-aws-sdk-firehose \
    rubygems-aws-sdk-glue \
    rubygems-aws-sdk-guardduty \
    rubygems-aws-sdk-iam \
    rubygems-aws-sdk-kafka \
    rubygems-aws-sdk-kinesis \
    rubygems-aws-sdk-kms \
    rubygems-aws-sdk-lambda \
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
    rubygems-aws-sdk-sms \
    rubygems-aws-sdk-sns \
    rubygems-aws-sdk-sqs \
    rubygems-aws-sdk-ssm \
    rubygems-aws-sdk-states \
    rubygems-aws-sdk-transfer \
"

BBCLASSEXTEND = "native"
