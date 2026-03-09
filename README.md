# meta-rubygems

A layer providing gems for Ruby.

## Tested variants

The following variants are tested regularly:

| variant   | glibc                                                                                                                                         |
| --------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| qemuarm64 | ![[master]-[glibc]-[qemuarm64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemuarm64%5D/badge.svg) |

Other variants most likely will work.
Feel free to contribute any needed patches.

### Tested revisions

Up to the following revisions automated checks being performed

* openembedded-core: be8cdcf13a658e9e81ff2f7b71d1c8c37a920ce7
* meta-yocto: f3b63d0d6882af61020bd6f7150fae68a0322f63
* bitbake: bc8be83aef0a6de85cd33a6f132f281d518594f7
* meta-openembedded: 6ba45c1f94e1c2015df940ec9efcd4568346df56

## Support

This layer is a rolling release.
Integration is continuously checked against the respective [revisions](#tested-revisions) of the corresponding layers.
Don't expect tags or any kind of versioning.

## 4.0 transition note

With Ruby 4.0 it doesn't look like rubygems is inherited automatically.
To load any of the provided gems you need to include

```shell
export RUBYOPT="-rrubygems"
```

or

```ruby
require 'rubygems'
```

or

```shell
ruby -r rubygems <script name>
```

### poky release mapping

please check the following table to pick the correct branch matching your poky version

| poky release | suggested meta-rubygems branch | ruby version | maintainer     |
| ------------ | ------------------------------ | ------------ | -------------- |
| master       | master                         | 4.0.x        | priv-kweihmann |
| whinlatter   | whinlatter                     | 3.4.x        | n.a.           |
| kirkstone    | kirkstone                      | 3.1.x        | n.a.           |
| honister     | hardknott                      | 3.0.x        | n.a.           |
| hardknott    | hardknott                      | 3.0.x        | n.a.           |
| gatesgarth   | dunfell                        | 2.7.x        | n.a.           |
| dunfell      | dunfell                        | 2.7.x        | n.a.           |
| zeus         | zeus                           | 2.5.x        | n.a.           |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
