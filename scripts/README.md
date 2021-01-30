# Development tooling

## Prerequisites

Following items needs to be installed on your host

* curl
* python3
* python packages (run `pip3 install --user dev-requirements.txt` in this directory)

## Add a new ruby gem

* generate the recipe by running `ruby-gen <path to meta-rubygems>/recipes-rubygems <gemname> <gemversion>
* build the recipes `bitbake ruby-<gemname> ruby-<gemname>-native`
* generate test cases `bitbake ruby-<gemname> ruby-<gemname>-native -c do_rubygems_gen_test`

## Testing changes

* run `bitbake core-image-minimal-rubygems`
* run `bitbake core-image-minimal-rubygems -c testimage`

## Contribute

* open a pull request on github
