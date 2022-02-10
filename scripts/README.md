# Development tooling

## Prerequisites

Following items needs to be installed on your host

* curl
* python3
* python packages (run `pip3 install --user -r dev-requirements.txt` in this directory)

## Add a new ruby gem

* add `RUBYGEMS_AUTOGEN_TESTS = "1"` to your local.conf
* generate the recipe by running `ruby-gen <path to meta-rubygems>/recipes-rubygems <gemname>`
* build the recipes `bitbake ruby-<gemname> ruby-<gemname>-native`
* add the new recipes to `packagegroups-rubygems/packagegroup-rubygems.bb`

### Adding gems for a different version of ruby

In case you want to generate gem recipes for a different ruby version than the one on master use
`ruby-gen <path to meta-rubygems>/recipes-rubygems --rubyversion=<rubyversion> <gemname>`

### Adding gems for a specific version of the gem

In case you want to generate gem recipes for a specific gem version use
`ruby-gen <path to meta-rubygems>/recipes-rubygems --gemversion=<gemversion> <gemname>`

## Testing changes

* run `bitbake core-image-minimal-rubygems`
* run `bitbake core-image-minimal-rubygems -c testimage`

## Testing in docker

It is advised to test your changes locally using a minimal docker container

```shell
docker pull privkweihmann/yocto-sca-minimal:latest
docker run -it -v <your tmp dir>/:/opt/build/build-ruby -v <your layer dir>:/opt/build/layer privkweihmann/yocto-sca-minimal
```

from within the docker run

```shell
# for glibc
export TEMPLATECONF=/opt/build/layer/meta-rubygems/conf/variant/rubygems-arm64-glibc
# for musl
# export TEMPLATECONF=/opt/build/layer/meta-rubygems/conf/variant/rubygems-arm64-musl
cd /opt/build
source layer/poky/oe-init-build-env build-ruby/
bitbake core-image-minimal-rubygems -c testimage
```

## Contribute

* open a pull request on github

### Automatic checks

on opening a pull request

* your changes will be build and tested against all supported variants
* a few automated checks will be performed

all pipelines need to pass before your change can be merged
