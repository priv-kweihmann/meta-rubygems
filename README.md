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

* openembedded-core: c2bd43b373d65d717e606cab3793b8a64facd946
* meta-yocto: 8a8f9ad79e3d50312566620998dadff0aa29c7a7
* bitbake: 3a99c26fa581d70ed67bd08a5e0e0d0b18369a7c
* meta-openembedded: 7b4333942bba7bc468ed5cae4a05ada7f75ee434

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

| poky release | suggested meta-rubygems branch                  | ruby version | maintainer     |
| ------------ | ----------------------------------------------- | ------------ | -------------- |
| master       | master                                          | 4.0.x        | priv-kweihmann |
| wrynose      | master@dba6dfb9106584ce464d9d9c968f821b94b9a01f | 4.0.x        | n.a.           |
| whinlatter   | whinlatter                                      | 3.4.x        | n.a.           |
| walnascar    | master@2fe6f64072ba95c87e6beaa1c2856772ed71dead | 3.4.x        | n.a.           |
| styhead      | master@906b2f637fbf5acee11fe23b313254b0739b4fba | 3.3.x        | n.a.           |
| scarthgap    | master@f023803dfeae8d5e5414b5feb4b7dce2b5ff55d3 | 3.3.x        | n.a.           |
| nanbield     | master@b0baf72297f3f521ec76195ec1b8acca499aee44 | 3.2.x        | n.a.           |
| mickledore   | master@b0baf72297f3f521ec76195ec1b8acca499aee44 | 3.2.x        | n.a.           |
| langdale     | master@ef8ad0e8632125f73410bed3da125a108860dd38 | 3.1.x        | n.a.           |
| kirkstone    | kirkstone                                       | 3.1.x        | n.a.           |
| honister     | hardknott                                       | 3.0.x        | n.a.           |
| hardknott    | hardknott                                       | 3.0.x        | n.a.           |
| gatesgarth   | dunfell                                         | 2.7.x        | n.a.           |
| dunfell      | dunfell                                         | 2.7.x        | n.a.           |
| zeus         | zeus                                            | 2.5.x        | n.a.           |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
