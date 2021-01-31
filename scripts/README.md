# Development tooling

## Prerequisites

Following items needs to be installed on your host

* curl
* python3
* python packages (run `pip3 install --user -f dev-requirements.txt` in this directory)

## Add a new ruby gem

* add `RUBYGEMS_AUTOGEN_TESTS = "1"` to your local.conf
* generate the recipe by running `ruby-gen <path to meta-rubygems>/recipes-rubygems <gemname> <gemversion>`
* build the recipes `bitbake ruby-<gemname> ruby-<gemname>-native`
* add the new recipes to `packagegroups-rubygems/packagegroup-rubygems.bb`

## Testing changes

* run `bitbake core-image-minimal-rubygems`
* run `bitbake core-image-minimal-rubygems -c testimage`

## Contribute

* open a pull request on github
